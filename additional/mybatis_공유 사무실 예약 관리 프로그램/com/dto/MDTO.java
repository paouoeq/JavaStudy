package com.dto;

public class MDTO {

	int manager_no;
	String manager_id;
	String manager_pw;
	String phone;
	
	public MDTO() {
		// TODO Auto-generated constructor stub
	}
	public MDTO(String manager_id, String manager_pw, String phone) {
		this.manager_id = manager_id;
		this.manager_pw = manager_pw;
		this.phone = phone;
	}
	
	public int getManager_no() {
		return manager_no;
	}
	public void setManager_no(int manager_no) {
		this.manager_no = manager_no;
	}
	public String getManager_id() {
		return manager_id;
	}
	public void setManager_id(String manager_id) {
		this.manager_id = manager_id;
	}
	public String getManager_pw() {
		return manager_pw;
	}
	public void setManager_pw(String manager_pw) {
		this.manager_pw = manager_pw;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "MDTO [manager_no=" + manager_no + ", manager_id=" + manager_id + ", manager_pw=" + manager_pw
				+ ", phone=" + phone + "]";
	}
	
	
}
