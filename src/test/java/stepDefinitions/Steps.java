package stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import driverHome.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import propertiesPage.APHome;

public class Steps {
	WebDriver driver;
	Driver baseDriver;
	
	private static int linkCount;
	
	static {
		linkCount = -1;
	}
	
	@Before
	public void setUp() {
		baseDriver = new Driver();
		driver = baseDriver.getChromeDriver();
	}
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
		driver.manage().window().maximize();
		driver.get(baseDriver.getBaseHome());
		linkCount++;
	}

	@When("user clicks on links in services menu")
	public void user_clicks_on_links_in_services_menu() {
		APHome homePageProps = PageFactory.initElements(driver, APHome.class);
		homePageProps.clickMainServicesLink();
		if(linkCount != 0) {
			switch(linkCount) {
			case 1:
				homePageProps.clickMainIDLink();
				break;
			case 2:
				homePageProps.clickMainSPLink();
				break;
			case 3:
				homePageProps.clickMainSanLink();
				break;
			case 4:
				homePageProps.clickMainWDLink();
				break;
			case 5:
				homePageProps.clickMainWPLink();
				break;
			}
		}
	}

	@Then("user is redirected to {string}")
	public void user_is_redirected_to(String string) throws InterruptedException {
		Thread.sleep(3000);
		assertEquals(driver.getTitle(), string);
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}