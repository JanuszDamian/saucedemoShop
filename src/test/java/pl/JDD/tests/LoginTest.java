package pl.JDD.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pl.JDD.pages.LoginPage;

public class LoginTest extends BaseTest{

    @Test
    public void loginUserTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openProductPage("standard_user","secret_sauce");
    }
}
