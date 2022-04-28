package com.rafaelsantos.partymanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rafaelsantos.partymanagement.model.Guest;
import com.rafaelsantos.partymanagement.repository.Guests;

@Controller
public class GuestsController {

	@Autowired
	private Guests guests;

	@GetMapping("/guests")
	public ModelAndView buildGuestsList() {
		ModelAndView modelAndView = new ModelAndView("GuestsList");

		modelAndView.addObject("guests", guests.findAll());
		modelAndView.addObject("guest", new Guest());

		return modelAndView;
	}

	@PostMapping("/guests")
	public String salvar(Guest guest) {
		this.guests.save(guest);

		return "redirect:/guests";
	}

}
