package io.javabrains.springbootstarter.course;

import org.springframework.data.repository.CrudRepository;

//extending the crud repository
public interface CourseRepository extends CrudRepository<Course, String>{
	
}
