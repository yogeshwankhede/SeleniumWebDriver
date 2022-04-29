package qsp;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintSpecificElementFromListBox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the input: ");
		String opt = sc.nextLine();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/yogir/Desktop/portal.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));

		Select s = new Select(mtrListBox);

		List<WebElement> allOpt = s.getOptions();
		int count = allOpt.size();
		int counter = 0;
		for(int i =0; i<count;i++) {
			String text = allOpt.get(i).getText();
			if(text.equals(opt)) {
				counter++;
			
		}

		}
		if(counter==0) {
			System.out.println(opt +" is not present");
		}
		else if(counter==1) {
			System.out.println(opt+ " is present without duplicate");
		}
		else
		{
			System.out.println(opt+" is present with duplicate");
	
		}
		driver.close();
	}
}
