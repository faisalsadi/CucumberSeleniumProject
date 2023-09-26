package org.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BrowserWrapper {
    private static final String webDriverPath = "C:/Users/faisal/Desktop/chromedriver.exe";
    private Page currentPage;
    private WebDriver driver;
    public BrowserWrapper() {
        System.setProperty("webdriver.chrome.driver", webDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    public <T extends Page> T createPage(Class<T> pageType){
        return createPage(pageType, null);
    }

    public <T extends Page> T createPage(Class<T> pageType, String url){
        try {
            Constructor<T> constructor = pageType.getConstructor(WebDriver.class);
            if(url!=null){
                driver.get(url);
            }
            T page = constructor.newInstance(driver);
            currentPage = page;
            return page;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("relevant constructor not found", e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public void close(){
        driver.close();
    }
    public String getPageSource()
    {
        return driver.getPageSource();
    }
    public void refresh() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(driver, 5);
        driver.navigate().refresh();
    }
    public void executeJavascript(String exec)
    {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript(exec);
    }
    public void addCookie(String authToken)
    {
        driver.manage().addCookie(new org.openqa.selenium.Cookie("authToken", authToken));
    }

    public <T extends Page> T getCurrentPage(){
        return (T)currentPage;
    }

}

