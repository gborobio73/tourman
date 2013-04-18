package com.gonzalo.tourman.Application.Interfaces;

import java.util.Date;

import com.gonzalo.tourman.Application.Entities.Tournament;


public interface ITournamentFactory {
	Tournament createTournament(String name, String location, Date startDate, Date endDate);

}
