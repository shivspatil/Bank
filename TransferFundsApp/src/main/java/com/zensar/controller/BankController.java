package com.zensar.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

	@GetMapping(value="/bank")
	public List<String> getBankList() {
		return Arrays.asList("SBI", "HDFC", "ICICI", "Axis Bank");
	}
}
