package service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.MemberVO;
import repository.MemberDAO;
import repository.MemberDAOImpl;


public class MemberServiceImpl implements MemberService {

	private static final Logger log = LoggerFactory.getLogger(MemberServiceImpl.class);
	private MemberDAO mdao;
	
	public MemberServiceImpl() {
		mdao = new MemberDAOImpl();
	}
	
	@Override
	public int register(MemberVO mvo) {
		log.info("register service 진입!");
		
		return mdao.insert(mvo);
	}

	@Override
	public MemberVO login(MemberVO mvo) {
		log.info("login service 진입!");
		return mdao.login(mvo);
	}

	@Override
	public int logout(String id) {
		log.info("logout service 진입");
		return mdao.logout(id);
	}

	@Override
	public List<MemberVO> list() {
		log.info("list service 진입");
		return mdao.selectList();
	}

	@Override
	public int edit(MemberVO mvo) {
		log.info("edit service 진입");
		return mdao.editOne(mvo);
	}






}
