package com.orangehrm.demo.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoOrangeHrmIsLoginPage {

    public static final Target INPUT_USER = Target.the("where do writer user").
            located(By.name("username"));

    public static final Target INPUT_PASSWORD = Target.the("where do writer password").
            located(By.name("password"));

    public static final Target BUTTON_LOGIN = Target.the("where button Login").
            located(By.xpath("//button[@type='submit']"));

    public static final Target TEXT_MAIN_PAGE = Target.the("where button Login").
            located(By.cssSelector(".oxd-text--h6"));
}
