package Com.TestNG;

import org.testng.annotations.Test;

public class DependsonM {
	public class Priority {
		@Test

		public void BrowserLaunch() {
			System.out.println("BrowserLaunch");

		}

		@Test(dependsOnMethods = "LaunchUrl")
		public void amazonLogin() {
			System.out.println("amazonLogin");

		}

		@Test(dependsOnMethods = "BrowserLaunch")

		public void LaunchUrl() {
			System.out.println("Url");

		}

	}

}
