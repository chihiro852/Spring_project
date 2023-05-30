package com.example.demo.practiceAPI.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.practiceAPI.service.PracticeService;
import com.example.demo.sampleAPI.data.Animals;

public class PracticeController {

	private final PracticeService practiceService;

	public PracticeController(PracticeService practiceService) {
		this.practiceService = practiceService;
	}

	@GetMapping("/showListAnimals")
	public String showList(Model model) throws IOException {

		List<Animals> animalsList = practiceService.getAnimals(0);

		model.addAttribute("animalsList", animalsList);

		return "showListAnimals.html";

	}

	@GetMapping("/showAnimal")
	public String getPets(Model model, int id) throws IOException {

		List<Animals> animal = practiceService.getAnimals(id);

		model.addAttribute("animal", animal);

		return "showAnimal.html";

	}

}