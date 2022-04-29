package qsp;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {
	static {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogir\\eclipse-workspace\\Automation\\driver\\chromedriver.exe"); //use default path : driver\\chromedriver.exe
		System.setProperty("webdriver.edge.driver", "C:\\Users\\yogir\\eclipse-workspace\\Automation\\driver\\msedgedriver.exe");
	}
public static void main(String[] args) {
      //ChromeDriver  driver = new ChromeDriver(); //set chrome browser
      EdgeDriver driver= new EdgeDriver();
      //driver.get("http://www.google.com/");//Method to open url (never type url , just copy paste url)
      driver.get("https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/#downloads");
      String title = driver.getTitle();
      System.out.println(title);
      driver.close(); //method to close browser
}
}
