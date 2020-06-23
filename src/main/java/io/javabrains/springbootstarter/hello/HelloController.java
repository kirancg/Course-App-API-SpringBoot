package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	//Hey Spring whenever there is request o /hello just execute this methid and return it
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	} 
}
