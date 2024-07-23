package com.orangehrm.demo.reto.tasks;

import com.orangehrm.demo.reto.userinterface.DemoOrangeHrmRecruitmentPage;
import cucumber.api.java.hu.De;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SaveProccessHire implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DemoOrangeHrmRecruitmentPage.BUTTON_SUCCES),
                Click.on(DemoOrangeHrmRecruitmentPage.BUTTON_SAVE),
                Click.on(DemoOrangeHrmRecruitmentPage.BUTTON_SUCCES),
                Click.on(DemoOrangeHrmRecruitmentPage.BUTTON_SAVE),
                Enter.theValue("QA").into(DemoOrangeHrmRecruitmentPage.INPUT_INTERVIEW_TITLE),
                WaitUntil.the(DemoOrangeHrmRecruitmentPage.INPUT_INTERVIEWEER , isVisible()).forNoMoreThan(20).seconds(),
                SendKeys.of("Sa").into(DemoOrangeHrmRecruitmentPage.INPUT_INTERVIEWEER),
                WaitUntil.the(DemoOrangeHrmRecruitmentPage.INPUT_INTERVIEWEER , isVisible()).forNoMoreThan(20).seconds(),
                WaitUntil.the(DemoOrangeHrmRecruitmentPage.SELECT_OPTION_INTERVIEWEER ,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(DemoOrangeHrmRecruitmentPage.SELECT_OPTION_INTERVIEWEER),
                WaitUntil.the(DemoOrangeHrmRecruitmentPage.INPUT_DATE ,isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue("2024-09-23").into(DemoOrangeHrmRecruitmentPage.INPUT_DATE),
                Scroll.to(DemoOrangeHrmRecruitmentPage.BUTTON_SAVE),
                WaitUntil.the(DemoOrangeHrmRecruitmentPage.BUTTON_SAVE , isEnabled()).forNoMoreThan(20).seconds(),
                Click.on(DemoOrangeHrmRecruitmentPage.BUTTON_SAVE),
                Click.on(DemoOrangeHrmRecruitmentPage.BUTTON_SUCCES),
                Click.on(DemoOrangeHrmRecruitmentPage.BUTTON_SAVE),
                Click.on(DemoOrangeHrmRecruitmentPage.BUTTON_JOB),
                Click.on(DemoOrangeHrmRecruitmentPage.BUTTON_SAVE),
                Click.on(DemoOrangeHrmRecruitmentPage.BUTTON_SUCCES),
                Click.on(DemoOrangeHrmRecruitmentPage.BUTTON_SAVE),
                Click.on(DemoOrangeHrmRecruitmentPage.OPTION_RECRUITMENT)
                );
    }
}
