package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Deliverytablemodel;
import com.example.demo.repository.Delivertablerepository;

@Service
public class Deliverytableservice {

	@Autowired
	Delivertablerepository p;
	public List<Deliverytablemodel> saveinf(List<Deliverytablemodel> ss)
	{
		return (List<Deliverytablemodel>)p.saveAll(ss);
	}
	public List<Deliverytablemodel> showinf()
	{
		return p.findAll();
	}
	public Deliverytablemodel updateinf(Deliverytablemodel ss)
	{
		return p.saveAndFlush(ss);
	}
	public void deleteinf(Deliverytablemodel ss)
	{
		p.delete(ss);
		
	}
}
