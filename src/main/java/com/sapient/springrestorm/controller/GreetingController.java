package com.sapient.springrestorm.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.springrestorm.model.Greeting;

@SuppressWarnings("javadoc")
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private static AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting getMessage(
	    @RequestParam(value = "name", defaultValue = "World..!") final String name) {

	return new Greeting(counter.incrementAndGet(), String.format(template,
		name));
    }
}
