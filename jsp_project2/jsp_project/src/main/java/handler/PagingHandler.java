package handler;

import domain.PagingVO;

public class PagingHandler {
	
	private int startPage; // 실제 화면에서 보여지는 시작페이지네이션번호 
	private int endPage;   // 실제 화면에서 보여지는 끝 페이지네이션번호
	private boolean prev, next; // 이전, 다음 버튼 존재 여부
	
	private int totalCount; // 총 게시물 수
	private PagingVO pgvo;
	
	public PagingHandler(PagingVO pgvo, int totalCount) {
		this.pgvo = pgvo;
		this.totalCount = totalCount;
		// 나머지 값 계산
		// ex) 127개의 게시글 페이지네이션 번호? 1~13까지 필요
		// 현재페이지에 보이는 것 startPage = 1, endPage = 10 (다음)
		// 다음 페이지를 누르고나서 11페이지에서 보여야 하는거 (이전) startPage = 11, endPage = 13
		
		//페이지 번호 / 한 화면의 게시글 수 * 한 화면의 게시글 수 
		// (1 / 10) * 10 => 0.1(1) * 10 => 10 
		// (2 / 10) * 10 => 0.5(1) * 10 => 10, 20, 30... 이렇게 감 난 13페이지까지 나와야해 20까지 가면 안됨.
		// (21 / 10) * 10 => 2.1(3) * 10 => 30
		// 1~10페이지까지 endPage = 10이다.
		// 11~13페이지까지 endPage = 13
		//  pgvo.getQty()*1.0에서 1.0을 곱하는 이유는? 소수점을 남기기 위해서
		this.endPage = (int)(Math.ceil(pgvo.getPageNo() / (pgvo.getQty()*1.0)))*pgvo.getQty();
		this.startPage = this.endPage-9;
		int realEndPage = (int)Math.ceil((totalCount*1.0) / pgvo.getQty()); // 13페이지로 나올거임 
		if(realEndPage < this.endPage) { // realEnd가 더 작다면
			this.endPage = realEndPage;
		}
		
		// 현재화면에서 보여지는 startpage = 1, 11, 21
		this.prev = this.startPage > 1; // 존재여부 (1보다 크면 11이 됐다는 소리니께 true값이 들어가겠지?)
		this.next = this.endPage < realEndPage; // endpage가 작으면 next(다음)이 있어야한다.
	}
	
	public int getStartPage() {
		return startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public PagingVO getPgvo() {
		return pgvo;
	}

	public void setPgvo(PagingVO pgvo) {
		this.pgvo = pgvo;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	
	
	
}
