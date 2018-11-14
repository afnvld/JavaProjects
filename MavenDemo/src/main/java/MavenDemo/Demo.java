package MavenDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/adina/Documents/selenium dependecies/libraries/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://codingbat.com");
		driver.findElement(By.xpath("//input[@name='uname']")).sendKeys("macbook");
		driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("4567");
		
		
	}
}
