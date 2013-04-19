package com.gonzalo.tourman.Application.Configuration;

import com.gonzalo.tourman.Application.TournamentFactory;
import com.gonzalo.tourman.Application.Interfaces.ITourmanRepository;
import com.gonzalo.tourman.Application.Interfaces.ITournamentFactory;
import com.gonzalo.tourman.Application.Repositories.TourmanRepository;
import com.google.inject.AbstractModule;

public class ApplicationConfiguration extends AbstractModule{

	private String keyspace;

	public ApplicationConfiguration(String keyspace)
	{
		this.keyspace = keyspace;
	}
	
	@Override
	protected void configure() {
		bind(ITournamentFactory.class).to(TournamentFactory.class);
		bind(ITourmanRepository.class).to(TourmanRepository.class);
		
		bindConstant().annotatedWith(Keyspace.class).to(this.keyspace);
	}
}
