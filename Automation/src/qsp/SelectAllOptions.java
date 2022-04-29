package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllOptions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/yogir/Desktop/portal.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s= new Select(mtrListBox);
		List<WebElement> allOptions = s.getOptions();
		int count = allOptions.size();
		for(int i = 0; i<count;i++) {
			Thread.sleep(1000);
			s.selectByIndex(i);
		}
		for(int i = count-1; i>=0;i--) {
			Thread.sleep(1000);
			s.deselectByIndex(i);		}

	}
}
