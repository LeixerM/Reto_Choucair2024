package com.orangehrm.demo.reto.tasks;

import com.orangehrm.demo.reto.userinterface.DemoOrangeHrmRecruitmentPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchStatusVacancy implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DemoOrangeHrmRecruitmentPage.DROPDOWN_LIST_STATUS_VACANCY),
                WaitUntil.the(DemoOrangeHrmRecruitmentPage.OPTION_LIST_STATUS_VACANCY , isVisible()).forNoMoreThan(20).seconds(),
                Click.on(DemoOrangeHrmRecruitmentPage.OPTION_LIST_STATUS_VACANCY),
                Click.on(DemoOrangeHrmRecruitmentPage.BUTTON_SUCCES)
        );
    }
}
