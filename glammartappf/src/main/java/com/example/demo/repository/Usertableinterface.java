package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Usertablemodel;

public interface Usertableinterface extends JpaRepository<Usertablemodel, Integer> {

}
