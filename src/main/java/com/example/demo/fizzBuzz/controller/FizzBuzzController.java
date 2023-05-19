package com.example.demo.fizzBuzz.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.fizzBuzz.service.FizzBuzzService;

@Controller
public class FizzBuzzController {

	private final FizzBuzzService fizzBuzzService;

	@Autowired
	public FizzBuzzController(FizzBuzzService fizzBuzzService) {
		this.fizzBuzzService = fizzBuzzService;
	}

	@GetMapping("fizzBuzz")
	public String doGet(Model model) {

		ArrayList<String> list = new ArrayList<>();

		list = fizzBuzzService.fizzBuzz();

		model.addAttribute("result", list);

		return "fizzBuzz.html";

	}
}
