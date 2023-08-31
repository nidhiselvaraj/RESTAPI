package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Productstablemodel;
import com.example.demo.repository.Productstablerepository;


@Service
public class Productstableservice {

	@Autowired
	Productstablerepository pt;
	public Productstablemodel saveinfo(Productstablemodel ss)
	{
		return pt.save(ss);
	}
	public List<Productstablemodel> showinfo()
	{
		return pt.findAll();
	}
	public Productstablemodel updateinfo(Productstablemodel ss)
	{
		return pt.saveAndFlush(ss);
	}
	public void deleteinfo(Productstablemodel ss)
	{
		pt.delete(ss);
		
	}
}
