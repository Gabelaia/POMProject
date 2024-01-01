package StepObject;

import PageObject.LoginObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LogInSteps extends LoginObject {
    WebDriver driver;
    public LogInSteps(WebDriver driver1){
        driver = driver1;

    }

    public void emailFieldAction(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public void passwordFieldAction(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void logInButtonAction(){
        driver.findElement(logInButton).sendKeys(Keys.ENTER);
    }







}
