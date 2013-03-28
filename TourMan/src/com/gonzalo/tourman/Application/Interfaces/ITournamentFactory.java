package com.gonzalo.tourman.Application.Interfaces;

import java.util.Date;


public interface ITournamentFactory {
	INewTournament createTournament(String name, String location, Date startDate, Date endDate);

}
