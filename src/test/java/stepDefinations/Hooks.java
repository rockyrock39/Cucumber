package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	

	    @Before(order = 1,value = "@smoke")
	    public void setUp() {
	        // Code to set up preconditions before each scenario
	        System.out.println("Setting up before scenario...");
	    }

	    @After(order = 1,value = "@smoke")
	    public void tearDown() {
	        // Code to clean up after each scenario
	        System.out.println("Tearing down after scenario...");
	    }
	    @Before(order = 2,value = "@smoke")
	    public void setUpSecond() {
	        // Additional setup before scenarios
	        System.out.println("Setting up second...");
	    }

	    @After(order = 2 ,value = "@smoke")
	    public void tearDownSecond() {
	        // Additional cleanup after scenarios
	        System.out.println("Tearing down second...");
	    }


	    @Before("@setup")
	    public void setUp1() {
	        // Code to set up preconditions before each scenario
	        System.out.println("Setting up before scenario with @setup tag..");
	    }

	    @After("@cleanup")
	    public void tearDown1() {
	        // Code to clean up after each scenario
	        System.out.println("Tearing down after scenario with @cleanup tag...");
	    }

}
