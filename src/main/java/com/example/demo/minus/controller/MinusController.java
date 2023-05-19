package com.example.demo.minus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.minus.sevice.MinusService;

@Controller
public class MinusController {

	private final MinusService minusService;

	@Autowired
	public MinusController(MinusService minusService) {
		this.minusService = minusService;
	}

	@GetMapping("minusForm")
	public String doGet() {
		return "minus.html";
	}

	@GetMapping("minusResult")
	public String doGet(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {

		int result = 0;

		result = minusService.Minus(num1, num2);

		model.addAttribute("result", result);

		return "minus.html";

	}
}