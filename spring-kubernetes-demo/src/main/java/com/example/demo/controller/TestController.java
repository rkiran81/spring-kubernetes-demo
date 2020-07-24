package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ServiceClass;

@RestController
public class TestController {
	
	@Autowired
	ServiceClass service;
	
	@GetMapping("hello")
	public String sayHello() {
		return service.sayHello();
	}
}
