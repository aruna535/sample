package Com.TestNG;

import org.testng.annotations.Test;

public class Groups {
	
	public class Priority {
		
		@Test(groups = "A")

		public void BrowserLaunch() {
			System.out.println("BrowserLaunch");

		}

		@Test(groups = "B")
		
		public void amazonLogin() {
			System.out.println("Login");

		}
		@Test(groups = "c" )

			public void LaunchUrl() {
			System.out.println("Url");

		}

	}

}


	
	