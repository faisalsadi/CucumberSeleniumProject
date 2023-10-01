package steps;

import context.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.example.Api;
import org.example.BrowserWrapper;
import org.example.ResponseWrapper;
import org.example.ui.MainPage;

import java.io.IOException;

public class Hooks {
    private TestContext context;

    public Hooks(TestContext context) {
        this.context = context;
    }

    @After
    public void tearDown() throws IOException {
        BrowserWrapper browserWrapper = context.get("BrowserWrapper");
        Api.emptycart();
        browserWrapper.close();

        System.out.println("after");
    }
}
