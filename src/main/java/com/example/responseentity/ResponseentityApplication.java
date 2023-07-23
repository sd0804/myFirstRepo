package com.example.responseentity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ResponseentityApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResponseentityApplication.class, args);
	}

	@GetMapping("/myfisrtapi")
	public ResponseEntity<String> getEmployee()
	{
		String body="Hello World";
		HttpHeaders h=new HttpHeaders();
		h.add("myfirsTHEADER","i LOVE");
		return ResponseEntity.status(HttpStatusCode.valueOf(201)).body(body);
		//my chane1
		//my change2

	}

}
