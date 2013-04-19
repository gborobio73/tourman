package com.gonzalo.tourman.Application.Interfaces;

import java.util.List;

import com.gonzalo.tourman.Application.Entities.Tournament;

public interface ITourmanRepository {
	
	public void persist(IPersistable entity) throws Exception;

	public List<Tournament> getTournaments() throws Exception;

}
