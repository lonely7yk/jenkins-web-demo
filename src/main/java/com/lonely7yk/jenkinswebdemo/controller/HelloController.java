package com.lonely7yk.jenkinswebdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	public static final String BRANCH = "master";

	@RequestMapping("/hello")
	public String hello() {
		return BRANCH + ": hello";
	}

	@RequestMapping("/hello/add")
	public String add() {
		return BRANCH + ": hello add";
	}

	@RequestMapping("/hello/update")
	public String update() {
		return BRANCH + ": hello update";
	}

	@RequestMapping("/hello/delete")
	public String delete() {
		return BRANCH + ": hello delete";
	}

	@RequestMapping("/hello/get")
	public String get() {
		return BRANCH + ": hello get";
	}
}
