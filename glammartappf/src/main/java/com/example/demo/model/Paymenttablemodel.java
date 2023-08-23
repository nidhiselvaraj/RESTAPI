package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Paymenttablemodel {
    
	@Id
	private int upiid;
	private long accno;
	private String paymentstatus;
	private String paymenttype;
	private int phoneno;
	public Paymenttablemodel(int upiid, long accno, String paymentstatus, String paymenttype, int phoneno) {
		super();
		this.upiid = upiid;
		this.accno = accno;
		this.paymentstatus = paymentstatus;
		this.paymenttype = paymenttype;
		this.phoneno = phoneno;
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
	public Paymenttablemodel() {
		super();
		// TODO Auto-generated constructor stub
	}
}
