package com.example.demo.AnimalsAPI.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.AnimalsAPI.data.Animals;
import com.example.demo.AnimalsAPI.service.PracticeService;

@Controller
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
	public String getAnimal(@RequestParam("list") int id, Model model) throws IOException {

		List<Animals> animal = practiceService.getAnimals(id);

		model.addAttribute("animal", animal);

		return "showAnimal.html";

	}

}