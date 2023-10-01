package steps;

import com.google.gson.JsonObject;
import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.*;
import org.example.ui.Login;
import org.example.ui.MainPage;
import org.json.JSONObject;
import org.openqa.selenium.JavascriptExecutor;

import java.io.IOException;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginSteps extends Steps{

    public LoginSteps(TestContext context) {
        super(context);
    }

    @Given("I have navigated to Rami Levi")
    public void iHaveNavigatedToRamiLevi() {
        BrowserWrapper browserWrapper = new BrowserWrapper();
        context.put("BrowserWrapper", browserWrapper);
        browserWrapper.createPage(MainPage.class, "http://rami-levy.co.il");

    }

    @When("On login popup - I login with user '{}' and password '{}'")
    public void iLoginWithUserTzahiTzahiComAndPasswordAa(String user, String password) throws InterruptedException {
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
    public void onRamiLeviHomePage(String name) {
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

    @And("I login with user {string} and password {string} using Api")
    public void iLoginWithUserAndPasswordUsingApi(String user , String password) throws IOException, InterruptedException {
        BrowserWrapper browserWrapper = context.get("BrowserWrapper");
        ResponseWrapper<JSONObject> loginResponse = Api.loginUser();
        String s ="{\"authuser\":{\"user\":" + loginResponse.getData().get("user").toString() +"}}";
        browserWrapper.executeJavascript(String.format("window.localStorage.setItem('ramilevy','%s')",s));
        browserWrapper.refresh();
    }


}
