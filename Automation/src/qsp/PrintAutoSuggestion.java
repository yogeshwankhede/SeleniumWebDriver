package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAutoSuggestion {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); //define path
		WebDriver driver = new ChromeDriver(); //open browser
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(3000);
		List<WebElement> allAutoSugg = driver.findElements(By.xpath("//span[contains(text(),'java')]")); //auto suggestions
		int count = allAutoSugg.size();
		System.out.println(count);
		for (int i =0; i<count;i++) {
			String text = allAutoSugg.get(i).getText();
			System.out.println(text);
		}
		allAutoSugg.get(0).click(); //click on link
		driver.close();
	}

}
