package com.example.demo.AnimalsAPI.service;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.AnimalsAPI.data.Animals;
import com.example.demo.AnimalsAPI.repository.PracticeRepository;

@Service
public class PracticeService {

	private final PracticeRepository practiceRepository;

	public PracticeService(PracticeRepository practiceRepository) {
		this.practiceRepository = practiceRepository;
	}

	public List<Animals> getAnimals(int id) throws IOException {

		Animals[] animalsList = practiceRepository.getAnimals(id);

		return Arrays.asList(animalsList);

	}

}