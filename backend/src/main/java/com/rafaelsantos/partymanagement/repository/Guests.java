package com.rafaelsantos.partymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelsantos.partymanagement.model.Guest;

public interface Guests extends JpaRepository<Guest, Long> {

}
