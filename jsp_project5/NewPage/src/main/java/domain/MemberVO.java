package domain;

public class MemberVO {

/*
create table member(
mId varchar(100) not null,
mPassword varchar(100) not null,
mPhone varchar(50) not null,
mBirth int,
reg_date datetime default now(),
last_login datetime,
Primary key(mId));
*/
	
	private String mId;
	private String mPassword;
	private String mPhone;
	private int mBirth;
	private String reg_date;
	private String last_login;
	
	//생성자
	public MemberVO() {}

	// 회원등록 생성자 mId, mPassword, mPhone, mBirth
	public MemberVO(String mId, String mPassword, String mPhone, int mBirth) {
		this.mId = mId;
		this.mPassword = mPassword;
		this.mPhone = mPhone;
		this.mBirth = mBirth;
	}

	
	// 로그인 생성자 mId, mPassword
	public MemberVO(String mId, String mPassword) {
		this.mId = mId;
		this.mPassword = mPassword;
	}

	
	// 회원정보리스트 생성자 mId, mBirth, reg_date, last_login
	public MemberVO(String mId, int mBirth, String reg_date, String last_login) {
		this.mId = mId;
		this.mBirth = mBirth;
		this.reg_date = reg_date;
		this.last_login = last_login;
	}

	
	// 회원정보상세 생성자 mId, mPhone, mBirth, reg_date, last_login
	public MemberVO(String mId, String mPhone, int mBirth, String reg_date, String last_login) {
		this.mId = mId;
		this.mPhone = mPhone;
		this.mBirth = mBirth;
		this.reg_date = reg_date;
		this.last_login = last_login;
	}

	
	// 회원정보수정 생성자 mPassword, mPhone, mBirth
	public MemberVO(String mPassword, String mPhone, int mBirth) {
		this.mPassword = mPassword;
		this.mPhone = mPhone;
		this.mBirth = mBirth;
	}

	public MemberVO(String mId, String mPassword, String mPhone, int mBirth, String reg_date, String last_login) {
		this.mId = mId;
		this.mPassword = mPassword;
		this.mPhone = mPhone;
		this.mBirth = mBirth;
		this.reg_date = reg_date;
		this.last_login = last_login;
	}

	
	
	// getter / setter
	
	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public String getmPassword() {
		return mPassword;
	}

	public void setmPassword(String mPassword) {
		this.mPassword = mPassword;
	}

	public String getmPhone() {
		return mPhone;
	}

	public void setmPhone(String mPhone) {
		this.mPhone = mPhone;
	}

	public int getmBirth() {
		return mBirth;
	}

	public void setmBirth(int mBirth) {
		this.mBirth = mBirth;
	}

	public String getReg_date() {
		return reg_date;
	}

	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}

	public String getLast_login() {
		return last_login;
	}

	public void setLast_login(String last_login) {
		this.last_login = last_login;
	}
	
	
	
}
