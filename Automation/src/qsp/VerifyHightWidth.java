package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyHightWidth {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		int hight =driver.findElement(By.id("username")).getSize().getHeight();
		int width = driver.findElement(By.id("username")).getSize().getWidth();
		System.out.println(" hight "+hight+" "+" x "+" width "+width+" ");
		driver.close();
	}

}
