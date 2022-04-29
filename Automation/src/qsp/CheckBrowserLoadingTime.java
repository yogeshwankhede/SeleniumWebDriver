package qsp;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBrowserLoadingTime {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		try {
		driver.get("http://demo.actitime.com");
		System.out.println("Page is loaeded within 5 sec");
		}
		catch(Exception e) {
			System.out.println("Page is not loaded in 5 sec");
			
			
		}
	driver.close();	
	}

}
