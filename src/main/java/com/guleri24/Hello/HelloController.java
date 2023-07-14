package com.guleri24.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	private static final String template = "Hello %s!";

	@GetMapping("/")
	public Hello message(@RequestParam(value = "name",
				defaultValue = "World") String name) {
		return new Hello(String.format(template, name));
	}
}

	
