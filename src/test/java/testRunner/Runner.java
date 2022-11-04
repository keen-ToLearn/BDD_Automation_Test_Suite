package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features = "features/HomeServicesDropDown.feature",
	glue = {"stepDefinitions"},
	plugin = {"html:target/cucumber-html-report_DropLinks.html", "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt", "usage:target/cucumber-usage.json", "junit:target/cucumber-results_DropLinks.xml"}
)
public class Runner extends AbstractTestNGCucumberTests {

}
