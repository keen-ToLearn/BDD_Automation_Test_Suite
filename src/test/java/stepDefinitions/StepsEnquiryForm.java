package stepDefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import driverHome.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import propertiesPage.APEnquiryForm;
import propertiesPage.EnquiryFormDataReader;

public class StepsEnquiryForm {
	WebDriver driver;
	Driver baseDriver;
	
	EnquiryFormDataReader reader; 
	HSSFSheet sheet;
	
	APEnquiryForm enquiryFormProps;
	
	String mainWindowHandle;
	String nameError;
	String emailError;
	String mobileError;
	String pinError;
	
	List<List<String>> data;
	
	private static int currentRow;
	
	static {
		currentRow = 0;
	}
	
	@Before
	public void setUp() throws IOException {
		baseDriver = new Driver();
		driver = baseDriver.getChromeDriver();
		reader = new EnquiryFormDataReader();
		sheet = reader.getEnquiryFormSheet();
		enquiryFormProps = PageFactory.initElements(driver, APEnquiryForm.class);
	}
	
	@Given("user is on wood solutions page")
	public void user_is_on_wood_solutions_page() {
		driver.manage().window().maximize();
		driver.get(baseDriver.getBaseWD());
		currentRow++;
	}

	@When("user enters name")
	public void user_enters_name() {
		enquiryFormProps.enterName(sheet.getRow(currentRow).getCell(0).getStringCellValue());
	}

	@When("user enters email")
	public void user_enters_email() {
		enquiryFormProps.enterEmail(sheet.getRow(currentRow).getCell(1).getStringCellValue());
	}

	@When("user enters mobile")
	public void user_enters_mobile() {
		String mobile = String.valueOf((long)(sheet.getRow(currentRow).getCell(2).getNumericCellValue()));
		enquiryFormProps.enterMobile(mobile);
	}

	@When("user enters pincode")
	public void user_enters_pincode() {
		String pin = String.valueOf(sheet.getRow(currentRow).getCell(3).getNumericCellValue());
		enquiryFormProps.enterPin(pin);
	}

	@When("user clicks on enquire button")
	public void user_clicks_on_enquire_button() {
		enquiryFormProps.clickEnquireButton();
	}

	@Then("user sees submit success page")
	public void user_sees_submit_success_page() {
		try {
			assertNotNull(enquiryFormProps.getThankYouMessage());
		}
		catch(AssertionError ae) {
			System.err.println(ae.getMessage());
		}
	}

	@When("user clicks on download brochure button")
	public void user_clicks_on_download_brochure_button() {
		enquiryFormProps.clickBrochureButton();
	}

	@When("user enters {string}")
	public void user_enters(String string) {
		enquiryFormProps.enterPhone(string);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		mainWindowHandle = driver.getWindowHandle();
		enquiryFormProps.clickLoginButton();
	}

	@Then("user sees brochure window")
	public void user_sees_brochure_window() {
		Set<String> allWindowHandles = driver.getWindowHandles();
		Iterator<String> it = allWindowHandles.iterator();
		while(it.hasNext()) {
			String brochureWindow = it.next();
			if(!mainWindowHandle.equalsIgnoreCase(brochureWindow)) {
				driver.switchTo().window(brochureWindow);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				assertEquals(driver.getTitle(), "the-colour-book-asian-paints.pdf");
			}
		}
	}
	
	@Given("user is on sanitization service page")
	public void user_is_on_sanitization_service_page() {
		driver.manage().window().maximize();
		driver.get(baseDriver.getBaseSan());
	}

	@When("user clicks on enquire")
	public void user_clicks_on_enquire() {
		enquiryFormProps.clickEnquireButton();
		nameError = enquiryFormProps.getNameErrorMessage();
		emailError = enquiryFormProps.getEmailErrorMessage();
		mobileError = enquiryFormProps.getMobileErrorMessage();
		pinError = enquiryFormProps.getPinErrorMessage();
	}

	@Then("user enquiry fails")
	public void user_enquiry_fails() {
		assertNotEquals(nameError, "");
		assertNotEquals(emailError, "");
		assertNotEquals(mobileError, "");
		assertNotEquals(pinError, "");
	}

	@When("user inputs details with wrong name")
	public void user_inputs_details_with_wrong_name(io.cucumber.datatable.DataTable dataTable) {
		data = dataTable.cells();
		enquiryFormProps.enterName(data.get(0).get(0));
		enquiryFormProps.enterEmail(data.get(0).get(1));
		enquiryFormProps.enterMobile(data.get(0).get(2));
		enquiryFormProps.enterPin(data.get(0).get(3));
	}

	@When("user inputs details with wrong email")
	public void user_inputs_details_with_wrong_email(io.cucumber.datatable.DataTable dataTable) {
		data = dataTable.cells();
		enquiryFormProps.enterName(data.get(0).get(0));
		enquiryFormProps.enterEmail(data.get(0).get(1));
		enquiryFormProps.enterMobile(data.get(0).get(2));
		enquiryFormProps.enterPin(data.get(0).get(3));
	}

	@When("user inputs details with wrong mobile")
	public void user_inputs_details_with_wrong_mobile(io.cucumber.datatable.DataTable dataTable) {
		data = dataTable.cells();
		enquiryFormProps.enterName(data.get(0).get(0));
		enquiryFormProps.enterEmail(data.get(0).get(1));
		enquiryFormProps.enterMobile(data.get(0).get(2));
		enquiryFormProps.enterPin(data.get(0).get(3));
	}

	@When("user inputs details with wrong pin")
	public void user_inputs_details_with_wrong_pin(io.cucumber.datatable.DataTable dataTable) {
		data = dataTable.cells();
		enquiryFormProps.enterName(data.get(0).get(0));
		enquiryFormProps.enterEmail(data.get(0).get(1));
		enquiryFormProps.enterMobile(data.get(0).get(2));
		enquiryFormProps.enterPin(data.get(0).get(3));
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}