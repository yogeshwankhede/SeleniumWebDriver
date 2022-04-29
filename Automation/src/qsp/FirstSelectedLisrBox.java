package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSelectedLisrBox {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("file:///C:/Users/yogir/Desktop/portal.html");
			WebElement mtrList = driver.findElement(By.id("cp"));
			Select s = new Select(mtrList);
			WebElement fBox = s.getFirstSelectedOption();
			String text = fBox.getText();
			System.out.println(text);
			driver.close();
		}
}
