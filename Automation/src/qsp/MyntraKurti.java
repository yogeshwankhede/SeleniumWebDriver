package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraKurti {
	static{ 
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/women-kurtas-kurtis-suits");
		driver.findElement(By.xpath("//h3[text()='Libas']/../div[1]/span[1]")).click();
		driver.close();
	}

}
