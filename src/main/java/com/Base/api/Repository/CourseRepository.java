package com.Base.api.Repository;

import org.springframework.data.repository.CrudRepository;
import java.util.List;
import com.Base.api.Entities.Course;

public interface CourseRepository extends CrudRepository<Course, Long>  {
	public List<Course> findAll();
}
