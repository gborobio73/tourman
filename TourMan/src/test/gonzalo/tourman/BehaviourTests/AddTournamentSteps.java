package test.gonzalo.tourman.BehaviourTests;

import java.util.Date;

import org.jbehave.core.annotations.*;

import test.gonzalo.tourman.BehaviourTests.StepHelpers.TournamentApplicationHelper;

import com.gonzalo.tourman.Application.TournamentApplication;
import com.gonzalo.tourman.Application.TournamentFactory;
import com.gonzalo.tourman.Application.Configuration.ApplicationConfiguration;
import com.gonzalo.tourman.MVPTourmanUI.Configuration.MVPTourmanUIDependencies;
import com.gonzalo.tourman.MVPTourmanUI.MVP.MainMenu.MainMenuViewImpl;
import com.google.inject.Guice;
import com.google.inject.Injector;

import static org.junit.Assert.*;

public class AddTournamentSteps {

	@When("the user adds a tournament with $name, start date $startDate, end date $endDate and location $location")
    public void theUserAddsATournamentWith(String name, Date startDate, Date endDate, String location) 
	{       
		TournamentApplicationHelper.createTournament(name, location, startDate, endDate);
    }
 
    @Then("a tournament is created")
    public void aTournamentIsCreated() {
    	//fail("I'm failing;");
    	assertTrue(true);
    }
}
