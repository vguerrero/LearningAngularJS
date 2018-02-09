package com.example.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping("/admin/home")
public class HomeController {

	@RequestMapping(value = "/index", method = { RequestMethod.GET })
	public int index() {
		return 1000;
	}

	@RequestMapping(value = "/string", method = { RequestMethod.GET })
	public String giveString() {
		return "Greetings from HomeController string action...";
	}

	@RequestMapping(value = "/list/employees/{numberEmployees}", method = { RequestMethod.GET })
	public List<Employee> getListEmployees(@PathVariable("numberEmployees") int numberEmployees) {
		System.out.println("llego... " + numberEmployees);

		int e = 1;
		try {
			if (numberEmployees > 0) {
				List<Employee> listEmpl = new ArrayList<Employee>();
				while (listEmpl.size() <= numberEmployees - 1) {
					Employee emp = new Employee();
					emp.setFirtsName("John_" + e);
					emp.setLastName("Doe_" + e);
					emp.setSalary(e * 10000);

					listEmpl.add(emp);
					e++;
				}
				return listEmpl;

			} else {
				return null;
			}

		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}

	}

}