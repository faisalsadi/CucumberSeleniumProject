package steps;

import context.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.example.Api;
import org.example.BrowserWrapper;
import org.example.ui.MainPage;

import java.io.IOException;

public class Hooks {
    private TestContext context;

    public Hooks(TestContext context) {
        this.context = context;
    }
    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before All 123");
    }

    @Before
    public void before(){
        System.out.println("Before");
    }
    @After
    public void tearDown() throws IOException {
        BrowserWrapper browserWrapper = context.get("BrowserWrapper");
//        try {
//            MainPage page = browserWrapper.getCurrentPage();
//            page.emptyCart();
//        }
//        catch (Exception e)
//        {
//            System.out.println("nothing happend");
//        }
        Api.emptycart();
        browserWrapper.close();

        System.out.println("after");
    }
}
