package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraTshirt {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/men-tshirts");
		driver.findElement(By.xpath("//h3[text()='HRX by Hrithik Roshan']/../div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
