package qsp.Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ParaBank {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("customer.firstName")).sendKeys("Yogesh");
		driver.findElement(By.id("customer.lastName")).sendKeys("W");
		driver.findElement(By.id("customer.address.street")).sendKeys("Btm layout Benglore");
		driver.findElement(By.id("customer.address.city")).sendKeys("Benglore");
		driver.findElement(By.id("customer.address.state")).sendKeys("KA.");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("560076");
		driver.findElement(By.id("customer.ssn")).sendKeys("4DWR609");
		driver.findElement(By.id("customer.username")).sendKeys("yogeshw8");
		driver.findElement(By.id("customer.password")).sendKeys("yogesh8");
		driver.findElement(By.id("repeatedPassword")).sendKeys("yogesh8");
		driver.findElement(By.xpath(("(//input[@type='submit'])[2]"))).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
