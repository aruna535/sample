package Com.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {

	public static WebDriver driver;

	public static void browserlaunch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			//ChromeOptions options=new ChromeOptions();
			//options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
			//driver = new ChromeDriver(options);
			//driver.get("https://www.google.co.in/");
		//} else if (browser.equalsIgnoreCase("edge")) {
			//WebDriverManager.edgedriver().setup();
			driver = new ChromeDriver();
		}
	}

	public static void launchurl(String url) {
		driver.get(url);
	}

	public static void sendValues(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void sendValues(WebElement element) {
		element.click();
	}
	//public static void  selectDropdownByVisibleText(WebElement element,String text) {
		//Select dropdown=new Select(element);
		//dropdown.selectByVisibleText(text);
	//}
	
	//public static void  selectDropdownByVisiblevalue(WebElement element,String value) {
		//Select dropdown=new Select(element);
		//dropdown.selectByVisibleText(value);
	//}
	//public static void  selectDropdownByVisibleindex(WebElement element,int index) {
		//Select dropdown=new Select(element);
		//dropdown.selectByIndex(index);
	
	public static void main(String[] args) {
	sendValues(driver.findElement(By.id("username")),"hema1892");
	}
		
	public static void PrintScreen (String filename) throws IOException {
		TakesScreenshot ts=  (TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File destination =new File("C:\\Users\\ADMIN\\eclipse-workspace\\Maven23\\Reports//"+filename+".png");
		FileUtils.copyFile(Source, destination);
	}
	
		
	
	
	

	}
	


	

	

