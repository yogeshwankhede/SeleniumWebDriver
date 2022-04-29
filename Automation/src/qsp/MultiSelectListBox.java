package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListBox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/yogir/Desktop/portal.html");
		WebElement mtrList = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrList);
		s.selectByValue("i");
		s.selectByIndex(2);
		s.selectByVisibleText("dosa");
		s.deselectByValue("i");
		s.deselectByIndex(2);
		s.deselectByVisibleText("dosa");

		System.out.println(s.isMultiple());
		driver.close();	
	}

}
