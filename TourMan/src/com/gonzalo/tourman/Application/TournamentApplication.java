package com.gonzalo.tourman.Application;

import java.util.Date;

public class TournamentApplication {

	public void createTournament(String name, String location, Date startDate,
			Date endDate) {
		System.out.println("created tournament: " + name);
		System.out.println("start date: " + startDate);
		System.out.println("end date: " + endDate);
		System.out.println("location: " + location);
		
	}

}
