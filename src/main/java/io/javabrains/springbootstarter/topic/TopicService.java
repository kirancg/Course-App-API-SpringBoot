package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring","Spring FrameWork","Spring framework description"),
			new Topic("spring","Spring FrameWork","Spring framework description"),
			new Topic("java","Java FrameWork","Java framework description")
			));
	
	public List<Topic> getAllTopics() {
		return topics;	
	}

	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
}
