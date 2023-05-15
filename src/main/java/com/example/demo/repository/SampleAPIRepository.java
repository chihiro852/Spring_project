package com.example.demo.repository;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.example.demo.data.Pets;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository
public class SampleAPIRepository {

	public Pets[] getPets() throws IOException {

		String url = "https://wk3sh1nsp4.execute-api.ap-northeast-1.amazonaws.com/test/pets";

		RestTemplate rest = new RestTemplate();

		ResponseEntity<String> response = rest.getForEntity(url, String.class);

		String json = response.getBody();

		ObjectMapper mapper = new ObjectMapper();

		Pets[] petsList = mapper.readValue(json, Pets[].class);

		return petsList;
	}

	public Pets[] getPets2() throws IOException {

		String url = "https://wk3sh1nsp4.execute-api.ap-northeast-1.amazonaws.com/test/pets";

		RestTemplate rest = new RestTemplate();

		ResponseEntity<Pets[]> response = rest.getForEntity(url, Pets[].class);

		return response.getBody();

	}
}