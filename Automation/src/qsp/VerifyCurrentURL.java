package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyCurrentURL {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.actitime.com/");
		String eUrl = "https://www.actitime.com/";
		String cUrl = driver.getCurrentUrl();
		if(cUrl.equals(eUrl)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
