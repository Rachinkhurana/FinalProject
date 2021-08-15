package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import Utils.Common;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class Base {
	Common common;
	//String browser= "Chrome";

	String URL = "https://www.amazon.in/";
	static WebDriver driver;
	
 @BeforeTest
 @Parameters({"browser"})
  public void beforeTest(String browser) {
	  common = new Common();
	  common.setupbrowser(browser, URL);
	  driver = common.getdriver();
	 
  }

  @AfterTest
  public void afterTest() {
//common.quitbrowser();
	
  }

}
