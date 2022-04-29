package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DispForgetPass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String disp = driver.findElement(By.xpath("//*[@id=\'toPasswordRecoveryPageLink\']")).getText();
		System.out.println(disp);
		Thread.sleep(3000);
		driver.close();
	}

}
