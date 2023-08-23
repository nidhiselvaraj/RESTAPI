package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Paymenttablemodel;
import com.example.demo.repository.Paymenttablerepository;

@Service
public class Paymenttableservice {

	
	@Autowired
	Paymenttablerepository p;
	public Paymenttablemodel saveinfo(Paymenttablemodel ss)
	{
		return p.save(ss);
	}
	public List<Paymenttablemodel> showinfo()
	{
		return p.findAll();
	}
	public Paymenttablemodel updateinfo(Paymenttablemodel ss)
	{
		return p.saveAndFlush(ss);
	}
	public void deleteinfo(Paymenttablemodel ss)
	{
		p.delete(ss);
		
	}
}
