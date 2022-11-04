package propertiesPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class APHome {
	//POM file for services drop down links
	WebDriver driver;
	Actions hover;
	
	public APHome(WebDriver driver) {
		this.driver = driver;
		hover = new Actions(driver);
	}
	
	@FindAll({
		@FindBy(linkText = "SERVICES"),
		@FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > header:nth-child(1) > div:nth-child(3) > div:nth-child(4) > nav:nth-child(1) > div:nth-child(2) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(3) > a:nth-child(2) > span:nth-child(1)"),
		@FindBy(xpath = "//*[@class='iconTextLinks__text visible-in-Desktop'][normalize-space()='SERVICES']")
	})
	WebElement mainServicesLink;
	
	@FindAll({
		@FindBy(partialLinkText = "rior Desi"),
		@FindBy(xpath = "//*[normalize-space()='Interior Design Service']"),
		@FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > header:nth-child(1) > div:nth-child(3) > div:nth-child(4) > nav:nth-child(1) > div:nth-child(3) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > span:nth-child(1)")
	})
	WebElement mainIDLink;
	
	@FindAll({
		@FindBy(linkText = "Safe Painting Service"),
		@FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > header:nth-child(1) > div:nth-child(3) > div:nth-child(4) > nav:nth-child(1) > div:nth-child(3) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > span:nth-child(1)"),
		@FindBy(xpath = "//*[normalize-space()='Safe Painting Service']")
	})
	WebElement mainSPLink;
	
	@FindAll({
		@FindBy(partialLinkText = "zation Ser"),
		@FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > header:nth-child(1) > div:nth-child(3) > div:nth-child(4) > nav:nth-child(1) > div:nth-child(3) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > span:nth-child(1)"),
		@FindBy(xpath = "//*[normalize-space()='Sanitization Services']")
	})
	WebElement mainSanLink;
	
	@FindAll({
		@FindBy(partialLinkText = "od Soluti"),
		@FindBy(xpath = "//*[normalize-space()='Wood Solutions']"),
		@FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > header:nth-child(1) > div:nth-child(3) > div:nth-child(4) > nav:nth-child(1) > div:nth-child(3) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > span:nth-child(1)")
	})
	WebElement mainWDLink;
	
	@FindAll({
		@FindBy(linkText = "Waterproofing Solutions"),
		@FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > header:nth-child(1) > div:nth-child(3) > div:nth-child(4) > nav:nth-child(1) > div:nth-child(3) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > span:nth-child(1)"),
		@FindBy(xpath = "//*[normalize-space()='Waterproofing Solutions']")
	})
	WebElement mainWPLink;
	
	public void clickMainServicesLink() {
		mainServicesLink.click();
	}
	
	public void clickMainIDLink() {
		new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(mainServicesLink));
		hover.moveToElement(mainServicesLink).perform();
		new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(mainIDLink)); 
		mainIDLink.click();
	}
	
	public void clickMainSPLink() {
		new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(mainServicesLink));
		hover.moveToElement(mainServicesLink).perform();
		new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(mainSPLink));
		mainSPLink.click();
	}
	
	public void clickMainSanLink() {
		new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(mainServicesLink));
		hover.moveToElement(mainServicesLink).perform();
		new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(mainSanLink));
		mainSanLink.click();
	}
	
	public void clickMainWDLink() {
		new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(mainServicesLink));
		hover.moveToElement(mainServicesLink).perform();
		new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(mainWDLink));
		mainWDLink.click();
	}
	
	public void clickMainWPLink() {
		new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(mainServicesLink));
		hover.moveToElement(mainServicesLink).perform();
		new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(mainWPLink));
		mainWPLink.click();
	}
}