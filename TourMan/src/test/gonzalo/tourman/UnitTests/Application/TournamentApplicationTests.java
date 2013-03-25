package test.gonzalo.tourman.UnitTests.Application;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

import com.gonzalo.tourman.Application.TournamentApplication;
import com.gonzalo.tourman.Application.TournamentFactory;

public class TournamentApplicationTests {

	private TournamentApplication sut;

	@Before
	public void setUp()
	{
		TournamentFactory factory = mock(TournamentFactory.class);
		sut = new TournamentApplication(factory);
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
