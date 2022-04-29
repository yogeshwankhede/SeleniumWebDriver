package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllSelectedOptionListBox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/yogir/Desktop/portal.html");
		WebElement cpList = (WebElement) driver.findElement(By.id("cp"));
		Select s = new Select(cpList);
		List<WebElement> allSopt = s.getAllSelectedOptions();
		int count = allSopt.size();
		System.out.println(count);
		for(int i=0; i<count; i++) {
			String txt = allSopt.get(i).getText();
			System.out.println(txt);
		}
		driver.close();
	}

}
