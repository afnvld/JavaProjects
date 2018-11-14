package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	public WebDriver driver;
	private By fromBox = By.xpath("//input[@id='origin-fsc-search']");
	private By toBox = By.xpath("//input[@id='destination-fsc-search']");
	private By departBox = By.xpath("//button[@id='depart-fsc-datepicker-button']");
	private By selectMonths = By.xpath("//select[@id='depart-calendar__bpk_calendar_nav_select']");
	private By dates = By.xpath("//button[@class='bpk-calendar-date-1Mg7I']//span");
	private By returnBox = By.xpath("//button[@id='return-fsc-datepicker-button']");
	private By selectRetMonths = By.xpath("//select[@id='return-calendar__bpk_calendar_nav_select']");
	private By returnDates = By.xpath("//button[@class='bpk-calendar-date-1Mg7I']//span");
	private By cabin = By.xpath("//button[@id='fsc-class-travellers-trigger-1PZXn']");
	private By cabinClass = By.xpath("//select[@id='search-controls-cabin-class-dropdown']");
	private By adults = By.xpath("//button[@title='Increase number of adults']//*[@class='bpk-nudger__icon']");
	private By children = By.xpath("//button[@title='Increase number of children']");
	private By selectAge = By.xpath("//select[@id='children-age-dropdown-0']");
	private By done = By.xpath("//button[contains(text(),'Done')]");
	private By chkBoxes = By.xpath("//input[@class='bpk-checkbox__input-2snZh']");
	private By searchFlights = By.xpath("//button[@type='submit']");
	private By help = By.xpath("//a[@id='ss-header-links-faq']");
	private By roundTrip = By.xpath("//input[@id='fsc-trip-type-selector-return']");
	public By oneWay = By.xpath("//input[@id='fsc-trip-type-selector-one-way']");
	
	
	private String parentWindow;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFromBox() {
		return driver.findElement(fromBox);
	}

	public WebElement getToBox() {
		return driver.findElement(toBox);
	}

	public WebElement getDepartBox() {
		return driver.findElement(departBox);
	}

	public Select getSelectMonths() {
		Select name = new Select(driver.findElement(selectMonths));
		return name;
	}

	public List<WebElement> getDates() {

		List<WebElement> alldates = driver.findElements(dates);
		return alldates;
	}

	public WebElement getReturnBox() {
		return driver.findElement(returnBox);
	}

	public Select getSelectRetMonths() {
		Select name2 = new Select(driver.findElement(selectRetMonths));
		return name2;
	}

	public List<WebElement> getReturnDates() {
		List<WebElement> allRdates = driver.findElements(returnDates);
		return allRdates;
	}

	public WebElement getCabin() {
		return driver.findElement(cabin);
	}

	public Select getCabinClass() {
		Select cabinClass = new Select(driver.findElement(this.cabinClass));
		return cabinClass;
	}

	public WebElement getAdults() {
		return driver.findElement(adults);
	}

	public WebElement getChildren() {
		return driver.findElement(children);
	}

	public Select getSelectAge() {
		Select age = new Select(driver.findElement(selectAge));
		return age;
	}

	public WebElement getDone() {
		return driver.findElement(done);
	}

	public List<WebElement> getChkBoxes() {
		List<WebElement> list = driver.findElements(chkBoxes);
		return list;
	}

	public WebElement getSearchFlights() {
		return driver.findElement(searchFlights);
	}

	public WebElement getHelp() {
		return driver.findElement(help);
	}

	public String getParentWindow() {
		return driver.getWindowHandle();
	}
	public WebElement getRoundTrip() {
		return driver.findElement(roundTrip);
	}
}
