package com.example.demo.attendanceAndAbsence.repository;

import java.io.IOException;
import java.net.URISyntaxException;
import java.time.LocalDateTime;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Repository
public class ClockRepository {

	private static final String BaseApiUrl = "https://jsn9xu2vsk.execute-api.ap-northeast-1.amazonaws.com/sample/attendanceandabsence/clock";
	private RestTemplate restTemplate;
	private HttpHeaders headers;

	public ClockRepository() {
		this.restTemplate = new RestTemplate();
		this.headers = new HttpHeaders();
	}

	public void postClock(int id, String clockIn, String breakStart, String breakEnd, String clockOut) throws IOException, URISyntaxException {
		String apiUrl = BaseApiUrl;
		LocalDateTime now = LocalDateTime.now();

		try {

			headers.setContentType(MediaType.APPLICATION_JSON);

			String requestBody = "";

			if (clockIn != null) {
				requestBody = "{\"body\": \"{\\\"employee_id\\\":\\\"" + id + "\\\", \\\"clock_in\\\":\\\"" + now + "\\\"}\"}";
			} 

			HttpEntity<String> requestEntity = new HttpEntity<>(requestBody, headers);

			restTemplate.exchange(apiUrl, HttpMethod.POST, requestEntity, String.class);

		} catch (RestClientException e) {
			throw new IOException("Failed to fetch clock data from the API.", e);
		}

	}

}