package com.orangehrm.demo.reto.stepdefinitions;

import com.orangehrm.demo.reto.models.DemoOrangeHrmIsData;
import com.orangehrm.demo.reto.tasks.Login;
import com.orangehrm.demo.reto.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class LoginStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that the user enters the page$")
    public void thatTheUserEntersThePage() {
        OnStage.theActorCalled("User").wasAbleTo(OpenUp.thePage());
    }

    @When("^enter the credentials$")
    public void enterTheCredentials(List<DemoOrangeHrmIsData> demoOrangeHrmIsData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.onThePage(demoOrangeHrmIsData.get(0).getStrUser(),demoOrangeHrmIsData.get(0).getStrPassword()));
    }

    @Then("^It is located on the main page$")
    public void itIsLocatedOnTheMainPage() {
        // Write code here that turns the phrase above into concrete actions

    }
}
