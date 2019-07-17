package com.example.helloworld;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
