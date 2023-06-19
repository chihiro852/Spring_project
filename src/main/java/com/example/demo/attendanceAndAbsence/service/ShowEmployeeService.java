package com.example.demo.attendanceAndAbsence.service;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.attendanceAndAbsence.data.Clock;
import com.example.demo.attendanceAndAbsence.repository.ShowEmployeeRepository;

@Service
public class ShowEmployeeService {

	private final ShowEmployeeRepository repository;

	public ShowEmployeeService(ShowEmployeeRepository repository) {
		this.repository = repository;
	}

	public List<Clock> getClock(int employeeId) throws IOException, URISyntaxException {

		List<Clock> clocks = repository.getClock(employeeId);
		
		//		for (Clock clock : clocks) {
		//			
		//			String date = clock.getClock_in();
		//			
		//		}

		return clocks;

	}

}