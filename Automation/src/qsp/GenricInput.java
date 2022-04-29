package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenricInput {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter thr Url: ");
		String url = sc.nextLine();
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		int count = alllinks.size();
		for(int i=0;i<count;i++) {
			String text = alllinks.get(i).getText();
			System.out.println(text);
		}
		driver.close();

	}

}
