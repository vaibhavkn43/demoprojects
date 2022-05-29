package com.spring.thymleaf.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.spring.thymleaf.crud.service.EmployeeService;

@Controller
public class EmployeeController {

	//display list employees
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		
		model.addAttribute("listEmplyees", employeeService.getAllEmployees());
		return "index";
	}
}
