package com.Base.api.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CourseMaterial {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String url;
	@OneToOne
	@JoinColumn(name="course_id")
	private Course course;
	
	
	public CourseMaterial() {

	}
	public CourseMaterial(Long id, String url, Course course) {
		super();
		this.id = id;
		this.url = url;
		this.course = course;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "CourseMaterial [id=" + id + ", url=" + url + ", course=" + course + "]";
	}
	
	
	
}
