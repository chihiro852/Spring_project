package com.example.demo.attendanceAndAbsence.service;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.attendanceAndAbsence.data.Employee;
import com.example.demo.attendanceAndAbsence.repository.ShowListEmployeeRepository;
import com.example.demo.attendanceAndAbsence.utility.Formatter;

@Service
public class ShowListEmployeeService {

	private final ShowListEmployeeRepository repository;

	public ShowListEmployeeService(ShowListEmployeeRepository repository) {
		this.repository = repository;
	}

	public List<Employee> getEmployee(int id) throws IOException, URISyntaxException {

		List<Employee> employees = repository.getEmployee(id);

		for (Employee employee : employees) {

			String date = employee.getJoining_month();

			if (date != null) {

				String yearMonth = Formatter.yearMonthFormat(date, "yyyy-MM-dd", "yyyy/MM");
				employee.setJoining_month(yearMonth);

			}
		}

		return employees;

	}

}