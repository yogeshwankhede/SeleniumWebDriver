package qsp.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AllBankLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count = links.size();
		System.out.println(count);
		for (int i =0; i<count;i++) {
			String plinks= links.get(i).getText();
			System.out.println(plinks);
		}
		driver.close();


	}

}
