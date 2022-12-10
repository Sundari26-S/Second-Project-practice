package test_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\sunda\\eclipse-workspace\\Project_Nov\\Featurefilefolder\\Tagpurpose.feature",
glue="stepDefn",
plugin = {"html:Report/HtmlReport"},
dryRun=false,
monochrome = true,
tags= ("@SanityTest")      //execute only sanity test

		 
//strict=false
		) 
public class Tags_testrunner {

}
