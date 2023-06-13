package com.example.demo.attendanceAndAbsence.service;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.attendanceAndAbsence.data.Employee;
import com.example.demo.attendanceAndAbsence.repository.ShowListEmployeeRepository;

@Service
public class ShowListEmployeeService {

	private final ShowListEmployeeRepository repository;

	public ShowListEmployeeService(ShowListEmployeeRepository repository) {
		this.repository = repository;
	}

	public List<Employee> getEmployee(int id) throws IOException, URISyntaxException {

		List<Employee> employees = repository.getEmployee(id);

		return employees;

	}

}