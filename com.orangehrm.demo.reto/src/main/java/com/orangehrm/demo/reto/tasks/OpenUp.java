package com.orangehrm.demo.reto.tasks;

import com.orangehrm.demo.reto.userinterface.DemoOrangeHrmIsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {

    private DemoOrangeHrmIsPage demoOrangeHrmIsPage;
    public static Performable thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(demoOrangeHrmIsPage));

    }

}
