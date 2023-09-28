package steps;

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.BrowserWrapper;
import org.example.ui.MainPage;

import static org.junit.jupiter.api.Assertions.*;

public class CartSteps extends Steps {
    public CartSteps(TestContext context) {
        super(context);
    }
//    @And("I am logged in into my account")
//    public void iAmLoggedInIntoMyAccount() {
//
//    }

    @When("I click on add item {string}")
    public void iClickOnAddItem(String name) throws InterruptedException {
        BrowserWrapper browserWrapper = context.get("BrowserWrapper");
        MainPage homePage = browserWrapper.getCurrentPage();
        Thread.sleep(2000);
        homePage.addItemToCart(name);
    }

    @And("I click on add item before remove {string}")
    public void andIClickOnAddItem(String name) throws InterruptedException {
        BrowserWrapper browserWrapper = context.get("BrowserWrapper");
        MainPage homePage = browserWrapper.getCurrentPage();
        Thread.sleep(2000);
        homePage.addItemToCart(name);
    }

    @Then("Item {string} is in the cart")
    public void itemIsInTheCart(String name) {
        BrowserWrapper browserWrapper = context.get("BrowserWrapper");
        MainPage homePage = browserWrapper.getCurrentPage();
        boolean found = homePage.isItemInCart(name);
        int retries=0;
        while(!found && retries < 10){
            found = homePage.isItemInCart(name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            retries++;
        }
        assertTrue(found);
    }
    @Then("Item {string} is not in the cart")
    public void itemNotInTheCart(String name) {
        BrowserWrapper browserWrapper = context.get("BrowserWrapper");
        MainPage homePage = browserWrapper.getCurrentPage();
        boolean found = homePage.isItemInCart(name);
        int retries=0;
        while(!found && retries < 10){
            found = homePage.isItemInCart(name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            retries++;
        }
        assertFalse(found);
    }

    @When("I click on remove item {string}")
    public void iClickOnRemoveItem(String itemXpathName) throws InterruptedException {
        BrowserWrapper browserWrapper = context.get("BrowserWrapper");
        MainPage homePage = browserWrapper.getCurrentPage();
        Thread.sleep(2000);
        homePage.removeItemFromCart(itemXpathName);
    }
}


