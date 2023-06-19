package com.example.demo.attendanceAndAbsence.data;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Clock {

	@JsonProperty("id")
	private int id;

	@JsonProperty("employee_id")
	private int employee_id;

	@JsonProperty("clock_in")
	private LocalDateTime clock_in;

	@JsonProperty("clock_out")
	private LocalDateTime clock_out;

	@JsonProperty("break_start")
	private LocalDateTime break_start;

	@JsonProperty("break_end")
	private LocalDateTime break_end;

}