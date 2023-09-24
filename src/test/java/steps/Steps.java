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



//    Scenario: login
//    When On the upper bar - I click ‘login’
//    And I insert Email and Password
//    And I click on the login button
//    Then Personal page appeares


}
