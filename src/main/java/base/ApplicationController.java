package base;

import org.openqa.selenium.WebDriver;
import pages.CreateAccountPage;
import pages.HomePage;
import pages.SignInPage;

public class ApplicationController {


    private WebDriver driver;
    private HomePage homePage;
    private CreateAccountPage createAccountPage;
    private SignInPage signInPage;



    public ApplicationController(WebDriver driver){
        this.driver = driver;

        homePage = new HomePage(getDriver());
        createAccountPage = new CreateAccountPage(getDriver());



    }



    public WebDriver getDriver(){
        return driver;
    }



}
