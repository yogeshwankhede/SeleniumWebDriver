
	package qsp;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Alignment {
		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
			int x =driver.findElement(By.id("username")).getLocation().getX();
			int y = driver.findElement(By.id("username")).getLocation().getY();
		
			System.out.println(x+" <---- this is x");
			
				System.out.println(y+" <----- this is y");
			driver.close();
		}
	} 
