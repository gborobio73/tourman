package tourman.BehaviourTests.StepHelpers;

import java.util.Date;
import java.util.List;

import com.gonzalo.tourman.Application.TournamentApplication;
import com.gonzalo.tourman.Application.Configuration.ApplicationConfiguration;
import com.gonzalo.tourman.Application.Configuration.RepositoryConfiguration;
import com.gonzalo.tourman.Application.Entities.Tournament;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class TournamentApplicationHelper {
	
	private static final String keyspace = "TourmanTest";
	private static final String cluster = "Test Cluster";
	private static TournamentApplication app;

	public static void createTournament(String name, String location, Date startDate, Date endDate) throws Exception 
	{
		getApplication().createTournament(name, location, startDate, endDate);
	}

	public static List<Tournament> getTournaments() throws Exception {
		return getApplication().getTournaments();
	}
	
	private static TournamentApplication getApplication() {
		if(app == null){
			Injector injector = Guice.createInjector(
					new ApplicationConfiguration( new RepositoryConfiguration(keyspace, cluster)));
			app = injector.getInstance(TournamentApplication.class);
		}
		return app;
	}


}
