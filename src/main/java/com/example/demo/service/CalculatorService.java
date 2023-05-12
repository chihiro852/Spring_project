package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

	int result = 0;

	public int doCalculator(int num1, int num2, String symbol) {

		if (symbol.equals("plus")) {

			result = num1 + num2;

			return result;

		} else if (symbol.equals("minus")) {

			result = num1 - num2;

			return result;

		} else if (symbol.equals("multi")) {

			result = num1 * num2;

			return result;

		} else if (symbol.equals("divi")) {

			result = num1 / num2;

			return result;

		}

		return result;
	}

}