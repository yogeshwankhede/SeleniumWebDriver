package qsp;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HashSetPrintListBox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/yogir/Desktop/portal.html");
		HashSet<String> hs = new HashSet<>();
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrListBox);
		List<WebElement> allOptions = s.getOptions();
		int count = allOptions.size();
		for (int i =0; i<count;i++) {
			String text = allOptions.get(i).getText();
			//To Print Duplicate only
			if(hs.add(text)==false) {
				System.out.println(text);
			}
			hs.add(text);
			}
		for(String options:hs) {
			System.out.println(options);
		}
	}
}
