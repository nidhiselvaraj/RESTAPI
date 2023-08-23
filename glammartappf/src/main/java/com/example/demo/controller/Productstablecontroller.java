package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Productstablemodel;
import com.example.demo.service.Productstableservice;


@RestController 
public class Productstablecontroller {
	
	@Autowired
	Productstableservice ps;
	@PostMapping("addpro")
	public Productstablemodel add(@RequestBody Productstablemodel ss)
	{
		return ps.saveinfo(ss);
	}
	@GetMapping("getpro")
	public List<Productstablemodel> get()
	{
		return ps.showinfo();
    }
	@PutMapping("updatepro")
	public Productstablemodel update(@RequestBody Productstablemodel ss)
	{
		return ps.updateinfo(ss);
	}
	@DeleteMapping("deletepro")
	public String del(@RequestBody Productstablemodel ss)
	{
		ps.deleteinfo(ss);
		return "Deleted Successfully";
	}


}
