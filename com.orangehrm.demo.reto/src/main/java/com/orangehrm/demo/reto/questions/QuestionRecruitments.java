package com.orangehrm.demo.reto.questions;

import com.orangehrm.demo.reto.userinterface.DemoOrangeHrmIsLoginPage;
import com.orangehrm.demo.reto.userinterface.DemoOrangeHrmRecruitmentPage;
import net.serenitybdd.screenplay.Question;

public class QuestionRecruitments {

    public static Question<String> titleFullName(){
        return actor -> DemoOrangeHrmRecruitmentPage.TEXT_FULL_NAME.resolveFor(actor).getText().trim();
    }

    public static Question<String> titleVacancy(){
        return actor -> DemoOrangeHrmRecruitmentPage.TEXT_VACANCY.resolveFor(actor).getText().trim();
    }

    public static Question<String> titleHired(){
        return actor -> DemoOrangeHrmRecruitmentPage.TEXT_HIRED.resolveFor(actor).getText().trim();
    }
}
