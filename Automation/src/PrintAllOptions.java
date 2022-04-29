import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/yogir/Desktop/portal.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s= new Select(mtrListBox);
		String text= s.getWrappedElement().getText();
		System.out.println(text);
		//List<WebElement> allOptions = s.getOptions();
		//for(int i=0; i<allOptions.get(i).getText();i++) {

	}

}
