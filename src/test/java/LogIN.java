import StepObject.LogInSteps;
import Utils.BrowserActions;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static DataObject.LogInData.*;

public class LogIN extends BrowserActions {
    @Test
    public void loginWithInCorrectData() throws InterruptedException {
        LogInSteps step1 = new LogInSteps(driver);
        step1.emailFieldAction(incorrectEmailData);
        step1.passwordFieldAction(incorrectPasswordData);
        step1.logInButtonAction();

//        String
//                expectedResult = "Let's do a quick security check",
//                actualResult = driver.findElement(By.tagName("h1")).getText();
//
//        SoftAssert softAssert = new SoftAssert();
//        softAssert.assertEquals(actualResult, expectedResult);
//
//        softAssert.assertAll();
//        Thread.sleep(5000);
    }

    @Test
    public void loginWithCorrectData(){
        LogInSteps step1 = new LogInSteps(driver);
        step1.emailFieldAction(correctEmailData);
        step1.passwordFieldAction(correctPasswordData);
        step1.logInButtonAction();
    }
}
