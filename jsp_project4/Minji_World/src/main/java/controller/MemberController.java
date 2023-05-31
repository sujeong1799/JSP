package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.MemberVO;
import service.MemberService;
import service.MemberServiceImpl;


@WebServlet("/mem/*")
public class MemberController extends HttpServlet {
   private static final long serialVersionUID = 1L;
   private static final Logger log = LoggerFactory.getLogger(MemberController.class);
   private RequestDispatcher rdp;
   private MemberService msv;
   private int isOk;
   private String destPage;
   
   
  
    public MemberController() {
        msv = new MemberServiceImpl();
    }


   protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      request.setCharacterEncoding("utf-8");
      response.setCharacterEncoding("utf-8"); 
      response.setContentType("text/html; charset=utf-8");
      
      String uri = request.getRequestURI();
      System.out.println(">>> uri  " + uri);
      String path = uri.substring(uri.lastIndexOf("/")+1);
      log.info(">>path: " +path);
      
      
      switch(path) {
      case "join":
    	  destPage = "/member/join.jsp";
         break;
         
      case "register":
    	  try {
    		  String id = request.getParameter("id");
    		  String password = request.getParameter("password");
    		  String phone = request.getParameter("phone");
    		  int birth = Integer.parseInt(request.getParameter("birth")) ;
    		  MemberVO mvo = new MemberVO(id,password, phone, birth);
    		  log.info(">>>>> mvo "+mvo);
    		  isOk = msv.register(mvo);
    		  log.info(">>> JOIN > " + (isOk > 0 ? "성공" : "실패"));
		} catch (Exception e) {
			e.printStackTrace();
		}
         destPage = "/";
         break;
         
      case "login":
    	  destPage="/member/login.jsp";
    	  break;
         
      case "login_auth":
    	  try {
    		  String id = request.getParameter("id");
    		  String password = request.getParameter("password");
    		  
    		  MemberVO mvo = new MemberVO(id, password);
    		  log.info(">>> login 요청 " + mvo);
    		  
    		  MemberVO loginMvo = msv.login(mvo);
    		  
    		  if(loginMvo !=null) {
    			  
    			  HttpSession ses = request.getSession();
    			  ses.setAttribute("ses", loginMvo);
    			  ses.setMaxInactiveInterval(10*60);
    		  }else {
    			  request.setAttribute("msg_login", 0);
    		  }
    		  
		} catch (Exception e) {
			e.printStackTrace();
		}
    	  destPage="/";
    	  break;
    	  
      case "logout":
    	  try {
    		  HttpSession ses = request.getSession();
    		  MemberVO mvo = (MemberVO) ses.getAttribute("ses");
    		  String id = mvo.getId();
    		  log.info(">>> login id : "+id);
    		  
    		  isOk = msv.logout(id);
    		  log.info(">>> logout > " + (isOk > 0 ? "성공":"실패"));
    		  
    		  ses.invalidate();
    		  destPage="/";
		} catch (Exception e) {
			e.printStackTrace();
		}
    	  break;
    	  
      case "list":
    	  try {
			List<MemberVO> list = new ArrayList<MemberVO>();
			list = msv.list();
			request.setAttribute("list", list);
			log.info(">>> list 출력 완료");
			destPage = "/member/list.jsp";
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    	  
    	  break;
      case "modify":
    	  	destPage="/member/modify.jsp";
    	  break;
    	  
      case "edit":
    	  try {
    		String id = request.getParameter("id");
			String password = request.getParameter("password");
			String phone = request.getParameter("phone");
			int birth = Integer.parseInt(request.getParameter("birth"));
			
			MemberVO mvo = new MemberVO(id, password, phone, birth);
			isOk = msv.edit(mvo);
			log.info(">>> edit > "+ (isOk > 0 ? "성공" : "실패"));
			log.info(">>> modify 완료, session 변경시작");
			msv.login(mvo);
			HttpSession ses = request.getSession();
			ses.setAttribute("ses", mvo);
			log.info(">>> session 변경 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    	  destPage = "login_auth";
    	  
    	  break;
      }
      
      rdp = request.getRequestDispatcher(destPage);
      rdp.forward(request, response);
      
   }


   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      service(request, response);
   }


   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      service(request, response);
   }

}