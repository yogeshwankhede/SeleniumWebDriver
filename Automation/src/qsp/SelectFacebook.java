package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectFacebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[normalize-space()='Create New Account'])[1]")).click();
		WebElement monthListBox = driver.findElement(By.id("month"));
		Select se = new Select(monthListBox);
		se.selectByIndex(10);
		se.selectByValue("5");
		se.selectByVisibleText("Jan");
		//se.deselectByIndex(10); --> we can not use deselect for single select TextBox it will throw exception

	}

}
