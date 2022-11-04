package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features = "features/FieldValidations.feature",
	glue = {"stepDefinitions"},
	plugin = {"html:target/cucumber-html-report_Fields.html", "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt", "usage:target/cucumber-usage.json", "junit:target/cucumber-results_Fields.xml"}
)
public class RunnerFieldValidations extends AbstractTestNGCucumberTests {

}
