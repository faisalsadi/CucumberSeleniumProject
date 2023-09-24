package steps;

import context.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.BrowserWrapper;
import org.example.ui.Login;
import org.example.ui.MainPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginSteps {
    private TestContext context;

    public LoginSteps(TestContext context) {
        this.context = context;
    }

    @Given("I have navigated to Rami Levi")
    public void iHaveNavigatedToRamiLevi() {
        BrowserWrapper browserWrapper = new BrowserWrapper();
        context.put("BrowserWrapper", browserWrapper);
        MainPage ramiLeviHomePage = browserWrapper.createPage(MainPage.class, "http://rami-levy.co.il");

    }

    @When("On login popup - I login with user '{}' and password '{}'")
    public void iLoginWithUserTzahiTzahiComAndPasswordAa(String user, String password) {
        BrowserWrapper browserWrapper = context.get("BrowserWrapper");
        Login page = browserWrapper.getCurrentPage();
        page.loginFlow(user, password);
        browserWrapper.createPage(MainPage.class);
    }

    @Given("On Rami Levi home page - I click login")
    public void onRamiLeviHomePageIClickLogin() {
        BrowserWrapper browserWrapper = context.get("BrowserWrapper");
        MainPage page = browserWrapper.getCurrentPage();
        page.clickLogin();
        browserWrapper.createPage(Login.class);
        context.put("Login", browserWrapper.getCurrentPage());
    }

    @Then("On Rami Levi home page - '{}'")
    public void onRamiLeviHomePageTzahi(String name) {
        BrowserWrapper browserWrapper = context.get("BrowserWrapper");
        MainPage homePage = browserWrapper.getCurrentPage();
        String currentText = homePage.getNameTag();
        int retries=0;
        while(!currentText.equals(name) && retries < 10){
            currentText = homePage.getNameTag();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            retries++;
        }
        assertEquals(name, currentText);
    }
    @Then("I am still at login popup")
    public void iAmStillAtLoginPopup() {
        Login loginPage = context.get("Login");
        String currentText = loginPage.getNameTag();
        int retries=0;
        while(!currentText.equals("כניסה") && retries < 10){
            currentText = loginPage.getNameTag();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            retries++;
        }
        assertEquals("כניסה", currentText);


    }
}
