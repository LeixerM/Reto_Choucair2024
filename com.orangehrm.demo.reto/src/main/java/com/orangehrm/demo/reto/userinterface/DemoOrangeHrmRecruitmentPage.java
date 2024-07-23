package com.orangehrm.demo.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoOrangeHrmRecruitmentPage {

    public static final Target OPTION_RECRUITMENT = Target.the("Option Recruitment").
            located(By.xpath("//a[.='Recruitment']"));

    public static final Target BUTTON_ADD = Target.the("Option Recruitment").
            located(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']"));


    public static final Target INPUT_FIRST_NAME = Target.the("where do writer firstName").
            located(By.name("firstName"));

    public static final Target INPUT_MIDDLE_NAME = Target.the("where do writer firstName").
            located(By.name("middleName"));

    public static final Target INPUT_LAST_NAME = Target.the("where do writer firstName").
            located(By.name("lastName"));

    public static final Target DROPDOWN_VACANCY = Target.the("where do writer firstName").
            located(By.cssSelector(".oxd-select-text"));

    public static final Target OPTION_VACANCY = Target.the("where do writer Option Vacancy").
            located(By.xpath("//span[contains(.,'Payroll Administrator')]"));
    public static final Target INPUT_EMAIL = Target.the("where do writer Email").
            located(By.xpath("(//input[@data-v-1f99f73c])[5]"));
    public static final Target INPUT_CONTACT = Target.the("where do writer Input_Contact").
            located(By.xpath("(//input[@data-v-1f99f73c])[6]"));

    public static final Target INPUT_FILE_RESUME = Target.the("where do writer Input File resume").
            located(By.xpath("//input[@type='file']"));

    public static final Target INPUT_KEYWORDS = Target.the("where do writer Keywords").
            located(By.cssSelector("[placeholder='Enter comma seperated words...']"));

    public static final Target INPUT_NOTES = Target.the("where do writer firstName").
            located(By.cssSelector(".oxd-textarea"));

    public static final Target BUTTON_SAVE = Target.the("where do writer firstName").
            located(By.cssSelector(".oxd-button--secondary"));

    public static final Target BUTTON_SUCCES = Target.the("where do writer firstName").
            located(By.cssSelector(".oxd-button--success"));

    public static final Target BUTTON_SEARCH = Target.the("where do writer firstName").
            located(By.cssSelector(".orangehrm-left-space"));


    public static final Target INPUT_INTERVIEW_TITLE = Target.the("where do writer firstName").
            located(By.xpath("(//input[contains(@class,'oxd-input oxd-input--active')])[6]"));

    public static final Target INPUT_INTERVIEWEER = Target.the("where do writer Input Intervieweer").
            located(By.cssSelector(".oxd-autocomplete-text-input > input"));

    public static final Target SELECT_OPTION_INTERVIEWEER = Target.the("where do writer select option Intervieweer").
            locatedBy("//div[@role='listbox' and contains(@class, 'oxd-autocomplete-dropdown')]//div[@role='option' and contains(@class, 'oxd-autocomplete-option')][1]/span");

    public static final Target INPUT_DATE = Target.the("where do writer Date").
            located(By.cssSelector("[placeholder='yyyy-dd-mm']"));

    public static final Target BUTTON_JOB = Target.the("where do writer select option Intervieweer").
            located(By.xpath("//button[contains(.,'Offer Job')]"));


    public static final Target DROPDOWN_LIST_STATUS_VACANCY = Target.the("where do writer select option Intervieweer").
            locatedBy(".oxd-form div:nth-of-type(4) div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1)");

    public static final Target OPTION_LIST_STATUS_VACANCY = Target.the("where do writer select option Intervieweer").
            located(By.xpath("//span[.='Hired']"));

    public static final Target TEXT_HIRED = Target.the("where do writer text hired").
            located(By.xpath("//div[@class='oxd-table-card']//div[@class='oxd-table-cell oxd-padding-cell']/div[.='Hired']"));

    public static final Target TEXT_VACANCY = Target.the("where do writer text hired").
            located(By.xpath("//div[@class='oxd-table-card']//div[@class='oxd-table-cell oxd-padding-cell']/div[.='Payroll Administrator']"));

    public static final Target TEXT_FULL_NAME = Target.the("where do writer text hired").
            located(By.xpath("//div[@class='oxd-table-card']//div[@class='oxd-table-cell oxd-padding-cell']/div[.='Jhon Arias Gomez']"));





}
