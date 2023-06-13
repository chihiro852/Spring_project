package com.example.demo.attendanceAndAbsence.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ShowEmployeeController {

	@GetMapping("/showEmployee")
	public String getEmployee(@RequestParam("employeeId") int employeeId, Model model) {

		return "showEmployee.html";

	}

}