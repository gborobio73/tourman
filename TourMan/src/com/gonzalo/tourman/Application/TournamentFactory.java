package com.gonzalo.tourman.Application;

import java.util.Date;

import com.gonzalo.tourman.Application.Entities.NewTournament;
import com.gonzalo.tourman.Application.Interfaces.INewTournament;
import com.gonzalo.tourman.Application.Interfaces.ITournamentFactory;

public class TournamentFactory implements ITournamentFactory{

	public INewTournament createTournament(String name, String location, Date startDate, Date endDate) {
		return new NewTournament(name, location, startDate, endDate);
	}

}
