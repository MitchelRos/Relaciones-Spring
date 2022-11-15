package com.Base.api;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Base.api.Entities.Course;
import com.Base.api.Entities.CourseMaterial;
import com.Base.api.Entities.Student;
import com.Base.api.Repository.CMaterialRepository;
import com.Base.api.Repository.CourseRepository;
import com.Base.api.Repository.StudentRepository;

@RestController
public class Controler {

	@Autowired // = new StudentRepository()
	CourseRepository cursRep;
	@Autowired // = new StudentRepository()
	CMaterialRepository CMaterialRep;
	@Autowired // = new StudentRepository()
	StudentRepository StudentRep;
	
	@GetMapping("/")
	public void getHome(HttpServletResponse MAMARE) throws IOException {
		
		MAMARE.sendRedirect("http://localhost:8080/swagger-ui/index.html");
	}
	@GetMapping("courses")
	public List<Course> getCourse() {
		List<Course> cursList = cursRep.findAll();
		return cursList;
	}

	// Te muestra al poner un id al final del link el curso en concreto
	@GetMapping("course/{nId}")
	public Course getCourse(@PathVariable long nId) {
		Course c1 = cursRep.findById(nId).get();
		return c1;
	}
	
	@GetMapping("cmaterials")
	public List<CourseMaterial> getCM() {
		List<CourseMaterial> CMaterialList = CMaterialRep.findAll();
		return CMaterialList;
	}

	// Te muestra al poner un id al final del link el curso en concreto
	@GetMapping("cmaterial/{nId}")
	public CourseMaterial getCM(@PathVariable long nId) {
		CourseMaterial c1 = CMaterialRep.findById(nId).get();
		return c1;
	}
	
	@GetMapping("students")
	public List<Student> getStudent() {
		List<Student> cursList = StudentRep.findAll();
		return cursList;
	}

	// Te muestra al poner un id al final del link el curso en concreto
	@GetMapping("students/{nId}")
	public Student getStudent(@PathVariable long nId) {
		Student c1 = StudentRep.findById(nId).get();
		return c1;
	}
}
