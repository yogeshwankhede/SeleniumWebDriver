package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwiBgNf036H3AhVX8XMBHSBpCDUQPAgI");
		WebElement e= driver.switchTo().activeElement();
		e.sendKeys("java");
		Thread.sleep(2000);
		driver.close();
		
	}

}
