package com.dipu.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="STUDENT_DETAILS") // optional
public class Student {

	@Id
	@Column(name ="STUDENT_ID") // optional
	private Integer id;
	@Column(name ="STUDENT_NAME")
	private String name;
	@Column(name ="STUDENT_RANK")
	private Long rank;
	@Column(name ="STUDENT_GENDER")
	private String gender;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getRank() {
		return rank;
	}
	public void setRank(Long rank) {
		this.rank = rank;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rank=" + rank + ", gender=" + gender + "]";
	}
	
	
	
}
