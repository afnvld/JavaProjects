package MavenDemo;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import pageobjects.HomePage;

public class SearchFlightsTest {
	WebDriver driver;
	HomePage hp;

	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver",
				"/Users/adina/Desktop/selenium-java-3-2/chromedriver");
		driver = new ChromeDriver();
		WebDriver driver1 = new FirefoxDriver();
		WebDriver driver2 = new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	public void searchFlightTicket() throws InterruptedException {
		driver.get("https://www.skyscanner.com/");
		hp = new HomePage(driver);

		hp.getFromBox().click();
		hp.getFromBox().sendKeys("Chicago");
		Thread.sleep(2000);
		while (!hp.getFromBox().getAttribute("value").toLowerCase().contains("hare")) {
			hp.getFromBox().sendKeys(Keys.DOWN);
			if (hp.getFromBox().getAttribute("value").toLowerCase().contains("hare")) {
				hp.getFromBox().sendKeys(Keys.ENTER);
				break;
			}
		}
		hp.getToBox().click();
		hp.getToBox().sendKeys("New York");
		while (!hp.getToBox().getAttribute("value").toLowerCase().contains("kennedy")) {
			hp.getToBox().sendKeys(Keys.DOWN);
			if (hp.getToBox().getAttribute("value").toLowerCase().contains("kennedy")) {
				hp.getToBox().sendKeys(Keys.ENTER);
				break;
			}
		}
		Thread.sleep(2000);
		hp.getDepartBox().click();
		hp.getSelectMonths().selectByVisibleText("January 2019");
		for (WebElement each : hp.getDates()) {
			if (each.getText().equals("15")) {
				each.click();
				break;
			}
		}
		hp.getReturnBox().click();
		hp.getSelectRetMonths().selectByVisibleText("March 2019");
		for (WebElement each2 : hp.getReturnDates()) {
			if (each2.getText().equals("23")) {
				each2.click();
				break;
			}
		}

		hp.getCabin().click();
		hp.getCabinClass().selectByVisibleText("First-class");

		hp.getAdults().click();

		hp.getChildren().click();

		hp.getSelectAge().selectByIndex(4);
		hp.getDone().click();

		for (WebElement eachChk : hp.getChkBoxes()) {
			eachChk.click();

		}

		hp.getHelp().click();
		hp.getParentWindow();

	}

	@Test
	public void radioCircle() throws InterruptedException {
		hp.getRoundTrip().click();
		hp.driver.findElement(hp.oneWay);
	}

}
