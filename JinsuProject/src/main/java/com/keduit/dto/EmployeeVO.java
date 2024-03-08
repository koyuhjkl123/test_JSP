package com.keduit.dto;

import java.sql.Timestamp;

public class EmployeeVO {
	
	
	private String userid;
	private String pass;
	private String name;
	private String lev;
	private Timestamp enter;
	private String gender;
	private String phone;
	
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLev() {
		return lev;
	}
	public void setLev(String lev) {
		this.lev = lev;
	}
	public Timestamp getEnter() {
		return enter;
	}
	public void setEnter(Timestamp enter) {
		this.enter = enter;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	@Override
	public String toString() {
		return "EmployeeVO [userid=" + userid + ", pass=" + pass + ", name=" + name + ", lev=" + lev + ", enter="
				+ enter + ", gender=" + gender + ", phone=" + phone + "]";
	}
	

}
