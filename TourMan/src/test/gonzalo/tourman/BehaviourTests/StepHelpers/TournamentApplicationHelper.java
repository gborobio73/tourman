package test.gonzalo.tourman.BehaviourTests.StepHelpers;

import java.util.Date;

import com.gonzalo.tourman.Application.TournamentApplication;
import com.gonzalo.tourman.Application.Configuration.ApplicationConfiguration;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class TournamentApplicationHelper {
	
	public static void createTournament(String name, String location, Date startDate, Date endDate) throws Exception 
	{
		Injector injector = Guice.createInjector(new ApplicationConfiguration());
		TournamentApplication app = injector.getInstance(TournamentApplication.class);
		
        app.createTournament(name, location, startDate, endDate);
		
	}

}
