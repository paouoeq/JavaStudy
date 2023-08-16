package com.dto;

public class PDTO {

	int place_no;
	int manager_no;
	String place_nm;
	String place_ard;
	public PDTO() {
		// TODO Auto-generated constructor stub
	}
	public PDTO(int place_no, int manager_no, String place_nm, String place_ard) {
		this.place_no = place_no;
		this.manager_no = manager_no;
		this.place_nm = place_nm;
		this.place_ard = place_ard;
	}
	public int getPlace_no() {
		return place_no;
	}
	public void setPlace_no(int place_no) {
		this.place_no = place_no;
	}
	public int getManager_no() {
		return manager_no;
	}
	public void setManager_no(int manager_no) {
		this.manager_no = manager_no;
	}
	public String getPlace_nm() {
		return place_nm;
	}
	public void setPlace_nm(String place_nm) {
		this.place_nm = place_nm;
	}
	public String getPlace_ard() {
		return place_ard;
	}
	public void setPlace_ard(String place_ard) {
		this.place_ard = place_ard;
	}
	@Override
	public String toString() {
		return "PDTO [place_no=" + place_no + ", manager_no=" + manager_no + ", place_nm=" + place_nm + ", place_ard="
				+ place_ard + "]";
	}
	
	
}
