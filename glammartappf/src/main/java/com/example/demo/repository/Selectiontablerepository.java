package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Selectiontablemodel;

public interface Selectiontablerepository extends JpaRepository<Selectiontablemodel, Integer>{

	@Query(value="select *from Selection where gender=:d",nativeQuery=true)
	public List<Selectiontablemodel> info(@Param("d") String gender);
	
}
