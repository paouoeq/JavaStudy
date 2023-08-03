package com.dto;

public class StudentDTO {
	String stuNo;
	String departNo;
	String sutName;
	String sutSsn;
	String sutAddress;
	String entDate;
	char absYn;
	String coachProfessorNo;
	public StudentDTO() {
		// TODO Auto-generated constructor stub
	}

	public StudentDTO(String stuNo, String departNo, String sutName, String sutSsn, String sutAddress, String entDate,
			char absYn, String coachProfessorNo) {
		this.stuNo = stuNo;
		this.departNo = departNo;
		this.sutName = sutName;
		this.sutSsn = sutSsn;
		this.sutAddress = sutAddress;
		this.entDate = entDate;
		this.absYn = absYn;
		this.coachProfessorNo = coachProfessorNo;
	}
	public String getStuNo() {
		return stuNo;
	}
	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}
	public String getDepartNo() {
		return departNo;
	}
	public void setDepartNo(String departNo) {
		this.departNo = departNo;
	}
	public String getSutName() {
		return sutName;
	}
	public void setSutName(String sutName) {
		this.sutName = sutName;
	}
	public String getSutSsn() {
		return sutSsn;
	}
	public void setSutSsn(String sutSsn) {
		this.sutSsn = sutSsn;
	}
	public String getSutAddress() {
		return sutAddress;
	}
	public void setSutAddress(String sutAddress) {
		this.sutAddress = sutAddress;
	}
	public String getEntDate() {
		return entDate;
	}
	public void setEntDate(String entDate) {
		this.entDate = entDate;
	}
	public char getAbsYn() {
		return absYn;
	}
	public void setAbsYn(char absYn) {
		this.absYn = absYn;
	}
	public String getCoachProfessorNo() {
		return coachProfessorNo;
	}
	public void setCoachProfessorNo(String coachProfessorNo) {
		this.coachProfessorNo = coachProfessorNo;
	}
	@Override
	public String toString() {
		return  stuNo + "\t" + sutName + "\t" + sutSsn
				+ "\t" + sutAddress + "\t\t" + entDate + "\t" + absYn;
	}
	
	
}
