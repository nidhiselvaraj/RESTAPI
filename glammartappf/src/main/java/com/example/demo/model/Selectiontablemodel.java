package com.example.demo.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Selection")
public class Selectiontablemodel {

	@Id
	private int loginid;
	private int age;
	private String gender;
	private String productname;
	public Selectiontablemodel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Selectiontablemodel(int loginid, int age, String gender, String productname) {
		super();
		this.loginid = loginid;
		this.age = age;
		this.gender = gender;
		this.productname = productname;
	}
	public int getLoginid() {
		return loginid;
	}
	public void setLoginid(int loginid) {
		this.loginid = loginid;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	
	
}
