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
import propertiesPage.APExploreInterior;

public class StepsExploreInterior {
	WebDriver driver;
	Driver baseDriver;
	APExploreInterior exploreInteriorProps;
	
	@Before
	public void setUp() {
		baseDriver = new Driver();
		driver = baseDriver.getChromeDriver();
		exploreInteriorProps = PageFactory.initElements(driver, APExploreInterior.class);
	}
	
	@Given("user is on interior design page")
	public void user_is_on_interior_design_page() {
		driver.manage().window().maximize();
		driver.get(baseDriver.getBaseID());
	}

	@When("user clicks explore now for modular kitchen")
	public void user_clicks_explore_now_for_modular_kitchen() {
		exploreInteriorProps.clickToExploreModularKitchen();
	}

	@Then("user sees modular kitchen page")
	public void user_sees_modular_kitchen_page() throws InterruptedException {
		Thread.sleep(2000);
		assertEquals(driver.getTitle(), "Modular Kitchen Interior Design & Decor Services - Asian Paints");
	}

	@When("user clicks explore now for bedroom")
	public void user_clicks_explore_now_for_bedroom() {
		exploreInteriorProps.clickToExploreBedroom();
	}

	@Then("user sees bedroom page")
	public void user_sees_bedroom_page() throws InterruptedException {
		Thread.sleep(2000);
		assertEquals(driver.getTitle(), "Bedroom Interior Design & Decor Services - Asian Paints");
	}

	@When("user clicks explore now for living room")
	public void user_clicks_explore_now_for_living_room() {
		exploreInteriorProps.clickToExploreLivingRoom();
	}

	@Then("user sees living room page")
	public void user_sees_living_room_page() throws InterruptedException {
		Thread.sleep(2000);
		assertEquals(driver.getTitle(), "Living Room Interior Design & Decor Services - Asian Paints");
	}

	@When("user clicks explore now for bathroom")
	public void user_clicks_explore_now_for_bathroom() {
		exploreInteriorProps.clickToExploreBathroom();
	}

	@Then("user sees bathroom page")
	public void user_sees_bathroom_page() throws InterruptedException {
		Thread.sleep(2000);
		assertEquals(driver.getTitle(), "Bathrooms Interior Design & Decor Services - Asian Paints");
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}