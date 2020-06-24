package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

//extending the crud repository
public interface CourseRepository extends CrudRepository<Course, String>{
	public List<Course> findByTopicId(String topicId);
	
	//public List<Course> findByDescription(String description);
}
