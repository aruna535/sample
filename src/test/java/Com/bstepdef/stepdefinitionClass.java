package Com.bstepdef;


import java.io.IOException;
import java.lang.module.Configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import Com.base.Base_Class;
import Com.configuration.ConfigurationClass;
import Com.pom.Login_Page;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepdefinitionClass extends Base_Class {
	@Before
	public void setup() {
		browserlaunch("chrome");
	}
	@After
	public void tearDown(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
		PrintScreen("adctin");	
			
		
		}
		driver.quit();
	}
	//public static WebDriver driver;
	//public static Login_Page log;
	//public static PageobjectManager pom;
	public static ConfigurationClass con;
	
	@Given("^user Launch The Url of The Adactin Application$")
	public void user_Launch_The_Url_of_The_Adactin_Application() throws IOException  {
	    	//WebDriverManager.chromedriver().setup();
	    	//driver=new ChromeDriver();
	    	//driver.get("https://adactinhotelapp.com/");
	    	//launchurl("https://adactinhotelapp.com/");
		
		ConfigurationClass con=new ConfigurationClass();
		launchurl(con.getUrl());
		
	    	
	}

	@When("^user Enter The Username in The respective filed$")
	public void user_Enter_The_Username_in_The_respective_filed(String username){
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("hema1892");
		
	}
	

	@When("^user enter the password in The respective filed$")
	public void user_enter_the_password_in_The_respective_filed(String password)  {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
	}

	@Then("^user Clicks the Loginbutton Its Navigate to search hotel$")
	public void user_Clicks_the_Loginbutton_Its_Navigate_to_The_searchHotel()  {
	  driver.findElement(By.xpath("//input[@name='login']")).click();
	  driver.quit();
	
	}
	
	


}
