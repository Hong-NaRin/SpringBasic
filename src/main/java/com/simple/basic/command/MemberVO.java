package com.simple.basic.command;

import java.util.ArrayList;

public class MemberVO { // VO => value object ( =DTO와 비슷함 )
	
	private String id;
	private String pw;
	private ArrayList<String> ineter;
	
	// 기본 생성자
	public MemberVO() {
		
	}
	
	public MemberVO(String id, String pw, ArrayList<String> ineter) {
		super();
		this.id = id;
		this.pw = pw;
		this.ineter = ineter;
	}
	
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pw=" + pw + ", ineter=" + ineter + "]";
	}

	// getter, setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public ArrayList<String> getIneter() {
		return ineter;
	}

	public void setIneter(ArrayList<String> ineter) {
		this.ineter = ineter;
	}	
}
