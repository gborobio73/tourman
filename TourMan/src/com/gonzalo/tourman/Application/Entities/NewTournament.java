package com.gonzalo.tourman.Application.Entities;

import java.util.Date;

import com.gonzalo.tourman.Application.INewTournament;

public class NewTournament implements INewTournament {

	private String name;
	private String location;
	private Date startDate;
	private Date endDate;

	public NewTournament(String name, String location, Date startDate, Date endDate) {
		this.name = name;
		this.location = location;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public void save() {
		System.out.println("Tournament "+name+" saved!!!");

	}

}
