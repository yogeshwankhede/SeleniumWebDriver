package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTagMatch {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://m.facebook.com/login/");
		String tg= driver.findElement(By.xpath("//*[@id=\'forgot-password-link\']")).getTagName();
		if (tg.equals("a")) {
			System.out.println("tag Match"+ " hence PASS");
		}
		else {
			System.out.println("tag doesn't match"+ " hence Fail");
		}
		driver.close();

	}

}
