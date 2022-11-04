package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features = "features/EnquiryForm.feature",
	glue = {"stepDefinitions"},
	plugin = {"html:target/cucumber-html-report_Enquiry.html", "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt", "usage:target/cucumber-usage.json", "junit:target/cucumber-results_Enquiry.xml"}
)
public class RunnerEnquiryForm extends AbstractTestNGCucumberTests {

}
