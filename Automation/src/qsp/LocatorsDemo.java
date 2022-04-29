package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/yogir/Desktop/demo.html");
		driver.findElement(By.tagName("a")).click();
		driver.navigate().back();
		driver.findElement(By.id("d")).click();
		driver.navigate().back();
		driver.findElement(By.name("n")).click();
		driver.navigate().back();
		driver.findElement(By.className("c")).click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
