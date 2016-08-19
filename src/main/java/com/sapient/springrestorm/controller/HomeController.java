package com.sapient.springrestorm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
// @RequestMapping("/hello")
public class HomeController {
    String message = "Welcome to First Flight machine.";

    @RequestMapping(value = "hello.htm", method = RequestMethod.GET)
    public ModelAndView showMessage() {
	System.out.println(">>>>> From Home Controller >>>>>>");
	return new ModelAndView("hello", "message", message);
    }

}
