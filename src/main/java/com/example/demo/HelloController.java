package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping(value = "hello")
	public ModelAndView hello(@RequestParam("name") String name) {
		System.out.println(name);
		ModelAndView mv = new ModelAndView("hello");
		mv.addObject("name", name);

		return mv;
	}

}
