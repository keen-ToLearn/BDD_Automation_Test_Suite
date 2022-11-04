package propertiesPage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class APEnquiryForm {
	//POM file for enquiry form
	WebDriver driver;
	JavascriptExecutor jsex;
	
	public APEnquiryForm(WebDriver driver) {
		this.driver = driver;
		jsex = (JavascriptExecutor)driver;
	}
	
	@FindAll({
		@FindBy(xpath = "//*[contains(@class,'form-global form-text-input floating-label textInputWrap textInputWrap__login-mobile focussed form-global--normal form-text-input--normal')]//*[@id='enquire-name']"),
		@FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(3) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)"),
		@FindBy(id = "enquire-name")
	})
	WebElement nameField;
	
	@FindAll({
		@FindBy(xpath = "//*[contains(@class,'form-global form-text-input floating-label textInputWrap textInputWrap__login-mobile form-global--normal form-text-input--normal focussed')]//*[@id='enquire-email']"),
		@FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(3) > div:nth-child(1) > div:nth-child(3) > input:nth-child(1)"),
		@FindBy(id = "enquire-email")
	})
	WebElement emailField;
	
	@FindAll({
		@FindBy(xpath = "//*[contains(@class,'form-global form-text-input floating-label textInputWrap textInputWrap__login-mobile form-global--normal form-text-input--normal focussed')]//*[@id='enquire-mobile']"),
		@FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(3) > div:nth-child(1) > div:nth-child(4) > input:nth-child(1)"),
		@FindBy(id = "enquire-mobile")
	})
	WebElement mobileField;
	
	@FindAll({
		@FindBy(xpath = "//*[contains(@class,'form-global form-text-input floating-label textInputWrap textInputWrap__login-mobile form-global--normal form-text-input--normal focussed')]//*[@id='enquire-pincode']"),
		@FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(3) > div:nth-child(1) > div:nth-child(5) > input:nth-child(1)"),
		@FindBy(id = "enquire-pincode")
	})
	WebElement pinField;
	
	@FindAll({
		@FindBy(xpath = "//*[contains(@class,'ctaText enquireForm--step-1-submit track_form_submit')]"),
		@FindBy(css = ".ctaText.enquireForm--step-1-submit.track_form_submit")
	})
	WebElement enquireButton;
	
	@FindAll({
		@FindBy(xpath = "//*[contains(@class,'thank-you-message')]"),
		@FindBy(css = ".thank-you-message"),
		@FindBy(className = "thank-you-message")
	})
	WebElement thankYouMessage;
	
	@FindAll({
		@FindBy(xpath = "//*[contains(@class,'ctaText download-catalogue track_form_pdf')]"),
		@FindBy(css = ".enquire-form--submitBtn")
	})
	WebElement brochureButton;
	
	@FindAll({
		@FindBy(xpath = "//*[@id='loginMobile']"),
		@FindBy(css = "#loginMobile"),
		@FindBy(id = "loginMobile")
	})
	WebElement phoneField;
	
	@FindAll({
		@FindBy(xpath = "//*[contains(@class,'ctaText modal__variant-login--submit')]"),
		@FindBy(css = "button[class='ctaText modal__variant-login--submit']")
	})
	WebElement loginButton;
	
	@FindAll({
		@FindBy(xpath = "//*[@id='validate-otp']//button[contains(@class,'modal__variant-login--submit')][normalize-space()='SUBMIT']"),
		@FindBy(css = "div[id='isRegisteredModal'] button:nth-child(1)")
	})
	WebElement otpSubmitButton;
	
	@FindAll({
		@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div/div[1]/div[1]/div/div[2]/div[1]/form/div[1]/div[1]/div"),
		@FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2)")
	})
	WebElement nameErrorMessage;
	
	@FindAll({
		@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div/div[1]/div[1]/div/div[2]/div[1]/form/div[1]/div[2]/div"),
		@FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2)")
	})
	WebElement emailErrorMessage;
	
	@FindAll({
		@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div/div[1]/div[1]/div/div[2]/div[1]/form/div[1]/div[3]/div"),
		@FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(3) > div:nth-child(1) > div:nth-child(4) > div:nth-child(2)")
	})
	WebElement mobileErrorMessage;
	
	@FindAll({
		@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div/div[1]/div[1]/div/div[2]/div[1]/form/div[1]/div[4]/div"),
		@FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(3) > div:nth-child(1) > div:nth-child(5) > div:nth-child(2)")
	})
	WebElement pinErrorMessage;
	
	public void enterName(String name) {
		new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(nameField));
		nameField.clear();
		nameField.sendKeys(name); 
	}
	
	public void enterEmail(String email) {
		emailField.clear();
		emailField.sendKeys(email);
	}
	
	public void enterMobile(String mobile) {
		mobileField.clear();
		mobileField.sendKeys(mobile);
	}
	
	public void enterPin(String pin) {
		pinField.clear();
		pinField.sendKeys(pin);
	}
	
	public void clickEnquireButton() {
		jsex.executeScript("arguments[0].scrollIntoView(); window.scrollBy(0, -window.innerHeight/2);", enquireButton);
		enquireButton.click();
	}
	
	public WebElement getThankYouMessage() {
		new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(thankYouMessage));
		return thankYouMessage;
	}
	
	public void clickBrochureButton() {
		jsex.executeScript("arguments[0].scrollIntoView(); window.scrollBy(0, -window.innerHeight/2);", brochureButton);
		brochureButton.click();
	}
	
	public void enterPhone(String phone) {
		new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(phoneField));
		phoneField.clear();
		phoneField.sendKeys(phone);
	}
	
	public void clickLoginButton() throws InterruptedException {
		new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(loginButton));
		loginButton.click();
		Thread.sleep(20000);
		otpSubmitButton.click();
	}
	
	public String getNameErrorMessage() {
		try {
			new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(nameErrorMessage));
			return nameErrorMessage.getText();
		}
		catch(TimeoutException tex) {
			
		}
		return null;
	}
	
	public String getEmailErrorMessage() {
		try {
			new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(emailErrorMessage));
			return emailErrorMessage.getText();
		}
		catch(TimeoutException tex) {
			
		}
		return null;
	}
	
	public String getMobileErrorMessage() {
		try {
			new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(mobileErrorMessage));
			return mobileErrorMessage.getText();
		}
		catch (TimeoutException tex) {
			
		}
		return null;
	}
	
	public String getPinErrorMessage() {
		try {
			new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(pinErrorMessage));
			return pinErrorMessage.getText();
		}
		catch(TimeoutException tex) {
			
		}
		return null;
	}
}