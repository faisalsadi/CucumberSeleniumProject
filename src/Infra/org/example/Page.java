package org.example;

import org.openqa.selenium.WebDriver;

public class Page {
    protected WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
    }
}
