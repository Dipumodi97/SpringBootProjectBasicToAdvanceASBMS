package com.dipu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.dipu.entity.Student;

import jakarta.transaction.Transactional;

public interface StudentRepository extends JpaRepository<Student, Integer>{

	/**
	@Query("delete from Student where  id = :sid")
	@Modifying
	@Transactional
	public void deleteStudent(Integer sid);
	
	@Query("update Student set gender = :gender where id = :sid")
	@Modifying
	@Transactional
	public void updateStudent(Integer sid, String gender);
	
	@Query("insert into Student(id, name, gender) values(:id,:name,:gender)")
	@Modifying
	@Transactional
	public void insertStudent(Integer id, String name , String gender);
	
	@Query("from Student")
	public void selectStudents();
	
	*/
}
