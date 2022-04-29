package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocators2 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	@SuppressWarnings("unused")
	WebDriver driver =new ChromeDriver();
	driver.get("file:///C:/Users/yogir/Desktop/demo.html");
	driver.findElement(By.linkText("Google")).click();
	driver.navigate().back();
	//driver.findElement(By.partialLinkText("Go")).click();
	driver.findElement(By.cssSelector("a[id='d1']")).click();
	driver.navigate().back();
	driver.findElement(By.cssSelector("a[name='n1']")).click();
	driver.navigate().back();
	driver.findElement(By.cssSelector("a[class='c1']")).click();
	driver.navigate().back();
	driver.findElement(By.cssSelector("a[href='https://qspiders.com/']")).click();
	driver.close();	
	driver.close();
}
}
