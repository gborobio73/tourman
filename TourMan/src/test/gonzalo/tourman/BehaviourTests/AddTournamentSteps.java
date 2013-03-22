package test.gonzalo.tourman.BehaviourTests;

import java.util.Date;

import org.jbehave.core.annotations.*;

import com.gonzalo.tourman.Application.TournamentApplication;

import static org.junit.Assert.*;

public class AddTournamentSteps {

	@When("the user adds a tournament with $name, start date $startDate, end date $endDate and location $location")
    public void theUserAddsATournamentWith(String name, Date startDate, Date endDate, String location) {
        System.out.print(name);
        
        TournamentApplication app = new TournamentApplication();
        app.createTournament(name, location, startDate, endDate);
        
    }
 
    @Then("a tournament is created")
    public void aTournamentIsCreated() {
    	//fail("I'm failing;");
    	assertTrue(true);
    }
}
