package test_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features ="Featurefilefolder", 
		features ="C:\\Users\\sunda\\eclipse-workspace\\Project_Nov\\Featurefilefolder\\NewLogin.feature",
		//glue="stepDefn",
		    glue="C:\\Users\\sunda\\eclipse-workspace\\Project_Nov\\src\\test\\java\\stepDefn\\Step_Defi_class.java",
//		plugin={"pretty","html:test-output","json:json_output/cucumber.json",
//				"junit:junit_xml_output/cucumber.xml"},
		plugin= {"pretty","html:test-output", "json:target/cucumber-json-report.json" },
		dryRun = false,
		monochrome = true
		
		)

public class Mytestrunnercls {

}
