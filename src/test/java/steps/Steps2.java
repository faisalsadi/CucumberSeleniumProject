package steps;

import context.TestContext;
import io.cucumber.java.en.When;

public class Steps2 {

    private TestContext context;
    public Steps2(TestContext context) {
        this.context=context;
    }

    @When("Put {} in context key {}")
    public void putSomthingInContextKeyThing(String value, String key) {
        this.context.put(key,value);
    }


}