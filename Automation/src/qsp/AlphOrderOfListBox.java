package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlphOrderOfListBox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/yogir/Desktop/portal.html");
		ArrayList<String> al = new ArrayList<String>();
		//TreeSet<String> t = new TreeSet<>(); //collection
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrListBox);
		List<WebElement> allOptions = s.getOptions();
		int count = allOptions.size();
		for (int i =0; i<count;i++) {
			String text = allOptions.get(i).getText();
			al.add(text);
			//t.add(text);
			
		}
		Collections.sort(al);
		for(String options:al) {
			System.out.println(options);
		}
//		//collection loop (for each)
//		for(String o:t) {
//			System.out.println(o);
//			
//		}
		driver.close();
	}

}
