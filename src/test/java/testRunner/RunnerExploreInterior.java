package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features = "features/InteriorDesignExploreLinks.feature",
	glue = {"stepDefinitions"},
	plugin = {"html:target/cucumber-html-report_InteriorLinks.html", "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt", "usage:target/cucumber-usage.json", "junit:target/cucumber-results_InteriorLinks.xml"}
)
public class RunnerExploreInterior extends AbstractTestNGCucumberTests {

}
