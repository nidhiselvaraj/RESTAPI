    package com.example.demo.model;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Usertablemodel {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private int phoneno;
	private String location;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="custid")
	private List<Productstablemodel> pro;
	public Usertablemodel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Usertablemodel(int id, String name, int phoneno, String location, List<Productstablemodel> pro) {
		super();
		this.id = id;
		this.name = name;
		this.phoneno = phoneno;
		this.location = location;
		this.pro = pro;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<Productstablemodel> getPro() {
		return pro;
	}
	public void setPro(List<Productstablemodel> pro) {
		this.pro = pro;
	}
	
}
