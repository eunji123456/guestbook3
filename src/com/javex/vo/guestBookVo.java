package com.javex.vo;

public class guestBookVo {
	private int no;
	private String name ;
	private String password;
	private String content;
	private String regDate;
	
	public guestBookVo () {}
	
	public guestBookVo(String name, String password, String content) {
		super();
		this.name = name;
		this.password = password;
		this.content = content;
	}
	
	
	
	
	public guestBookVo(int no, String password) {
		super();
		this.no = no;
		this.password = password;
	}

	public guestBookVo(int no, String name, String password, String content, String regDate) {
			super();
			this.no = no;
			this.name = name;
			this.password = password;
			this.content = content;
			this.regDate = regDate;
		}

	///게터세터 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContent() {
		return content;
	}

	@Override
	public String toString() {
		return "guestBookVo [no=" + no + ", name=" + name + ", pss=" + password + ", content=" + content + ", writedate="
				+ regDate + "]";
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
	




	
}
