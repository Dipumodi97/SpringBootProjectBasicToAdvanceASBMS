package com.dipu.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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
	
	// Soft Delete
	@Column(name="ACTIVE_SWITCH")
	private String activeSwitch;
	
	@CreationTimestamp
	@Column(name ="LOCAL_DATE")
	private LocalDateTime localDate;
	
	@UpdateTimestamp
	@Column(name ="UPDATED_DATE")
	private LocalDateTime updatedDate;
	

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
	
	public String getActiveSwitch() {
		return activeSwitch;
	}
	public void setActiveSwitch(String activeSwitch) {
		this.activeSwitch = activeSwitch;
	}

	public LocalDateTime getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDateTime localDate) {
		this.localDate = localDate;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rank=" + rank + ", gender=" + gender + ", localDate="
				+ localDate + ", updatedDate=" + updatedDate + "]";
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(Integer id, String name, Long rank, String gender,String activeSwitch) {
		super();
		this.id = id;
		this.name = name;
		this.rank = rank;
		this.gender = gender;
		this.activeSwitch = activeSwitch;
	}
	
	
}
