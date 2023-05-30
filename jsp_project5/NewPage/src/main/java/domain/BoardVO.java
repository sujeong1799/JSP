package domain;

public class BoardVO {
/*
create table board(
bNum int not null auto_increment,
bTitle varchar(100) not null,
bWriter varchar(100) not null,
bContent text not null,
bCount int default 0,
reg_date datetime default now(),
Primary key(bNum));
*/
	
	private int bNum;
	private String bTitle;
	private String bWriter;
	private String bContent;
	private int bCount;
	private String reg_date;
	
	//생성자
	
	public BoardVO() {}

	// 글 등록 생성자 bTitle, bWriter, bContent
	public BoardVO(String bTitle, String bWriter, String bContent) {
		this.bTitle = bTitle;
		this.bWriter = bWriter;
		this.bContent = bContent;
	}

	// 글 리스트 생성자 bNum, bTitle, bWriter, bCount, reg_date
	public BoardVO(int bNum, String bTitle, String bWriter, int bCount, String reg_date) {
		this.bNum = bNum;
		this.bTitle = bTitle;
		this.bWriter = bWriter;
		this.bCount = bCount;
		this.reg_date = reg_date;
	}

	// 글 상세보기 생성자 bNum, bTitle, bWriter, bContent, bCount, reg_date 
	public BoardVO(int bNum, String bTitle, String bWriter, String bContent, int bCount, String reg_date) {
		this.bNum = bNum;
		this.bTitle = bTitle;
		this.bWriter = bWriter;
		this.bContent = bContent;
		this.bCount = bCount;
		this.reg_date = reg_date;
	}	
	
	// 글 수정 생성자 bNum, bTitle, bContent
	public BoardVO(int bNum, String bTitle, String bContent) {
		this.bNum = bNum;
		this.bTitle = bTitle;
		this.bContent = bContent;
	}

	public int getbNum() {
		return bNum;
	}

	public void setbNum(int bNum) {
		this.bNum = bNum;
	}

	public String getbTitle() {
		return bTitle;
	}

	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}

	public String getbWriter() {
		return bWriter;
	}

	public void setbWriter(String bWriter) {
		this.bWriter = bWriter;
	}

	public String getbContent() {
		return bContent;
	}

	public void setbContent(String bContent) {
		this.bContent = bContent;
	}

	public int getbCount() {
		return bCount;
	}

	public void setbCount(int bCount) {
		this.bCount = bCount;
	}

	public String getReg_date() {
		return reg_date;
	}

	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	
	

	@Override
	public String toString() {
		return "BoardVO [bNum=" + bNum + ", bTitle=" + bTitle + ", bWriter=" + bWriter + ", bContent=" + bContent
				+ ", bCount=" + bCount + ", reg_date=" + reg_date + "]";
	}
	
	
	
	
	
	
	

}
