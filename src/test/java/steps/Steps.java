package steps;

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;
import org.example.BrowserWrapper;
import org.example.ui.Login;
import org.example.ui.MainPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Steps {

//    @Given("I'm running a test")
//    public void iMRunningATest() {
//        System.out.println("Running a test");
//    }
//    @When("User enter credentials")
//    public void cred(DataTable table){
//        List<Map<String, String>> rows = table.asMaps();
//        for (Map<String, String> row :
//                rows) {
//            System.out.println(row.get("username") +":"+ row.get("password"));
//        }
//        List<Credentials> credentials = convertTable(table, Credentials.class);
//        credentials.forEach(cred -> System.out.println(cred.getUsername()+"::"+cred.getPassword()));
//    }
//
//    private <T> List<T> convertTable(DataTable table, Class<T> clz){
//        List<Map<String, String>> rows = table.asMaps();
//        Field[] declaredFields = clz.getDeclaredFields();
//        return rows.stream().map(row -> {
//            T item;
//            try {
//                item = clz.getDeclaredConstructor().newInstance();
//                Arrays.stream(declaredFields).forEach(field -> {
//                    try {
//                        field.setAccessible(true);
//                        field.set(item,row.get(field.getName()));
//                    } catch (IllegalAccessException e) {
//                        throw new RuntimeException(e);
//                    }
//                });
//            } catch (InstantiationException | NoSuchMethodException | InvocationTargetException |
//                     IllegalAccessException e) {
//                throw new RuntimeException(e);
//            }
//            return item;
//        }).collect(Collectors.toList());
//    }
//
//    @Given("Print {}")
//    public void print(String text) {
//        System.out.println("printing "+ text);
//    }

    private TestContext context;

    public Steps(TestContext context) {
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

//    Scenario: login
//    When On the upper bar - I click ‘login’
//    And I insert Email and Password
//    And I click on the login button
//    Then Personal page appeares


}
