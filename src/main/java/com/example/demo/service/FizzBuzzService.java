package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {

	public ArrayList<String> fizzBuzz() {

		ArrayList<String> list = new ArrayList<>();

		for (int i = 0; i <= 100; i++) {
			if (i % 5 == 0 && i % 3 == 0) {
				list.add("FizzBuzz");
			} else if (i % 5 == 0) {
				list.add("Buzz");
			} else if (i % 3 == 0) {
				list.add("Fizz");
			} else {
				list.add(String.valueOf(i));
			}
		}

		return list;
	}
}