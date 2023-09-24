package steps;

import context.TestContext;
import io.cucumber.java.en.When;
import org.example.BrowserWrapper;
import org.example.ui.Login;
import org.example.ui.MainPage;

public class LogOutSteps {
    private TestContext context;

    public LogOutSteps(TestContext context) {
        this.context = context;
    }
    @When("On Main Page sign out from account")
    public void logOut()
    {
        BrowserWrapper browserWrapper = context.get("BrowserWrapper");
        MainPage page = browserWrapper.getCurrentPage();
        page.logOut();
    }
}
