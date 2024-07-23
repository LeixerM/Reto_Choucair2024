package com.orangehrm.demo.reto.stepdefinitions;

import com.orangehrm.demo.reto.models.DemoOrangeHrmIsData;
import com.orangehrm.demo.reto.questions.QuestionRecruitments;
import com.orangehrm.demo.reto.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class RecruitmentStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^Enter the credentials to enter the main page$")
    public void enterTheCredentialsToEnterTheMainPage(List<DemoOrangeHrmIsData> demoOrangeHrmIsData) {
        OnStage.theActorCalled("User").wasAbleTo(OpenUp.thePage(), Login.onThePage(demoOrangeHrmIsData.get(0).getStrUser(),demoOrangeHrmIsData.get(0).getStrPassword()));
    }


    @When("^the user makes his application$")
    public void theUserMakesHisApplication() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                new AddRecruitment(),
                new SaveProccessHire()
        );

    }

    @Then("^It validates that the user was hired$")
    public void itValidatesThatTheUserWasHired() {
        OnStage.theActorInTheSpotlight().attemptsTo(new SearchStatusVacancy());
        String ExpectFullName = "Jhon Arias Gomez";
        String ExpectVacancy = "Payroll Administrator";
        String ExpectStatusVacancy = "Hired";
        OnStage.theActorInTheSpotlight().should(
                seeThat("Validate text Full Name Vacancy", QuestionRecruitments.titleFullName(), equalTo(ExpectFullName)),
                seeThat("Validate text Vacancy", QuestionRecruitments.titleVacancy(), equalTo(ExpectVacancy)),
                seeThat("Validate text Status Vacancy", QuestionRecruitments.titleHired(), equalTo(ExpectStatusVacancy))
                );
    }

}
