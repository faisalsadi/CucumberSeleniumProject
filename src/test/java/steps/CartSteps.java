package steps;

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.BrowserWrapper;
import org.example.ui.MainPage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CartSteps {
    private TestContext context;

    public CartSteps(TestContext context) {
        this.context = context;
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
}
