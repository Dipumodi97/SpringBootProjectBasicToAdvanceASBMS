package com.dipu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dipu.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{

}
