package Com.adactin;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Javaprogram\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//---->> Task 1 
		driver.get("https://www.google.co.uk/");
				
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.navigate().to("https://adactinhotelapp.com/");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement username= driver.findElement(By.id("username"));
	  	username.sendKeys("hema1892");
	  	
	  	WebElement password=driver.findElement(By.id("password"));
	  	password.sendKeys("123456");
	  	
	  	WebElement login=driver.findElement(By.id("login"));
	  	
	  	login.click();
	  	
	  	WebElement dropdown = driver.findElement(By.id("location"));
	  	
	  	Select select=new Select(dropdown);
	  	
	  	List<WebElement> options = select.getOptions();
	  	
	  	for (WebElement web : options) {
	  	
	  	System.out.println(web.getText());
	  	
	  	select.selectByValue("New York");
	  	
	  	WebElement hotel=driver.findElement(By.id("hotels"));
	  	hotel.sendKeys("Hotel Hervey");
	  	
	  	WebElement roomtype=driver.findElement(By.id("room_type"));
	  	roomtype.sendKeys("Double");
	  	
	  	WebElement numofroom=driver.findElement(By.id("room_nos"));
	  	numofroom.sendKeys("5");
	  	
	  	WebElement chindt=driver.findElement(By.id("datepick_in"));
	  	chindt.sendKeys("23/08/2024");
	  	
	  	WebElement choutdt=driver.findElement(By.id("datepick_out"));
	  	choutdt.sendKeys("25/08/2024");
	  	
	  	WebElement adtroom=driver.findElement(By.id("adult_room"));
	  	adtroom.sendKeys("2");
	  	
	  	WebElement chiperroom=driver.findElement(By.id("child_room"));
	  	chiperroom.sendKeys("2");
	  	
      WebElement search=driver.findElement(By.id("Submit"));
	  	
      search.click();
      
      WebElement select1=driver.findElement(By.id("radiobutton_0"));
	  	
      select1.click();
      
      WebElement select2=driver.findElement(By.id("continue"));
	  	
      select2.click();
      
      driver.switchTo();
      
      WebElement  fname=driver.findElement(By.id("first_name"));
	  fname.sendKeys("aruna");
	  	
	  WebElement  lname=driver.findElement(By.id("last_name"));
	  lname.sendKeys("sampath");
		  	
	  WebElement  address=driver.findElement(By.id("address"));
	  address.sendKeys("172,mettupalayam");
			  	
	 WebElement  cardno=driver.findElement(By.id("cc_num"));
	 cardno.sendKeys("1234567891234567");
				  	
	 WebElement  cardtype=driver.findElement(By.id("cc_type"));
   	 cardtype.sendKeys("VISA");
	 
	 WebElement  expdt=driver.findElement(By.id("cc_exp_month"));
	 expdt.sendKeys("January");
	 
	 WebElement  expdt1=driver.findElement(By.id("cc_exp_year"));
	 expdt1.sendKeys("2026");
	 
	 WebElement  ccv=driver.findElement(By.id("cc_cvv"));
	 ccv.sendKeys("675");
	 
	 WebElement booknow=driver.findElement(By.id("book_now"));
	  	
	 booknow.click();
	  	
      WebElement logout=driver.findElement(By.id("logout"));
	  	
	  logout.click();
		
		
		
	}
		
		   
			
			
	}
}
