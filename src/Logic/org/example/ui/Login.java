package org.example.ui;

import org.example.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Login extends Page {
    private  static  String emailLocator = "email";
    private  static  String passwordLocator = "password";
    private  static  String loginButtonLocator ="//button[@aria-label='כניסה']";
    private WebElement emailField ;
    private WebElement passwordField ;
    private WebElement loginButton ;
    public Login(WebDriver driver) {
        super(driver);
        init();
    }

    private void init() {
        emailField= driver.findElement(By.id(emailLocator));
        passwordField= driver.findElement(By.id(passwordLocator));
        loginButton= driver.findElement(By.xpath(loginButtonLocator));
    }

    public void loginFlow(String email,String password) throws InterruptedException {
        emailField.sendKeys(email);
        Thread.sleep(2000);
        passwordField.sendKeys(password);
        Thread.sleep(2000);
        loginButton.click();
        Thread.sleep(2000);


    }

    public String getNameTag() {
        return driver.findElement(By.xpath("//div[contains(text(),\"כניסה\")]")).getText();
    }
}
