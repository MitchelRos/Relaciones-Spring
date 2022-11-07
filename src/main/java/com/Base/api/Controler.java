package com.Base.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Base.api.Entities.Course;
import com.Base.api.Repository.CourseRepository;

@RestController
public class Controler {

	@Autowired // = new StudentRepository()
	CourseRepository cursRep;
	
	@GetMapping("courses")
	public List<Course> getCursos() {
		List<Course> cursList = cursRep.findAll();
		return cursList;
	}

	// Te muestra al poner un id al final del link el curso en concreto
	@GetMapping("course/{nId}")
	public Course getCurs(@PathVariable long nId) {
		Course c1 = cursRep.findById(nId).get();
		return c1;
	}
}
