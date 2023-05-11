package domain;

public class ProductVO {

/*
pno int not null auto_increment,
pname varchar(30) not null,
price int not null,
regdate datetime default now(),
madeby varchar(50),
primary key(pno));
*/
	
//	데이터에 있는 속성이름이랑 java에 있는 이름이 다르면 헷갈리니까 똑같이 만들자
	
	private int pno;
	private String pname;
	private int price;
	private String regdate;
	private String madeby;
	
	
	//생성자
	
	public ProductVO() {}


	//상품등록 pname, price, madeby (pno, regdate는 자동으로 들어감)
	public ProductVO(String pname, int price, String madeby) {
		this.pname = pname;
		this.price = price;
		this.madeby = madeby;
	}
	
	
	
	//상품 리스트 pno, pname, regdate
	public ProductVO(int pno, String pname, String regdate) {
		this.pno = pno;
		this.pname = pname;
		this.regdate = regdate;
	}

	
	//상품 수정 pno, pname, price, madeby
	public ProductVO(int pno, String pname, int price, String madeby) {
		// 생성자 호출 (코드가 짧아지죠?)
		this(pname, price, madeby);
		this.pno = pno;
	}
	
	//상품 상세페이지 pno, pname, price, regdate, madeby
	public ProductVO(int pno, String pname, int price, String regdate, String madeby) {
		this.pno = pno;
		this.pname = pname;
		this.price = price;
		this.regdate = regdate;
		this.madeby = madeby;
	}

	
	
	

	public int getPno() {
		return pno;
	}


	public void setPno(int pno) {
		this.pno = pno;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getRegdate() {
		return regdate;
	}


	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}


	public String getMadeby() {
		return madeby;
	}


	public void setMadeby(String madeby) {
		this.madeby = madeby;
	}


	@Override
	public String toString() {
		return "ProdcutVO [pno=" + pno + ", pname=" + pname + ", price=" + price + ", regdate=" + regdate + ", madeby="
				+ madeby + "]";
	}



	
	
	
}
