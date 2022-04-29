package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeCheckBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Boolean b = driver.findElement(By.xpath("//*[@id=\'keepLoggedInCheckBox\']")).isSelected();
		if(b==true) {
			System.out.println("checked");
		}
		else {
			System.out.println("not checked");
		}
		
	}

}