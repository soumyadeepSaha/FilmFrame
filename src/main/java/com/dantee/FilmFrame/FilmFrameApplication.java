package com.dantee.FilmFrame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController // just to let the framework know this class is a rest api controller
public class FilmFrameApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmFrameApplication.class, args);
	}


//	 @GetMapping("/root")
//	public String apiRoot(){
//		return "hello world";
//	 }



  // we will make our api in this way--->
	//**    **\\
	//we will divide our api into seperate layer
	// their will be a service layer - data access layer - API layer




}
