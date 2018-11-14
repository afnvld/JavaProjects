package MavenDemo;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pageobjects.SwitchToFrame_ID;

public class TestSwitchToFrame {

	WebDriver driver;
	String baseUrl;
	SwitchToFrame_ID sw;
//	SwitchToFrame_ID sw = new SwitchToFrame_ID();

	@Before
	public void setUp() {
//		System.setProperty("webdriver.chrome.driver",
//				"/Users/adina/Desktop/selenium-java-3-2/chromedriver");
//		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("--start-maximized");
//		driver = new ChromeDriver(opt);
		
	}

	@After
	public void tearDown() throws InterruptedException {
		driver.quit();
	}

	@Test
	public void practiceIframe() throws InterruptedException {
		baseUrl = "https://jqueryui.com/autocomplete/";
//		driver.manage().window().maximize();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--start-maximized");
		System.setProperty("webdriver.chrome.driver",
				"/Users/adina/Desktop/selenium-java-3-2/chromedriver");
		driver = new ChromeDriver(opt);
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		sw= new SwitchToFrame_ID(driver);
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		
		
		

	}

}
