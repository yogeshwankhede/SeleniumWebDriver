package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLinks {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.javatpoint.com/");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int count = allLinks.size(); //size method to calculate tags
		//use for loop to get multiple links
		for (int i = 0; i<count; i++) {
			String link = allLinks.get(i).getText(); //get method to go to index
			System.out.println(link);	
		}
		driver.close();
	}

}
