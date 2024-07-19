package com.orangehrm.demo.reto.tasks;

import com.orangehrm.demo.reto.userinterface.DemoOrangeHrmIsLoginPage;
import com.orangehrm.demo.reto.userinterface.DemoOrangeHrmIsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class Login implements Task {

    private String strUser;
    private String strPassword;

    public Login(String strUser, String strPassword) {
        this.strUser = strUser;
        this.strPassword = strPassword;
    }

    public static Performable onThePage(String strUser, String strPassword) {
        return Tasks.instrumented(Login.class,strUser,strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(DemoOrangeHrmIsLoginPage.INPUT_USER),
                Enter.theValue(strUser).into(DemoOrangeHrmIsLoginPage.INPUT_USER),
                Scroll.to(DemoOrangeHrmIsLoginPage.INPUT_PASSWORD),
                Enter.theValue(strPassword).into(DemoOrangeHrmIsLoginPage.INPUT_PASSWORD),
                Click.on(DemoOrangeHrmIsLoginPage.BUTTON_LOGIN)
        );
    }
}
