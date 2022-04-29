package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAppleWatch {
		static { System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			
		}
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.findElement(By.xpath(""));
			driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div[1]/a/span[1]/span[2]/span[2]")).click();
			driver.close();
		}
	}
