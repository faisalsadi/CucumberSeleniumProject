package org.example.ui;

import org.example.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class MainPage extends Page {
    private static String loginButtonLocatorID = "login-user";
    private static String itemsLocatorID = "//div[@class='swiper-wrapper']";
    private static String itemLocatorID = "//div[@class='swiper-slide']";
    private static String profileButtonLocatorXpath= "//div[@class='online-profile online-profile-wrap-n cursor-pointer border-radius-20 d-flex align-items-center justify-content-center']";

    private static String logutButtonXpathLocator = "//div[@class='d-flex p-2 mt-5']";
    private static String emptyCartButtonIdLocator="remove-cart";
    private static String searchItemIdLocator = "destination";
    private static String userName="faisal";
    private WebElement loginButton;

    private  WebElement profileButton;
    private WebElement logout;
    private WebElement emptyCart;
    private WebElement search;
    public MainPage(WebDriver driver) {
        super(driver);
        init();
    }

    private void init() {
        loginButton= driver.findElement(By.id(loginButtonLocatorID));
        search=driver.findElement(By.id(searchItemIdLocator));
    }

    public void searchItem(String s) throws InterruptedException {
        search.sendKeys(s);
        search.sendKeys(Keys.ENTER);
    }

    public void clickLogin()
    {
        loginButton.click();
    }
    public void addItemToCart(String name) throws InterruptedException {

//        WebElement rowelement = items.get(row);
//        List<WebElement> cols = rowelement.findElements(By.xpath("./*"));

        // //button[@aria-label='הוסף 1 יחידות לשוקו טרה בבקבוק לסל הקניות']

//
        WebElement elem=driver.findElement(By.xpath("//h3[contains(text(),"+"\""+ name +"\")]"));

        //Creating object of an Actions class
        Actions action = new Actions(driver);

        //Performing the mouse hover action on the target element.
        action.moveToElement(elem).perform();
        Thread.sleep(3000);

        WebElement button = elem.findElement(By.xpath("//button[@aria-label='הוסף 1 יחידות ל"+name+" לסל הקניות']"));

        button.click();
//        driver.navigate().refresh();
//        init();
        Thread.sleep(5000);

    }
    public void removeItemFromCart() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.className("plus-minus"))).perform();
        Thread.sleep(2000);
        WebElement bt = driver.findElement(By.xpath("//button[@aria-label=\"הפחת 1 יחידות ממנה חמה שקית נודלס ט.בקר מסל הקניות\"]"));
        bt.click();
    }

    public void logOut()
    {
        profileButton=driver.findElement(By.xpath(profileButtonLocatorXpath));
        profileButton.click();
        logout = driver.findElement(By.xpath(logutButtonXpathLocator));
        logout.click();
    }
    public void emptyCart()
    {
        emptyCart=driver.findElement(By.id(emptyCartButtonIdLocator));
        emptyCart.click();
    }
    public String getNameTag()
    {
        loginButton=driver.findElement(By.id(loginButtonLocatorID));
        return loginButton.getText();
    }
    public boolean isItemInCart(String name)
    {
        try {
            driver.findElement(By.xpath("//div[contains(text(),"+"\""+name+"\")]"));
            return true;
        }catch (RuntimeException e)
        {
            return false;
        }
    }
}
