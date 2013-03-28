package test.gonzalo.tourman.UnitTests.Application;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

import com.gonzalo.tourman.Application.TournamentApplication;
import com.gonzalo.tourman.Application.TournamentFactory;
import com.gonzalo.tourman.Application.Interfaces.INewTournament;

public class TournamentApplicationTests {

	private TournamentApplication sut;
	private TournamentFactory factory;
	
	private String name = "name";
	private String location = "location";
	private Date startDate = mock(Date.class);
	private Date endDate = mock(Date.class);

	@Before
	public void setUp()
	{
		factory = mock(TournamentFactory.class);
		sut = new TournamentApplication(factory);
	}
	
	@Test
	public void shouldCreateTournament() {
		when(factory.createTournament(name, location, startDate, endDate)).thenReturn(mock(INewTournament.class));
		
		sut.createTournament(name , location , startDate , endDate);
		
		verify(factory).createTournament(name, location, startDate, endDate);
	}
	
	@Test
	public void shouldSaveTournament()
	{
		INewTournament newTournament = mock(INewTournament.class);
		when(factory.createTournament(name, location, startDate, endDate)).thenReturn(newTournament);
		
		sut.createTournament(name , location , startDate , endDate);
		
		verify(newTournament).save();
	}

}
