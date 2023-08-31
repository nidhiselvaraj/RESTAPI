 package com.example.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Paymenttablemodel {
	@Id
	private int upiid;
	private long accno;
	private String paymentstatus;
	private String paymenttype;
	private int phoneno; 
	//One to one mapping
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_name")
	private Deliverytablemodel d;
	public Paymenttablemodel(int upiid, long accno, String paymentstatus, String paymenttype, int phoneno,
			Deliverytablemodel d) {
		super();
		this.upiid = upiid;
		this.accno = accno;
		this.paymentstatus = paymentstatus;
		this.paymenttype = paymenttype;
		this.phoneno = phoneno;
		this.d = d;
	}
	public Paymenttablemodel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUpiid() {
		return upiid;
	}
	public void setUpiid(int upiid) {
		this.upiid = upiid;
	}
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	public String getPaymentstatus() {
		return paymentstatus;
	}
	public void setPaymentstatus(String paymentstatus) {
		this.paymentstatus = paymentstatus;
	}
	public String getPaymenttype() {
		return paymenttype;
	}
	public void setPaymenttype(String paymenttype) {
		this.paymenttype = paymenttype;
	}
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	public Deliverytablemodel getD() {
		return d;
	}
	public void setD(Deliverytablemodel d) {
		this.d = d;
	}
	
}
