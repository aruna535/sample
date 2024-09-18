package Com.ctestrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import Com.base.Base_Class;
import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src//test//java//Com//adafeatures"  
                 ,glue = "Com.bstepdef",
                 plugin= {"pretty",
                		 "html:Reports//cucumber_html_Report",
                		 "json:Reports//]json_Report.json",
    "com.cucumber.listener.ExtentCucumberFormatter:Reports/Extent_Report.html"},
							monochrome=true,
							strict=false,
							dryRun=false)
							
   public class TestRunner extends Base_Class {
	//@BeforeClass
	//public static void setup() {
		//browserlaunch("Chrome");
	//}

	//@AfterClass
//	public static void tearDown() {
	
	}

	

	
		
	
