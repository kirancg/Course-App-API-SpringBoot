package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	List<Topic> topics = Arrays.asList(
			new Topic("spring","Spring FrameWork","Spring framework description"),
			new Topic("spring","Spring FrameWork","Spring framework description"),
			new Topic("spring","Spring FrameWork","Spring framework description")
			);
	
	public List<Topic> getAllTopics() {
		return topics;
		
	}
}
