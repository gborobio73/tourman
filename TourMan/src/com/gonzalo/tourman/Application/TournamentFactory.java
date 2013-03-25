package com.gonzalo.tourman.Application;

import java.util.Date;

import com.gonzalo.tourman.Application.Entities.NewTournament;

public class TournamentFactory implements ITournamentFactory{

	public INewTournament createTournament(String name, String location, Date startDate, Date endDate) {
		return new NewTournament(name, location, startDate, endDate);
	}

}
