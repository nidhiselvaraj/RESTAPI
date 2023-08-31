package com.example.demo.service;

import java.util.List;
 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
	//Sorting
	public List<Selectiontablemodel> showinfosort(String d)
	{
		return sl.findAll(Sort.by(Sort.DEFAULT_DIRECTION,d));
	}
	//Pagination
	public List<Selectiontablemodel> getbypage(int pgno,int pgsize)

	{
        //sr.findAll(Sort.by(Sort.Direction.DESC,s));
        Page<Selectiontablemodel>p=sl.findAll(PageRequest.of(pgno,pgsize));
        return p.getContent();
	}
	//@Query annotation
	public List<Selectiontablemodel> showinfoselect(String gender)
	{
		return sl.info(gender);
	}
}

