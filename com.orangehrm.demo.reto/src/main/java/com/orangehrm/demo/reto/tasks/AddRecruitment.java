package com.orangehrm.demo.reto.tasks;

import com.orangehrm.demo.reto.userinterface.DemoOrangeHrmIsPage;
import com.orangehrm.demo.reto.userinterface.DemoOrangeHrmRecruitmentPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.io.File;
import java.nio.file.Paths;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddRecruitment implements Task {



    File baseFile = new File("src/test/resources/files/CV.txt");
    String path = baseFile.getAbsolutePath();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DemoOrangeHrmRecruitmentPage.OPTION_RECRUITMENT),
                Click.on(DemoOrangeHrmRecruitmentPage.BUTTON_ADD),
                Enter.theValue("Jhon").into(DemoOrangeHrmRecruitmentPage.INPUT_FIRST_NAME),
                Enter.theValue("Arias").into(DemoOrangeHrmRecruitmentPage.INPUT_MIDDLE_NAME),
                Enter.theValue("Gomez").into(DemoOrangeHrmRecruitmentPage.INPUT_LAST_NAME),
                WaitUntil.the(DemoOrangeHrmRecruitmentPage.DROPDOWN_VACANCY , isEnabled()).forNoMoreThan(20).seconds(),
                Click.on(DemoOrangeHrmRecruitmentPage.DROPDOWN_VACANCY),
                WaitUntil.the(DemoOrangeHrmRecruitmentPage.OPTION_VACANCY , isEnabled()).forNoMoreThan(20).seconds(),
                Click.on(DemoOrangeHrmRecruitmentPage.OPTION_VACANCY),
                Enter.theValue("JhonArias@email.com").into(DemoOrangeHrmRecruitmentPage.INPUT_EMAIL),
                Enter.theValue("3264564654").into(DemoOrangeHrmRecruitmentPage.INPUT_CONTACT),
                Enter.keyValues(path).into(DemoOrangeHrmRecruitmentPage.INPUT_FILE_RESUME),
                Enter.theValue("QA").into(DemoOrangeHrmRecruitmentPage.INPUT_KEYWORDS),
                Enter.theValue("Esto es una postulacion para una hoja de vida").into(DemoOrangeHrmRecruitmentPage.INPUT_NOTES),
                Click.on(DemoOrangeHrmRecruitmentPage.BUTTON_SAVE)
                );
    }
}
