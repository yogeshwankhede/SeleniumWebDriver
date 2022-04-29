package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class  FacebookDOBSelect {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[normalize-space()='Create New Account'])[1]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Yogesh");
		driver.findElement(By.name("lastname")).sendKeys("Wankhede");
		driver.findElement(By.name("reg_email__")).sendKeys("devyog@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("devyog@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Mahirathore@123");
		WebElement dayListBox = driver.findElement(By.id("day"));
		Select se1 = new Select(dayListBox);
		se1.selectByValue("26");
		WebElement monthListBox = driver.findElement(By.id("month"));
		Select se2 = new Select(monthListBox);
		se2.selectByValue("5");
		WebElement yearListBox = driver.findElement(By.id("year"));
		Select se3 = new Select(yearListBox);
		se3.selectByValue("1994");

		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[7]/span[1]/span[2]/input[1]")).click();
		driver.findElement(By.name("websubmit")).click();

	}

}
