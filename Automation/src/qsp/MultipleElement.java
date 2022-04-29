package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElement {

	public static void main(String[] args) {
 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.get("file:///C:/Users/yogir/Desktop/demo.html");
 List<WebElement> e = driver.findElements(By.tagName("a"));
 String one = e.get(0).getText();
 String two = e.get(1).getText();
int count = e.size();
System.out.println(one + two + count);
	}

}
