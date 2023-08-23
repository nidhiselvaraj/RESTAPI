package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.Usertablemodel;
import com.example.demo.service.Userstableservice;


@RestController
public class Userstable {

	@Autowired 
	Userstableservice srs;
	@PostMapping("addcustom")
	public List<Usertablemodel> add(@RequestBody List<Usertablemodel> ss)
	{
		return (List<Usertablemodel>)srs.saveinf(ss);
	}
	@GetMapping("getcustom")
	public List<Usertablemodel> get()
	{
		return srs.showinf();
    }
	//Get by id
	@GetMapping("getcustom/{id}")
	public Optional<Usertablemodel> getid(@PathVariable int id)
	{
		return srs.showbyid(id);
	}
	@PutMapping("updatecustom")
	public Usertablemodel update(@RequestBody Usertablemodel ss)
	{
		return srs.updateinf(ss);
	}
	//Update by id
	@PutMapping("updatebycustom/{id}")

	public String modifybyid(@PathVariable int id,@RequestBody Usertablemodel ss) {

		return srs.updateinfobyid(id, ss);

	}
	@DeleteMapping("deletecustom")
	public String del(@RequestBody Usertablemodel ss)
	{
		srs.deleteinf(ss);
		return "Deleted Successfully";
	}
	//Delete by id
	@DeleteMapping("deleteid/{id}")

	public void deletemyid(@PathVariable int id) {

		srs.deleteid(id);

	}
   @DeleteMapping("deleteparamid")

	public void deletemyparamid(@RequestParam int id) {

		srs.deletepid(id);

	}
	
}
 