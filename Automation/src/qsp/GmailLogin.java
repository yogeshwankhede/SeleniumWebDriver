package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GmailLogin {
	static {
		//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");

	}
	public static void main(String[] args) {
//	      System.setProperty("webdriver.gecko.driver",
//	      "C:\\Users\\ghs6kor\\Desktop\\Java\\geckodriver.exe");
	      //WebDriver driver = new ChromeDriver();
			WebDriver driver = new EdgeDriver();

	      //implicit wait
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      //URL launch
	      driver.get("https://accounts.google.com/signin");
	      //identify email
	      WebElement l = driver
	      .findElement(By.name("identifier"));
	      l.sendKeys("yogi.wankhede007@gmail.com");
	      WebElement b = driver
	      .findElement(By.className("VfPpkd-LgbsSe"));
	      b.click();
	      //identify password
	      WebElement p = driver
	      .findElement(By.name("password"));
	      p.sendKeys("8888317673");
	      b.click();
	      //close browser
	      driver.close();
	   }
	}