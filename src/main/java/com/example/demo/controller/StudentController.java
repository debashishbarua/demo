package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "findAll", method = RequestMethod.GET)
	public ModelAndView findAll() {
		ModelAndView mv = new ModelAndView("display");
		List<Student> list = studentService.findAll();
		mv.addObject("list", list);
		return mv;
	}

	@RequestMapping(value = "insert", method = RequestMethod.GET)
	public ModelAndView insertPage() {
		ModelAndView mv = new ModelAndView("insert");
		Student student = new Student();
		mv.addObject("student", student);
		return mv;
	}

	@RequestMapping(value = "insert1", method = RequestMethod.POST)
	public ModelAndView insert(@ModelAttribute("student") Student student) {

		ModelAndView mv = new ModelAndView("success");
		
		System.out.println(student);
		
		int res = studentService.create(student);
		
		if (res > 0) {
			mv.addObject("msg", "Record Inserted");
		} else {
			mv.addObject("msg", "Record not Inserted");
		}
		return mv;
	}

}
