package test.gonzalo.tourman.UnitTests.Entities;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import test.gonzalo.tourman.UnitTests.TestUtils.Inject;

import com.gonzalo.tourman.Application.Entities.NewTournament;
import com.gonzalo.tourman.Application.Interfaces.INewTournament;
import com.gonzalo.tourman.Application.Interfaces.ITournamentRepository;

public class NewTournamentTests {

	private String name = "name";
	private String location = "location";
	private Date startDate = mock(Date.class);
	private Date endDate = mock(Date.class);
	private INewTournament sut;
	
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
