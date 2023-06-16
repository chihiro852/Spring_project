package com.example.demo.attendanceAndAbsence.service;

import java.io.IOException;
import java.net.URISyntaxException;

import org.springframework.stereotype.Service;

import com.example.demo.attendanceAndAbsence.repository.NewEmployeeRepository;
import com.example.demo.attendanceAndAbsence.utility.Formatter;

@Service
public class NewEmployeeService {

	private final NewEmployeeRepository repository;

	public NewEmployeeService(NewEmployeeRepository repository) {
		this.repository = repository;
	}

	public void postEmployee(String name, String hometown, String joining_month) throws IOException, URISyntaxException {

		String joining_date = Formatter.yearMonthFormat(joining_month, "yyyy-MM", "yyyy-MM-dd");

		repository.postEmployee(name, hometown, joining_date);

	}

}