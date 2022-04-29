package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraKids {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/kids?f=Categories%3AJeans%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
		driver.findElement(By.xpath("//h4[text()='Boys Blue Skinny Fit Jeans']/../div[1]")).click();
		driver.close();
	}
}
