package com.example.demo.service;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.data.Pets;
import com.example.demo.repository.SampleAPIRepository;

@Service
public class SampleAPIService {

	private final SampleAPIRepository sampleAPIRepository;

	public SampleAPIService(SampleAPIRepository sampleAPIRepository) {
		this.sampleAPIRepository = sampleAPIRepository;
	}

	public List<Pets> getPets() throws IOException {

		Pets[] petsList = sampleAPIRepository.getPets();

		return Arrays.asList(petsList);

	}
}