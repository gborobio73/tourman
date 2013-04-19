package test.gonzalo.tourman.UnitTests.Application;

import static org.junit.Assert.*;

import java.util.Date;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

import com.gonzalo.tourman.Application.TournamentApplication;
import com.gonzalo.tourman.Application.TournamentFactory;
import com.gonzalo.tourman.Application.Entities.Tournament;
import com.gonzalo.tourman.Application.Interfaces.ITourmanRepository;
import com.gonzalo.tourman.Application.Interfaces.ITournamentFactory;

public class TournamentApplicationTests {

	private TournamentApplication sut;
	private ITournamentFactory factory;
	
	private String name = "name";
	private String location = "location";
	private Date startDate = mock(Date.class);
	private Date endDate = mock(Date.class);
	private ITourmanRepository repository;

	@Before
	public void setUp()
	{
		factory = mock(ITournamentFactory.class);
		repository = mock(ITourmanRepository.class);
		sut = new TournamentApplication(factory, repository);
	}
	
	@Test
	public void shouldCreateTournament() {
		when(factory.createTournament(name, location, startDate, endDate)).thenReturn(mock(Tournament.class));
		
		try {
			sut.createTournament(name , location , startDate , endDate);
		} catch (Exception e) {
			Assert.fail(e.toString());
		}
		
		verify(factory).createTournament(name, location, startDate, endDate);
	}
	
	@Test
	public void shouldSaveTournament()
	{
		Tournament tournament = mock(Tournament.class);
		when(factory.createTournament(name, location, startDate, endDate)).thenReturn(tournament);
		
		try {
			sut.createTournament(name , location , startDate , endDate);
		} catch (Exception e) {
			Assert.fail(e.toString());
		}
		
		try {
			verify(repository).persist(tournament);
		} catch (Exception e) {
			Assert.fail(e.toString());
		}
	}

}
