package com.Base.api.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.Base.api.Entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {
	public List<Student> findAll();
}
