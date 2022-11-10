package com.Base.api.Entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String lastname;
	private String firstname;
	private LocalDate birthdate;
	private Boolean wantsnewsletter;
	
	public Student() {
	}
	public Student(Long id, String lastname, String firstname, LocalDate birthdate, Boolean wantsnewsletter) {
		super();
		this.id = id;
		this.lastname = lastname;
		this.firstname = firstname;
		this.birthdate = birthdate;
		this.wantsnewsletter = wantsnewsletter;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public LocalDate getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
	public Boolean getWantsnewsletter() {
		return wantsnewsletter;
	}
	public void setWantsnewsletter(Boolean wantsnewsletter) {
		this.wantsnewsletter = wantsnewsletter;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", lastname=" + lastname + ", firstname=" + firstname + ", birthdate=" + birthdate
				+ ", wantsnewsletter=" + wantsnewsletter + "]";
	}
	
}
