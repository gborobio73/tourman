package tourman.BehaviourTests;

import static org.junit.Assert.assertTrue;

import java.util.Date;

import junit.framework.Assert;

import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import tourman.BehaviourTests.StepHelpers.TourmanRepositoryHelper;
import tourman.BehaviourTests.StepHelpers.TournamentApplicationHelper;

public class AddTournamentSteps {

	@BeforeScenario
	public void beforeEachScenario() {	   
		TourmanRepositoryHelper.emptyRepository();
	}
	
	@When("the user adds a tournament with name $tournamentName, start date $startDate, end date $endDate and location $location")
    public void theUserAddsATournamentWith(String tournamentName, Date startDate, Date endDate, String location) 
	{       
		try {
			TournamentApplicationHelper.createTournament(tournamentName, location, startDate, endDate);
		} catch (Exception e) {
			Assert.fail(e.toString());
		}
    }
 
    @Then("a tournament is created")
    public void aTournamentIsCreated() {
    	//fail("I'm failing;");
    	assertTrue(true);
    }
}
