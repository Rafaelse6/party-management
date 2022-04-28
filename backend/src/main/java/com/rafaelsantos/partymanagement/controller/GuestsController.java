package com.rafaelsantos.partymanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GuestsController {
	
	@GetMapping("/guests")
	public String buildGuestsList() {
		return "GuestsList";
	}

}
