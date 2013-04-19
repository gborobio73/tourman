package com.gonzalo.tourman.Application.Configuration;

import com.gonzalo.tourman.Application.TournamentFactory;
import com.gonzalo.tourman.Application.Interfaces.ITourmanRepository;
import com.gonzalo.tourman.Application.Interfaces.ITournamentFactory;
import com.gonzalo.tourman.Application.Repositories.TourmanRepository;
import com.google.inject.AbstractModule;

public class ApplicationConfiguration extends AbstractModule{

	private IRepositoryConfiguration configuration;

	public ApplicationConfiguration(IRepositoryConfiguration configuration)
	{
		this.configuration = configuration;
	}
	
	@Override
	protected void configure() {
		bind(ITournamentFactory.class).to(TournamentFactory.class);
		bind(ITourmanRepository.class).toInstance(new TourmanRepository(configuration));
		
		//bindConstant().annotatedWith(Keyspace.class).to(this.keyspace);
	}
}
