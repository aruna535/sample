package Com.TestNG;

import org.junit.Test;

public class Priority {
	@org.testng.annotations.Test(priority = 1)
	
	public void BrowserLaunch () {
		System.out.println("BrowserLaunch");
	
	}
	@org.testng.annotations.Test(priority = 3)
	public void amazonLogin() {
		System.out.println("amazonLogin");
		
	}
	@org.testng.annotations.Test(priority = 2)
	
	public void LaunchUrl() {
		System.out.println("Url");
		
		
	}
	

}
