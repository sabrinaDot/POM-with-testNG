package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PinterestPage {
    WebDriver driver;

    By signUpButton = By.xpath("//div[contains(text(),'Sign up')]");
    By email = By.id("email");
    By password = By.id("password");
    By age = By.id("age");
    By continueButton = By.xpath("//div[contains(text(),'Continue')]");

    public PinterestPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickContinueButton() {
        WebElement continueBtn = driver.findElement(continueButton);
        continueBtn.click();
    }
    public void clickOnAge(String text) {
        WebElement ageText = driver.findElement(age);
        ageText.sendKeys(text);
    }
    public void clickOnPassword(String text) {
        WebElement passwordText = driver.findElement(password);
        passwordText.sendKeys(text);
    }
    public void clickEmail(String text) {
        WebElement emailText = driver.findElement(email);
        emailText.sendKeys(text);
    }
    public void clickSignUpButton() {
        WebElement signUp = driver.findElement(signUpButton);
        signUp.click();
    }

}

