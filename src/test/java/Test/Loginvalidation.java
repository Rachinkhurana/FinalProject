package Test;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import POM.login;

public class Loginvalidation extends Base {
	login lgn;

	@BeforeClass
	public void beforeclass() {
		lgn = new login(driver);
	}

	@Test
	public void Clickelectronice() throws InterruptedException {
		Reporter.log(" Click on Electronics");
		lgn.clickelec();
	}
	
	@Test(dependsOnMethods = { "Clickelectronice" })
	public void ClickMobiles() throws InterruptedException {
		Reporter.log(" Click on Mobiles");
		lgn.clickMobiles();
	}
	
	@Test(dependsOnMethods = { "ClickMobiles" })
	public void hovermobile() throws InterruptedException {
		Reporter.log(" Click on Mobile hover");
		lgn.hoverMobiles();
	}
	
	@Test(dependsOnMethods = { "hovermobile" })
	public void clickoneplus() throws InterruptedException {
		Reporter.log(" Click on OnePlus");
		lgn.clickeoneplus();
		
		Thread.sleep(2000);
		lgn.gettitle();
		
	}
	
	@Test(dependsOnMethods = { "clickoneplus" })
	public void Moblink() throws InterruptedException {
		Reporter.log(" Click on OnePlus Mobile link");
		lgn.moblink();
		Thread.sleep(3000);
ArrayList<String> newwindowtotal = new ArrayList<String>(driver.getWindowHandles()); 
		
		driver.switchTo().window(newwindowtotal.get(1));
		
		lgn.Productdetails();
	
	}
	
	@Test(dependsOnMethods = { "Moblink" })
	public void Scrolldown() throws InterruptedException {
		Reporter.log(" Scrolling down the page");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		Thread.sleep(3000);
	}
	
	@Test(dependsOnMethods = { "Scrolldown" })
	public void ScrollUp() throws InterruptedException {
		Reporter.log(" Scrolling Up the page");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,0)");
	}
	
	@Test(dependsOnMethods = { "ScrollUp" })
	public void enterviaRobot() throws InterruptedException {
		Robot rbt = null;
		try {
			rbt = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lgn.searchbutton();
		rbt.keyPress(KeyEvent.VK_H);
		rbt.keyRelease(KeyEvent.VK_H);
		rbt.keyPress(KeyEvent.VK_E);
		rbt.keyRelease(KeyEvent.VK_E);
		rbt.keyPress(KeyEvent.VK_A);
		rbt.keyRelease(KeyEvent.VK_A);
		rbt.keyPress(KeyEvent.VK_D);
		rbt.keyRelease(KeyEvent.VK_D);
		rbt.keyPress(KeyEvent.VK_P);
		rbt.keyRelease(KeyEvent.VK_P);
		rbt.keyPress(KeyEvent.VK_H);
		rbt.keyRelease(KeyEvent.VK_H);
		rbt.keyPress(KeyEvent.VK_O);
		rbt.keyRelease(KeyEvent.VK_O);
		rbt.keyPress(KeyEvent.VK_N);
		rbt.keyRelease(KeyEvent.VK_N);
		rbt.keyPress(KeyEvent.VK_E);
		rbt.keyRelease(KeyEvent.VK_E);
		rbt.keyPress(KeyEvent.VK_S);
		rbt.keyRelease(KeyEvent.VK_S);
				Thread.sleep(2000);
		
				lgn.Productsearch();

	}
	
	@Test(dependsOnMethods = { "enterviaRobot" })
	public void checkboxclick() throws InterruptedException {
		Reporter.log(" Checkbox click");
		lgn.Checkbox();
	}

	@Test(dependsOnMethods = { "checkboxclick" })
	public void headphoneclick() throws InterruptedException {
		Reporter.log(" Headphone click");
		lgn.headphoneclick();
	}
	
	@Test(dependsOnMethods = { "headphoneclick" })
	public void windowchange() throws InterruptedException {
		Reporter.log(" Window Change");
		ArrayList<String> newwindowtotal = new ArrayList<String>(driver.getWindowHandles()); 
		
		driver.switchTo().window(newwindowtotal.get(2));
		System.out.println("Window Name" + driver.getTitle());
	}
	
	@Test(dependsOnMethods = { "windowchange" })
	public void Productdetails() throws InterruptedException {
		Reporter.log(" Product Details");
		lgn.Productdetails1();
	}
	
	@Test(dependsOnMethods = { "Productdetails" })
	public void windowclose() throws InterruptedException {
		Reporter.log(" Window closed");
       driver.close();
}
	
	@Test(dependsOnMethods = { "windowclose" })
	public void switchtab() throws InterruptedException {
		Reporter.log(" Window switched");
ArrayList<String> newwindowtotal = new ArrayList<String>(driver.getWindowHandles()); 
		
		driver.switchTo().window(newwindowtotal.get(0));
		System.out.println("Window Name" + driver.getTitle());
}
	
	@Test(dependsOnMethods = { "switchtab" })
	public void Signin() throws InterruptedException {
		Reporter.log(" Sign in Functionality");
		lgn.hoverSignin();
		lgn.Signin();
	
}
	
	
	@Parameters({"Number1"})	
	@Test (dependsOnMethods = { "Signin" })
	public void loginvalidation1(String Number1) throws InterruptedException 
	{
		Reporter.log(" Click on Sign on");
		lgn.Email1(Number1);
	}
	
	@Parameters({"Number2"})	
	@Test (dependsOnMethods = { "Signin" })
	public void loginvalidation2(String Number2) throws InterruptedException 
	{
		Reporter.log(" Click on Sign on");
		lgn.Email2(Number2);
	}
	
	@Parameters({"Number3"})	
	@Test (dependsOnMethods = { "Signin" })
	public void loginvalidation3(String Number3) throws InterruptedException 
	{
		Reporter.log(" Click on Sign on");
		lgn.Email3(Number3);
	}

	@Test(dependsOnMethods = { "loginvalidation3" })
	public void windowclose1() throws InterruptedException {
		Reporter.log(" Window closed");
       driver.close();
}
	
	@Test(dependsOnMethods = { "loginvalidation3" })
	public void windowclose2() throws InterruptedException {
		Reporter.log(" Window closed");
ArrayList<String> newwindowtotal = new ArrayList<String>(driver.getWindowHandles()); 
		
		driver.switchTo().window(newwindowtotal.get(0));
       driver.close();
}
}
