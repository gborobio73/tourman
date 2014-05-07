package tourman.BehaviourTests;

import static org.junit.Assert.assertTrue;

import java.util.Date;
import java.util.List;

import junit.framework.Assert;

import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.gonzalo.tourman.Application.Entities.Tournament;

import tourman.BehaviourTests.StepHelpers.TourmanRepositoryHelper;
import tourman.BehaviourTests.StepHelpers.TournamentApplicationHelper;

public class AddTournamentSteps {
	
	Tournament tournament = null;

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
		try {
			List<Tournament>tournaments = TournamentApplicationHelper.getTournaments();
			assertTrue(tournaments.size() ==1);
			tournament = tournaments.get(0);
		} catch (Exception e) {
			Assert.fail(e.toString());
		}   	
    }
 
    @Then("the created tournament has name $tournamentName")
    public void aTournamentHasName(String tournamentName) {
 		assertTrue (tournament.getName().equals(tournamentName));
    }
    
    @Then("the created tournament has location $location")
    public void aTournamentHasLocation(String location) {
 		assertTrue (tournament.getLocation().equals(location));
    }
    
    @Then("the created tournament has start date $startDate")
    public void aTournamentHasStartDate(Date startDate) {
 		assertTrue (tournament.getStartDate().equals(startDate));
    }
    
    @Then("the created tournament has end date $endDate")
    public void aTournamentHasEndDate(Date endDate) {
 		assertTrue (tournament.getEndDate().equals(endDate));
    }
}
