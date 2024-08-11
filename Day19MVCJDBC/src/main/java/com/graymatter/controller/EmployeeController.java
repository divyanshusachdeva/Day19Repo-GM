package com.graymatter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.graymatter.model.Employee;
import com.graymatter.service.EmployeeService;

@Controller
public class EmployeeController {

	
	@Autowired
	private EmployeeService service;
	
	@RequestMapping("/doL")
	public ModelAndView doL(){
		ModelAndView mv=new ModelAndView("login");
		return mv;
	}
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam String uname, @RequestParam String pwd) {
		ModelAndView mv;
		if (uname.equals("divyanshu") && pwd.equals("123")) {
			mv = new ModelAndView("empcrud");
		} else {
			mv = new ModelAndView("login");
		}
		return mv;
	}
	
	
	@RequestMapping("/getAllEmployees")
	public ModelAndView getAllEmployees() {
		List<Employee> empList = service.getAllEmployees();
		
		ModelAndView mv = new ModelAndView("getAllEmployees");
		mv.addObject("empList", empList);
		
		for(Employee e: empList)
			System.out.println(e);
		
		return mv;
	}
	
	
	@RequestMapping("/addEmployee")
	public ModelAndView addEmployee(@RequestParam String empName, @RequestParam String empId, @RequestParam String empSal) {
		Employee employee = new Employee(Integer.parseInt(empId), empName, Double.parseDouble(empSal));
	   
	    return new ModelAndView("redirect:/getAllEmployees");
	    
	}
	
	
}
