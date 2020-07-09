package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static DriverFactory driverFactory = new DriverFactory();

    private static WebDriver driver;


    private DriverFactory(){
    }

    public static DriverFactory getInstance(){
        return driverFactory;
    }


    public void initDriver(String browser){

        if (browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else {
            System.out.println("Please check your browser name");
        }

        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();


    }











}
