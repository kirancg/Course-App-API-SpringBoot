package io.javabrains.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	/*
	 * List<Course> topics = new ArrayList<>(Arrays.asList( new
	 * Course("springboot","SpringBoot FrameWork","SpringBoot framework description"
	 * ), new Course("spring","Spring FrameWork","Spring framework description"),
	 * new Course("java","Java FrameWork","Java framework description") ));
	 */
	
	public List<Course> getAllCourses(String topicId) {
		//return topics;	
		List<Course> courses = new ArrayList();
		courseRepository.findByTopicId(topicId)
		.forEach(courses::add);
		return courses;
	}

	public Optional<Course> getCourse(String id) {
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return courseRepository.findById(id);
	}
	
	public void addCourse(Course course) {
		//topics.add(topic);
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}
}
