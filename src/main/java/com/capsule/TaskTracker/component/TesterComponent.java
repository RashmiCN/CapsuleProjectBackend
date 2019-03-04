package com.capsule.TaskTracker.component;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesterComponent {
	
	@GetMapping("/test")
	public String tester() {
		return "Hey there";
	}

}
