package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOptionslistBox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/yogir/Desktop/portal.html");
		WebElement cpList = (WebElement) driver.findElement(By.id("cp"));
		Select s = new Select(cpList);
		List<WebElement> allOpt = s.getOptions();
		for(int i = 0; i<allOpt.size();i++) {
			String txt = allOpt.get(i).getText();
			System.out.println(txt);
		}	
		driver.close();
	}
}
