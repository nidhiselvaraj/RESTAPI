package com.example.demo.model;

import java.time.LocalDate;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity  
public class Deliverytablemodel {

	  
	private String name;
	@Id
	private String address;
	private LocalDate date;
	private int pincode;
	public Deliverytablemodel(String name, String address, LocalDate date, int pincode) {
		super();
		this.name = name;
		this.address = address;
		this.date =     date;
		this.pincode = pincode;
	}
	public Deliverytablemodel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
}
