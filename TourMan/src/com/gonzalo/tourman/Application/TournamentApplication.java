package com.gonzalo.tourman.Application;

import java.util.Date;

import com.google.inject.Inject;

public class TournamentApplication {

	private TournamentFactory factory;
	
	@Inject
	public TournamentApplication(TournamentFactory factory)
	{
		this.factory = factory;
	}
	public void createTournament(String name, String location, Date startDate, Date endDate) 
	{
		INewTournament tournament = factory.createTournament(name, location, startDate, endDate);
		tournament.save();
		
		System.out.println("created tournament: " + name);
		System.out.println("start date: " + startDate);
		System.out.println("end date: " + endDate);
		System.out.println("location: " + location);
		
	}

}
