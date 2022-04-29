package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayTxt {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.actitime.com");
	    @SuppressWarnings("unused")
		String disp =driver.findElement(By.id("toPasswordRecoveryPageLink")).getText();
	    		System.out.println(disp);
	    		driver.close();
	}

}
