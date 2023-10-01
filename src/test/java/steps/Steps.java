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

    protected TestContext context;

    public Steps(TestContext context) {
        this.context = context;
    }


}
