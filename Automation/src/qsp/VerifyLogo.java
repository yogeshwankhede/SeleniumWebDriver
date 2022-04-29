package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class VerifyLogo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		{
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.demo.actitime.com");
			boolean logo= driver.findElement(By.xpath("//div[@class='atLogoImg']")).isDisplayed();
			
			if(logo==true) {
				System.out.println("Logo is Displayed");
			}
			else {
					System.out.println("Logo is not Displayed");
					driver.close();
				}
			}

		}
	}
