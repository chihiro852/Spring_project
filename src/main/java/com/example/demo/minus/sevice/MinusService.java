package com.example.demo.minus.sevice;

import org.springframework.stereotype.Service;

@Service
public class MinusService {

	public int Minus(int num1, int num2) {

		int result = num1 - num2;

		return result;

	}
}