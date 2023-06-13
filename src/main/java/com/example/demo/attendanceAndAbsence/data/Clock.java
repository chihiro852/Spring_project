package com.example.demo.attendanceAndAbsence.data;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Clock {

	@JsonProperty("id")
	private int id;

	@JsonProperty("employee_id")
	private int employee_id;

	@JsonProperty("clock_in")
	private Timestamp clock_in;

	@JsonProperty("clock_out")
	private Timestamp clock_out;

	@JsonProperty("break_start")
	private Timestamp break_start;

	@JsonProperty("break_end")
	private Timestamp break_end;

}