package test.gonzalo.tourman.UnitTests.Entities;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import test.gonzalo.tourman.UnitTests.TestUtils.*;

import com.gonzalo.tourman.Application.INewTournament;
import com.gonzalo.tourman.Application.ITournamentRepository;
import com.gonzalo.tourman.Application.Entities.NewTournament;

public class NewTournamentTests {

	private String name = "name";
	private String location = "location";
	private Date startDate = mock(Date.class);
	private Date endDate = mock(Date.class);
	private NewTournament sut;
	
	@Before
	public void setUp()
	{
		sut = new NewTournament(name, location, startDate, endDate);
	}
	
	@Test
	public void saveShouldAddTournamentToRepository() {
		ITournamentRepository repository = mock(ITournamentRepository.class);
		
		Inject<ITournamentRepository> inject = new Inject<ITournamentRepository>();
		inject.value(repository, ITournamentRepository.class).to(sut);
		
		sut.save();
		
		verify(repository).add(sut);
	}

	
}
