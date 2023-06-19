package com.example.demo.attendanceAndAbsence.data;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Employee {

	@JsonProperty("id")
	private int id;

	@JsonProperty("name")
	private String name;

	@JsonProperty("hometown")
	private String hometown;

	@JsonProperty("joining_month")
	private String joining_month;

	@JsonProperty("created_at")
	private Timestamp created_at;

	@JsonProperty("updated_at")
	private Timestamp updated_at;

}