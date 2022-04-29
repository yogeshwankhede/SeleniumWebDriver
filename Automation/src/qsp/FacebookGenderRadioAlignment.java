package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookGenderRadioAlignment {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	int f = driver.findElement(By.xpath("(//label[1])[1]")).getLocation().getY();
	int m = driver.findElement(By.xpath("(//label[1])[2]")).getLocation().getY();
	int c = driver.findElement(By.xpath("(//label[1])[3]")).getLocation().getY();
	if (f==m && m==c) {
		System.out.println("ALL RADIO BUTTONS ARE ALIGNED");
	}
	else {
		System.out.println("ALL RADIO BUTTONS ARE NOT PPROPERLY ALIGNED");
		
	}

}

}
