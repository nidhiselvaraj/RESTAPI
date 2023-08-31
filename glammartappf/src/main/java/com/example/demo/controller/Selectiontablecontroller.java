 package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.Selectiontablemodel;
import com.example.demo.service.Selectiontableservice;

@RestController 
public class Selectiontablecontroller {
	
	@Autowired
	Selectiontableservice sr;
	@PostMapping("addcus")
	public Selectiontablemodel add(@RequestBody Selectiontablemodel ss)
	{
		return sr.saveinfo(ss);
	}
	@GetMapping("getcus")
	public List<Selectiontablemodel> get()
	{
		return sr.showinfo();
    }
	@PutMapping("updatecus")
	public Selectiontablemodel update(@RequestBody Selectiontablemodel ss)
	{
		return sr.updateinfo(ss);
	}
	@DeleteMapping("deletecus")
	public String del(@RequestBody Selectiontablemodel ss)
	{
		sr.deleteinfo(ss);
		return "Deleted Successfully";
	}
    //Sorting
	@GetMapping("getcussort/{productname}")
	public List<Selectiontablemodel> getsort(@PathVariable String productname)
	{
		return sr.showinfosort(productname);
    }
	//Pagination
	@GetMapping("paging/{pageno}/{pagesize}")
	public List<Selectiontablemodel> showpageinfo(@PathVariable int pageno,@PathVariable int pagesize)
	{
         //sser.sortinfo(name);
         return sr.getbypage(pageno, pagesize);
	}
	//@Query 
	@GetMapping("getcusselect/{gender}")
	public List<Selectiontablemodel> getselect(@PathVariable String gender)
	{
		return sr.showinfoselect(gender);
    }
}
