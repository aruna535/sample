package Com.TestNG;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cross_Browser {
	public static WebDriver driver;
	
	@Parameters("Browser")
	@BeforeClass
	public void browserLaunch(String browser) {
	
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge"));{
		WebDriverManager.edgedriver().setup();
	}
	}
	@org.testng.annotations.Test
	public void Login () {
		
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("arunaviji535@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("1234567");
		driver.findElement(By.name("login")).click();
		driver.quit();
	}
	
}




