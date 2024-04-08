package com.jenkinsProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinProject {
	@GetMapping(value="/getj")
	public String get() {
		return "Hello little ones";
	}
	

}
