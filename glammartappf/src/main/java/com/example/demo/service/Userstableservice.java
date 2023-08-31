package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.Usertablemodel;
import com.example.demo.repository.Usertableinterface;


@Service
public class Userstableservice {

	@Autowired
	Usertableinterface p;
	//Array of input
	public List<Usertablemodel> saveinf(List<Usertablemodel> ss)
	{
		return (List<Usertablemodel>)p.saveAll(ss);
	}
	public List<Usertablemodel> showinf()
	{
		return p.findAll();
	}
	//update
	public Usertablemodel updateinf(Usertablemodel ss)
	{
		return p.saveAndFlush(ss);
	}
	//update by id
	public Optional<Usertablemodel> showbyid(int id)
	{
		return p.findById(id);
	}
	//update by id(p)
	public String updateinfobyid(int id,Usertablemodel ss) {

		p.saveAndFlush(ss);

		if(p.existsById(id)) {

			return "updated";
         }
       else 
       {
    	   return "enter valid id";
        }

	}
	//delete
	public void deleteinf(Usertablemodel ss)
	{
		p.delete(ss);
	}
	//delete by id
	public void deleteid(int id) {

		p.deleteById(id);

	}
    //delete by id(p)
	public void deletepid(int id) {

		p.deleteById(id);

	}
	//One to many mapping
	public List<Usertablemodel> savein(List<Usertablemodel> ss)
	{
		return (List<Usertablemodel>)p.saveAll(ss);
	}
	public List<Usertablemodel> showin()
	{
		return p.findAll();
	}

}
