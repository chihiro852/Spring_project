package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.CalculatorService;

@Controller
public class CalculatorController {

	private final CalculatorService calculatorService;

	public CalculatorController(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}

	@GetMapping("calculator")
	public String doPost() {
		return "calculator.html";
	}

	@PostMapping("calculatorResult")
	public String doPost(@RequestParam("num1") int num1, @RequestParam("num2") int num2,
			@RequestParam("symbol") String symbol, Model model) {

		int result = 0;

		result = calculatorService.doCalculator(num1, num2, symbol);

		model.addAttribute("result", result);

		return "calculator.html";
	}
}