package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestPinterestPage {
    WebDriver driver;
    PinterestPage page;


    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sabri\\Documents\\selenium driver\\selenium driver\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.pinterest.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void verifyFunctions(){
        page = new PinterestPage(driver);

        page.clickSignUpButton();
        page.clickEmail("brinaresh1@gmail.com");
        page.clickOnPassword("apple");
        page.clickOnAge("10");
        page.clickContinueButton();
    }

    @AfterClass
    public void closingThePage(){
        driver.quit();
    }
}