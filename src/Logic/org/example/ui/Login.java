package org.example.ui;

import org.example.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*


<button data-v-5f56f444="" data-v-1cf3984f="" tabindex="0" class="focus-item online-full-btn mt-4 px-5 height-50" aria-label="כניסה"><span data-v-5f56f444="">
                כניסה
            </span></button>


            #__BVID__388___BV_modal_body_ > div > div:nth-child(2) > div > div > div.text-center.p-2.px-md-5.mt-3 > button
 */

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
        passwordField.sendKeys(password);
        loginButton.click();
        WebDriverWait wait=new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'faisal')]")));

    }

    public String getNameTag() {
        return driver.findElement(By.xpath("//div[contains(text(),\"כניסה\")]")).getText();
    }
}
