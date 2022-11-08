package com.Base.api.Entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="lastname")
	private String LastName;
	@Column(name="firstname")
	private String FirstName;
	private LocalDate birthdate;
	@Column(name="wantsnewsletter")
	private Boolean wantsNewsletter;
	
	public Student() {
	}
	public Student(Long id, String lastName, String firstName, LocalDate birthdate, Boolean wantsNewsletter) {
		super();
		this.id = id;
		LastName = lastName;
		FirstName = firstName;
		this.birthdate = birthdate;
		this.wantsNewsletter = wantsNewsletter;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public LocalDate getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
	public Boolean getWantsNewsletter() {
		return wantsNewsletter;
	}
	public void setWantsNewsletter(Boolean wantsNewsletter) {
		this.wantsNewsletter = wantsNewsletter;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", LastName=" + LastName + ", FirstName=" + FirstName + ", birthdate=" + birthdate
				+ ", wantsNewsletter=" + wantsNewsletter + "]";
	}
}
