package stepDefn;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hooks_stepDefn {
	
	@Before
	public void setup() {
		System.out.println("Launch the browser");
		System.out.println("Enter the URL");
	}
	@After
	public void tearDown() { 
	     System.out.println("Close Browser");
	}
	
	@Given("user is on add customer page")
	public void user_is_on_add_customer_page() {
		System.out.println("User is on add customer page"); //we need to write selenium code
	}

	@When("user fills the customer details")
	public void user_fills_the_customer_details() {
		System.out.println("User fills the customer details");
	}

	@Then("customer is added")
	public void customer_is_added() {
		System.out.println("Now customer is added");
	}

	@Given("user is on edit customer page")
	public void user_is_on_edit_customer_page() {
		System.out.println("User is on edit customer page");
	}

	@When("user edits contact details")
	public void user_edits_contact_details() {
		System.out.println("User edits contact details");
		
	}

	@Then("contact details updated")
	public void contact_details_updated() {
		System.out.println("Contact details updated");
	}

	@Given("user is on delete customer page")
	public void user_is_on_delete_customer_page() {
		System.out.println("User is on delete customer page");
	}

	@When("user deletes customer")
	public void user_deletes_customer() {
		System.out.println("User deletes customer");
	}

	@Then("customer has deleted")
	public void customer_has_deleted() {
		System.out.println("Customer has deleted");
	}


}
