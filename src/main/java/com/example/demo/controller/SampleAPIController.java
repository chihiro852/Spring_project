package com.example.demo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.data.Pets;
import com.example.demo.service.SampleAPIService;

@Controller
public class SampleAPIController {

	private final SampleAPIService sampleAPIService;

	public SampleAPIController(SampleAPIService sampleAPIService) {
		this.sampleAPIService = sampleAPIService;
	}

	@GetMapping("/sampleAPI")
	public String getPets(Model model) throws IOException {

		List<Pets> petsList = sampleAPIService.getPets();

		model.addAttribute("petsList", petsList);

		return "sampleAPI.html";

	}
}