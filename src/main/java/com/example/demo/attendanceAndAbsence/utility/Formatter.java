package com.example.demo.attendanceAndAbsence.utility;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Formatter {

	public static String yearMonthFormat(String dateStr, String sourcePattern, String targetPattern) {

		if (dateStr == null) {
			return null;
		}

		LocalDate date = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"));

		String yearMonth = date.format(DateTimeFormatter.ofPattern(targetPattern));

		return yearMonth;

	}

}