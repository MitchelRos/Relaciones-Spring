package com.Base.api.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.Base.api.Entities.CourseMaterial;

public interface CMaterialRepository extends CrudRepository<CourseMaterial, Long> {
	public List<CourseMaterial> findAll();

}
