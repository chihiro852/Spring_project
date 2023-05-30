package com.example.demo.practiceAPI.service;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.practiceAPI.repository.PracticeRepository;
import com.example.demo.sampleAPI.data.Animals;

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