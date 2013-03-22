package test.gonzalo.tourman.BehaviourTests;

import org.jbehave.core.annotations.*;
import static org.junit.Assert.*;

public class AddTournamentSteps {

	@When("the user adds a tournament with $name")
    public void theUserAddsATournamentWithName(String name) {
        System.out.print(name);
    }
 
    @Then("a tournament is created")
    public void aTournamentIsCreated() {
    	fail("I'm failing;");
    	//assertTrue(true);
    }
}
