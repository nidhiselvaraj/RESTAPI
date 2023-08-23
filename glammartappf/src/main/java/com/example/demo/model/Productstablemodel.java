package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Productstablemodel {
	
	@Id
	private int proid;
	private String proname;
	private int quantity;
	private int protype;
	public Productstablemodel(int proid, String proname, int quantity, int protype) {
		super();
		this.proid = proid;  
		this.proname = proname;
		this.quantity = quantity;
		this.protype = protype;
	}
	public int getProid() {
		return proid;
	}
	public void setProid(int proid) {
		this.proid = proid;
	}
	public String getProname() {
		return proname;
	}
	public void setProname(String proname) {
		this.proname = proname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getProtype() {
		return protype;
	}
	public void setProtype(int protype) {
		this.protype = protype;
	}
	public Productstablemodel() {
		super();
		// TODO Auto-generated constructor stub
	}

}
