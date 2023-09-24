package steps;

import context.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.example.BrowserWrapper;

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
    public void tearDown()
    {
        BrowserWrapper browserWrapper = context.get("BrowserWrapper");
        browserWrapper.close();
        System.out.println("after");
    }
}
