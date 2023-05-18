package domain;

public class BoardVO {
/*
create table board(
bno int not null auto_increment,
title varchar(100) not null,
writer varchar(100) not null,
content text,
read_count int default 0,
reg_date datetime default now(),
like_count int default 0,
primary key(bno));
*/
	
	private int bno;
	private String title;
	private String writer;
	private String content;
	private int read_count;
	private String reg_date;
	private int like_count;
	
	// 생성자
	public BoardVO() {}

	
	public BoardVO(int bno) {
		this.bno = bno;
	}
	
	public BoardVO(String writer) {
		this.writer = writer;
	}
	
	// 글쓰기 생성자 title, writer, content
	public BoardVO(String title, String writer, String content) {
		super();
		this.title = title;
		this.writer = writer;
		this.content = content;
	}
	
	// 리스트 생성자 bno, title, writer, reg_date, read_count, like_count
	public BoardVO(int bno, String title, String writer, int read_count, String reg_date, int like_count) {
		this.bno = bno;
		this.title = title;
		this.writer = writer;
		this.read_count = read_count;
		this.reg_date = reg_date;
		this.like_count = like_count;
	}


	// 글 상세보기 생성자 전체
	public BoardVO(int bno, String title, String writer, String content, int read_count, String reg_date,
			int like_count) {
		this.bno = bno;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.read_count = read_count;
		this.reg_date = reg_date;
		this.like_count = like_count;
	}

	// 글수정 생성자 bno, title, content
	public BoardVO(int bno, String title, String content) {
		super();
		this.bno = bno;
		this.title = title;
		this.content = content;
	}



	public int getBno() {
		return bno;
	}



	public void setBno(int bno) {
		this.bno = bno;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
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



	public int getRead_count() {
		return read_count;
	}



	public void setRead_count(int read_count) {
		this.read_count = read_count;
	}



	public String getReg_date() {
		return reg_date;
	}



	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}



	public int getLike_count() {
		return like_count;
	}



	public void setLike_count(int like_count) {
		this.like_count = like_count;
	}


	// toString
	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", title=" + title + ", writer=" + writer + ", content=" + content
				+ ", read_count=" + read_count + ", reg_date=" + reg_date + ", like_count=" + like_count + "]";
	}
	
	
}
