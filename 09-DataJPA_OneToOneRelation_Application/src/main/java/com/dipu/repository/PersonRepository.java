package com.dipu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dipu.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

}
