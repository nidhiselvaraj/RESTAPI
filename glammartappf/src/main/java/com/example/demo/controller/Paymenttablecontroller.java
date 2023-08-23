package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Paymenttablemodel;
import com.example.demo.service.Paymenttableservice;

@RestController
public class Paymenttablecontroller {

	@Autowired
	Paymenttableservice sr;
	@PostMapping("addcusto")
	public Paymenttablemodel add(@RequestBody Paymenttablemodel ss)
	{
		return sr.saveinfo(ss);
	}
	@GetMapping("getcusto")
	public List<Paymenttablemodel> get()
	{
		return sr.showinfo();
    }
	@PutMapping("updatecusto")
	public Paymenttablemodel update(@RequestBody Paymenttablemodel ss)
	{
		return sr.updateinfo(ss);
	}
	@DeleteMapping("deletecusto")
	public String del(@RequestBody Paymenttablemodel ss)
	{
		sr.deleteinfo(ss);
		return "Deleted Successfully";
	}
}
