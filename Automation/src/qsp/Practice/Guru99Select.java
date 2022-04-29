package qsp.Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru99Select {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.name("firstName")).sendKeys("adam");
	driver.findElement(By.name("lastName")).sendKeys("edrik");
	driver.findElement(By.name("phone")).sendKeys("7878755499");
	driver.findElement(By.name("userName")).sendKeys("adamedrik@yahoo.com");
	driver.findElement(By.name("address1")).sendKeys(" 14th street wiston colony london uk");
	driver.findElement(By.name("city")).sendKeys("London");
	driver.findElement(By.name("state")).sendKeys("London");
	driver.findElement(By.name("postalCode")).sendKeys("400564");
	
	WebElement clist = driver.findElement(By.name("country"));
	Select s = new Select(clist);
	s.selectByValue("UNITED KINGDOM");
	driver.findElement(By.name("email")).sendKeys("adamedrik@yahoo.com");
	driver.findElement(By.name("password")).sendKeys("adam1234");
	driver.findElement(By.name("confirmPassword")).sendKeys("adam1234");
	driver.findElement(By.name("submit")).click();
	driver.close();
}
}
