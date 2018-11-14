package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchToFrame_ID {
	private WebDriver driver;
	private By myFrame = By.xpath("//iframe[@class='demo-frame']");

	public SwitchToFrame_ID(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver getWebDriver() {
		return driver;
	}

	public WebElement getMyFrame() {
		return driver.findElement(myFrame);
	}
	
	
}
