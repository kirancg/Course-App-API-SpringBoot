package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

//extending the crud repository
public interface TopicRepository extends CrudRepository<Topic, String>{
	
}
