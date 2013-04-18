package com.gonzalo.tourman.Application;

import java.util.Date;

import com.gonzalo.tourman.Application.Entities.Tournament;
import com.gonzalo.tourman.Application.Interfaces.ITournamentFactory;

public class TournamentFactory implements ITournamentFactory{

	public Tournament createTournament(String name, String location, Date startDate, Date endDate) {
		return new Tournament(name, location, startDate, endDate);
	}

}
