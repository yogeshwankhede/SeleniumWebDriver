package qsp;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigateCls {
	static {
//		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");

	}

	public static void main(String[] args) throws InterruptedException {
		@SuppressWarnings("unused")
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.selenium.dev/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.selenium.dev/projects/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		//driver.close();
		driver.quit();

	}

}
