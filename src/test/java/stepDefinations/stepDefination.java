package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {

	
	@Given("User is on NetBanking landing page")
	public void user_is_on_net_banking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("Loggin to the Page");
	}

	@When("User login into application with {string} and password {string}")
	public void user_login_into_application_with_and_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions

            System.out.println(string);
            System.out.println(string2);
	}

	@Then("Home page is populated")
	public void home_page_is_populated() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Validate the HomePage ");
	}

	@Then("Cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Validate the CardsPage ");
	}
	
	@Then("Cards displayed are {string}")
	public void cards_displayed_are(String string) {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println(string);
	}
	    

}
