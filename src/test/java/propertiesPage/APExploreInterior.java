package propertiesPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class APExploreInterior {
	//POM file for interior design services links
	WebDriver driver;
	
	public APExploreInterior(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindAll({
		@FindBy(xpath = "//*[@href='https://www.asianpaints.com/services/beautiful-homes-service/kitchen.html']"),
		@FindBy(css = ".ctaText.trackCTA[href='https://www.asianpaints.com/services/beautiful-homes-service/kitchen.html']"),
		@FindBy(linkText = "EXPLORE NOW"),
		@FindBy(partialLinkText = "EXPL")
	})
	WebElement exploreModularKitchen;
	
	@FindAll({
		@FindBy(xpath = "//*[@href='https://www.asianpaints.com/services/beautiful-homes-service-old/bedroom.html']"),
		@FindBy(css = ".ctaText.trackCTA[href='https://www.asianpaints.com/services/beautiful-homes-service-old/bedroom.html']"),
		@FindBy(linkText = "EXPLORE NOW"),
		@FindBy(partialLinkText = "NOW")
	})
	WebElement exploreBedroom;
	
	@FindAll({
		@FindBy(xpath = "//*[@href='https://www.asianpaints.com/services/beautiful-homes-service-old/living-room.html']"),
		@FindBy(css = ".ctaText.trackCTA[href='https://www.asianpaints.com/services/beautiful-homes-service-old/living-room.html']"),
		@FindBy(linkText = "EXPLORE NOW"),
		@FindBy(partialLinkText = "XPLO")
	})
	WebElement exploreLivingRoom;
	
	@FindAll({
		@FindBy(xpath = "//*[@href='https://www.asianpaints.com/services/beautiful-homes-service-old/bathroom.html']"),
		@FindBy(css = ".ctaText.trackCTA[href='https://www.asianpaints.com/services/beautiful-homes-service-old/bathroom.html']"),
		@FindBy(linkText = "EXPLORE NOW"),
		@FindBy(partialLinkText = "RE NO")
	})
	WebElement exploreBathroom;
	
	public void clickToExploreModularKitchen() {
		new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(exploreModularKitchen));
		exploreModularKitchen.click();
	}
	
	public void clickToExploreBedroom() {
		new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(exploreBedroom));
		exploreBedroom.click();
	}
	
	public void clickToExploreLivingRoom() {
		new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(exploreLivingRoom));
		exploreLivingRoom.click();
	}
	
	public void clickToExploreBathroom() {
		new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(exploreBathroom));
		exploreBathroom.click();
	}
}