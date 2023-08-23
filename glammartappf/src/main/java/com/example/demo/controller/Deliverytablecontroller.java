package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Deliverytablemodel;
import com.example.demo.service.Deliverytableservice;



@RestController
public class Deliverytablecontroller {

	@Autowired
	Deliverytableservice srs;
	@PostMapping("addcustomer")
	public List<Deliverytablemodel> add(@RequestBody List<Deliverytablemodel> ss)
	{
		return (List<Deliverytablemodel>)srs.saveinf(ss);
	}
	@GetMapping("getcustomer")
	public List<Deliverytablemodel> get()
	{
		return srs.showinf();
    }
	@PutMapping("updatecustomer")
	public Deliverytablemodel update(@RequestBody Deliverytablemodel ss)
	{
		return srs.updateinf(ss);
	}
	@DeleteMapping("deletecustomer")
	public String del(@RequestBody Deliverytablemodel ss)
	{
		srs.deleteinf(ss);
		return "Deleted Successfully";
	}
	
}
