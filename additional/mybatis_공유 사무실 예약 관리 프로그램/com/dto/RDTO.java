package com.dto;

public class RDTO {

	int place_no;
	int client_no;
	char end_use;
	String res_date;
	int res_no;
	
	String client_nm;
	String place_nm;
	String place_ard;
	
	public RDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public RDTO(int place_no, int client_no, char end_use, String res_date, int res_no) {
		this.place_no = place_no;
		this.client_no = client_no;
		this.end_use = end_use;
		this.res_date = res_date;
		this.res_no = res_no;
	}
	
	public RDTO(int client_no, String res_date, String client_nm, String place_nm) {
		this.client_no = client_no;
		this.res_date = res_date;
		this.client_nm = client_nm;
		this.place_nm = place_nm;
	}
	
	public RDTO(int client_no, String res_date, String client_nm, String place_nm, String place_ard) {
		this.client_no = client_no;
		this.res_date = res_date;
		this.client_nm = client_nm;
		this.place_nm = place_nm;
		this.place_ard = place_ard;
	}

	public int getPlace_no() {
		return place_no;
	}
	public void setPlace_no(int place_no) {
		this.place_no = place_no;
	}
	public int getClient_no() {
		return client_no;
	}
	public void setClient_no(int clinet_no) {
		this.client_no = clinet_no;
	}
	public char getEnd_use() {
		return end_use;
	}
	public void setEnd_use(char end_use) {
		this.end_use = end_use;
	}
	public String getRes_date() {
		return res_date;
	}
	public void setRes_date(String res_date) {
		this.res_date = res_date;
	}
	
	public int getRes_no() {
		return res_no;
	}
	public void setRes_no(int res_no) {
		this.res_no = res_no;
	}
	
	public String getClient_nm() {
		return client_nm;
	}

	public void setClient_nm(String client_nm) {
		this.client_nm = client_nm;
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
		return "RDTO [place_no=" + place_no + ", clinet_no=" + ", end_use=" + end_use + ", res_date="
				+ res_date + ", res_no=" + res_no + "]";
	}
	
	
	
	
}
