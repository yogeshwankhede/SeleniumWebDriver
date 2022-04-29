package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartIphonelinks extends BaseClass {
	public static void main(String[] args) {
		path();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		driver.findElement(By.name("q")).sendKeys("iphone");
		List<WebElement> allLinks = driver.findElements(By.xpath("//li"));
		int count =allLinks.size();
		for(int i = 0;i<count;i++) {
			String text = allLinks.get(i).getText();
			System.out.println(text);		
		}
		allLinks.get(1).click();
		driver.quit();
	}


}
