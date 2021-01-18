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
		return "hello add";
	}

	@RequestMapping("/hello/update")
	public String update() {
		return "hello update";
	}

	@RequestMapping("/hello/delete")
	public String delete() {
		return "hello delete";
	}
}
