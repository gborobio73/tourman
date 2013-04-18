package com.gonzalo.tourman.Application;

import java.util.Date;

import com.gonzalo.tourman.Application.Entities.Tournament;
import com.gonzalo.tourman.Application.Interfaces.ITourmanRepository;
import com.gonzalo.tourman.Application.Interfaces.ITournamentFactory;
import com.google.inject.Inject;

public class TournamentApplication {

	private ITournamentFactory factory;
	private ITourmanRepository repository;
	
	@Inject
	public TournamentApplication(ITournamentFactory factory, ITourmanRepository repository)
	{
		this.factory = factory;
		this.repository=repository;
		
	}
	
	public void createTournament(String name, String location, Date startDate, Date endDate) throws Exception 
	{
		Tournament tournament = factory.createTournament(name, location, startDate, endDate);
		repository.persist(tournament);
	}

}
