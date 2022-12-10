package test_Runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\sunda\\eclipse-workspace\\Project_Nov\\Featurefilefolder\\Hooks.feature",
glue="stepDefn",
plugin = {"html:Report/HtmlReport"},
dryRun=false,
monochrome = true)

public class Hooks_Testrunner {

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
