package com.dipu.repository;

import org.springframework.data.repository.CrudRepository;

import com.dipu.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{

}
