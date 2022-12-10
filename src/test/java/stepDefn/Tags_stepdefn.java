package stepDefn;

import io.cucumber.java.en.Given;

public class Tags_stepdefn {
	
		
		@Given("Check the valid login")
		public void check_the_valid_login() {
			System.out.println("login successful");
		}

		@Given("Check the logout")
		public void check_the_logout() {
			System.out.println("logout done");
		}

		@Given("check the search option")
		public void check_the_search_option() {
			System.out.println("search icon visible");
		}

		@Given("check the above option")
		public void check_the_above_option() {
			System.out.println("About works fine");
		}

		@Given("check the contact us part")
		public void check_the_contact_us_part() {
			System.out.println("Contack us done");
		}

		@Given("Check the Home page")
		public void check_the_home_page() {
			System.out.println("Homepagevisible");
		}

	}

//output:

/*  Launch the browser
Enter the URL
User is on add customer page
User fills the customer details
Now customer is added
Close Browser
Launch the browser
Enter the URL
User is on edit customer page
User edits contact details
Contact details updated
Close Browser
Launch the browser
Enter the URL
User is on delete customer page
User deletes customer
Customer has deleted
Close Browser   */       


