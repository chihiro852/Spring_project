package com.example.demo.attendanceAndAbsence.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClockController {

	@PostMapping("clock")
	public String doPost(@RequestParam("id") int id, @RequestParam("出勤") String clockIn, @RequestParam("休憩開始") String breakStart, @RequestParam("休憩終了") String breakEnd, @RequestParam("退勤") String clockOut, Model model) {
		return "showEmployee.html";
	}
}