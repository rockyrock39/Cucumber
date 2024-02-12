package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	

	    @Before
	    public void setUp() {
	        // Code to set up preconditions before each scenario
	        System.out.println("Setting up before scenario...");
	    }

	    @After
	    public void tearDown() {
	        // Code to clean up after each scenario
	        System.out.println("Tearing down after scenario...");
	    }

	    @Before
	    public void setUp() {
	        // Code to set up preconditions before each scenario
	        System.out.println("Setting up before scenario...");
	    }

	    @After
	    public void tearDown() {
	        // Code to clean up after each scenario
	        System.out.println("Tearing down after scenario...");
	    }

}
