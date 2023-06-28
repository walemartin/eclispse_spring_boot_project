package com.onion.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
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
    @GetMapping("/hello")
    // Method
    public String helloWorld()
    {
 
        return "Hello World!";
    }
    @GetMapping("/api/javainuse")
	public String sayHello() {
		return "Swagger Hello World";
	}
    @GetMapping("/employee")
	public Employee firstPage() {

		Employee emp = new Employee();
		emp.setName("Olawale Olasupo");
		emp.setDesignation("Manager");
		emp.setId(1);
		emp.setSalary(20000);
		emp.setDept("Human Resource");

		return emp;
	}

}
