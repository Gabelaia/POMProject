package PageObject;

import org.openqa.selenium.By;

public class LoginObject {

    protected By
        emailField = By.name("session_key"),
        passwordField = By.name("session_password"),
        logInButton = By.xpath("//*[@id=\"main-content\"]/section[1]/div/div/form/div[2]/button");

}
