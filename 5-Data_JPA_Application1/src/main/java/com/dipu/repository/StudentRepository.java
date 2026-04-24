package com.dipu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dipu.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
