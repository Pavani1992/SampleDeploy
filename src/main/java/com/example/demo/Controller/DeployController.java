package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeployController {
	
	
	@GetMapping("/Hi")
	public String getResponse()
	{
		return "Hello Deployment";
	}
	

}
