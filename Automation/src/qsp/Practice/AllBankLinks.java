package qsp.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AllBankLinks extends BaseClass {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get(parabank);
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
