package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WithoutClickM {
static{
	System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
	
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("http://demo.opensourcebilling.org/en/users/sign_in");
		driver.findElement(By.id("user_login_btn")).submit();
		Thread.sleep(3000); //don't use thread
		driver.quit();

	}

}
