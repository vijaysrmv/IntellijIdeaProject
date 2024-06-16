package com.example.grallvmnewapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class GrallvmnewapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrallvmnewapplicationApplication.class, args);
	}

}

@RestController
class HomeCOntroller{

	@RequestMapping("/get")
	public String getData()
	{
		return "Home";
	}
}
