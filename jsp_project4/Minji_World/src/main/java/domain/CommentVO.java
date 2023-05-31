package domain;

public class CommentVO {
/*
 Create table comment(
cno int not null auto_increment,
bno int default 0,
writer varchar(100)default "익명",
content varchar(300) not null,
reg_date datetime default now(),
Primary key(cno));
 */	
	private int cno;
	private int bno;
	private String writer;
	private String content;
	private String reg_date;
	
	public CommentVO() {}

	// 댓글 생성 bno, writer, content
	public CommentVO(int bno, String writer, String content) {
		this.bno = bno;
		this.writer = writer;
		this.content = content;
	}
	
	
	// 댓글 보기 cno, writer, content
	public CommentVO(String writer, String content, int cno) {
		this.writer = writer;
		this.content = content;
		this.cno = cno;
	}
	
	// 댓글 수정 cno content
	public CommentVO(int cno, String content) {
		this.cno = cno;
		this.content = content;
	}
	
	// 전체 생성자
	
	public CommentVO(int cno, int bno, String writer, String content, String reg_date) {
		this.cno = cno;
		this.bno = bno;
		this.writer = writer;
		this.content = content;
		this.reg_date = reg_date;
	}

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getReg_date() {
		return reg_date;
	}

	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	
	
	// toString

	@Override
	public String toString() {
		return "CommentVO [cno=" + cno + ", bno=" + bno + ", writer=" + writer + ", content=" + content + ", reg_date="
				+ reg_date + "]";
	}
	

}
