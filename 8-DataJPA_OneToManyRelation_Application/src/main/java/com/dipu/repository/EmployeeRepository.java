package com.dipu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dipu.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
