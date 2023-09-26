package steps;

import context.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.BrowserWrapper;
import org.example.ui.MainPage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchSteps extends Steps {
    public SearchSteps(TestContext context) {
        super(context);
    }

    @When("On Search field - I search for {string}")
    public void onSearchFieldISearchFor(String name) throws InterruptedException {
        BrowserWrapper browserWrapper = context.get("BrowserWrapper");
        MainPage homePage = browserWrapper.getCurrentPage();
        homePage.searchItem(name);
    }

    @Then("I am in {string} search page")
    public void iAmInSearchPage(String name) {
        BrowserWrapper browserWrapper = context.get("BrowserWrapper");
        boolean found = browserWrapper.getPageSource().contains(name);
        int retries=0;
        while(!found && retries < 10){
            found = browserWrapper.getPageSource().contains(name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            retries++;
        }
        assertTrue(browserWrapper.getPageSource().contains(name));
    }
}
