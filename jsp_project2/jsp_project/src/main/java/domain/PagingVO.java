package domain;

public class PagingVO {
	
	private int pageNo; // 현재 화면에 출력되는 페이지네이션 번호 (이전) 1, 2, 3, 4, ... (다음) 
						// 게시물이 늘때마다 페이지네이션은 생성되어야함.
	private int qty; // 한 페이지에 보여줄 게시물 수 => 10개
	
	public PagingVO() { // 페이지네이션을 클릭하기전 기본 값으로 지정, 처음에 페이지가 딱 나오면 1번이 무조건 보임
		this(1, 10);
		
	}
	
	public PagingVO(int pageNo, int qty) {
		this.pageNo = pageNo;
		this.qty = qty;
	}
	
	// 
	public int getPageStart() {
		return (this.pageNo-1)*10; //시작 limit 번지 구하기
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
	
	
	
}
