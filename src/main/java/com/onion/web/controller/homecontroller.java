package com.onion.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.onion.web.model.Employee;

//Annotation
@RestController
public class homecontroller {
	
	// Annotation
    @ResponseBody
    @RequestMapping("/hello")
    // Method
    public String helloWorld()
    {
 
        return "Hello World!";
    }
    
    @RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee firstPage() {

		Employee emp = new Employee();
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setId(1);
		emp.setSalary(3000);

		return emp;
	}

}
