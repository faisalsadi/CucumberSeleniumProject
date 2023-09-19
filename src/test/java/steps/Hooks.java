package steps;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class Hooks {
    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before All 123");
    }

    @Before
    public void before(){
        System.out.println("Before");
    }
}
