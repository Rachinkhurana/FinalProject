package Test;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Basicvalidation extends Base {
	
	@Test
	public void URLvalidation() {
		String expectedurl = "https://www.amazon.in/";
		String Actualurl = driver.getCurrentUrl();
		
		Reporter.log("Expected URL = "+ expectedurl);
		Reporter.log("Actual URL = "+ Actualurl);
		
		assertTrue(Actualurl.equals(expectedurl), "Mismatch in the URL");
	}
	
	@Test
	public void titlevalidation() {
		String expectedttl = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String Actualttl = driver.getTitle();
		
		Reporter.log("Expected title = "+ expectedttl);
		Reporter.log("Actual title = "+ Actualttl);
		
		assertTrue(Actualttl.equals(expectedttl), "Mismatch in the URL");
	}
  }


