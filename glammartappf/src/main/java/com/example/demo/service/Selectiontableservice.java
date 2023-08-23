package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.Selectiontablemodel;
import com.example.demo.repository.Selectiontablerepository;

@Service
public class Selectiontableservice {

	@Autowired
	Selectiontablerepository sl;
	public Selectiontablemodel saveinfo(Selectiontablemodel ss)
	{
		return sl.save(ss);
	}
	public List<Selectiontablemodel> showinfo()
	{
		return sl.findAll();
	}
	public Selectiontablemodel updateinfo(Selectiontablemodel ss)
	{
		return sl.saveAndFlush(ss);
	}
	public void deleteinfo(Selectiontablemodel ss)
	{
		sl.delete(ss);
		
	}
}

