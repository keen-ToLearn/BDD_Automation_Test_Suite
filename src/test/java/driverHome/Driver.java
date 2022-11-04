package driverHome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	private String baseHome = "https://www.asianpaints.com/";
	private String baseServices = "https://www.asianpaints.com/services.html";
	private String baseID = "https://www.asianpaints.com/services/beautiful-homes-service.html";
	private String baseSP = "https://www.asianpaints.com/services/asian-paints-safe-painting-service.html";
	private String baseSan = "https://www.asianpaints.com/services/disinfection-and-sanitization.html";
	private String baseWD = "https://www.asianpaints.com/services/wood-solutions.html";
	private String baseWP = "https://www.asianpaints.com/services/waterproofing-solutions.html";
	
	public WebDriver getChromeDriver() {
		return new ChromeDriver();
	}

	public String getBaseServices() {
		return baseServices;
	}

	public String getBaseHome() {
		return baseHome;
	}

	public String getBaseID() {
		return baseID;
	}

	public String getBaseSP() {
		return baseSP;
	}

	public String getBaseSan() {
		return baseSan;
	}

	public String getBaseWD() {
		return baseWD;
	}

	public String getBaseWP() {
		return baseWP;
	}
}