package com.lonely7yk.jenkinswebdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}

	@RequestMapping("/hello/add")
	public String add() {
		return "add";
	}
}
