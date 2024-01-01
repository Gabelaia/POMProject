package DataObject;

import com.github.javafaker.Faker;

public class LogInData {
    static Faker faker1 = new Faker();
    public static String
        correctEmailData = "lectures@lelagabelaia.com",
        correctPasswordData = "Password30!",
        incorrectEmailData = faker1.bothify("????##?@gmail.com"),
        incorrectPasswordData = faker1.name().firstName();



}
