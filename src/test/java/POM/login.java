package POM;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class login {

	WebDriver driver;
	
	@CacheLookup
	@FindBy(linkText ="Electronics")
	WebElement Electronics;
	
	@CacheLookup
	@FindBy(linkText ="Mobiles")
	WebElement Mobiles;
	
	@CacheLookup
	@FindBy(xpath ="//a//span[contains(text(),'Mobiles & Accessories')]")
	WebElement mobilehover;
	
	@CacheLookup
	@FindBy(partialLinkText ="Mi")
	WebElement OnePlus;
	
	@CacheLookup
	@FindBy(xpath ="//a[@class='a-link-normal a-text-normal']")
	WebElement text;
	
	//div[@class='a-image-container a-dynamic-image-container']
	
	@CacheLookup
	@FindBy(xpath ="//a[@class='a-link-normal a-text-normal']")
	WebElement Moblink;
	
	
	@CacheLookup
	@FindBy(id ="productTitle")
	WebElement Producttitle;
	
	@CacheLookup
	@FindBy(id ="priceblock_ourprice")
	WebElement ProductPrice;
	
	@CacheLookup
	@FindBy(name ="field-keywords")
	WebElement Search;
	
	@CacheLookup
	@FindBy(partialLinkText ="Boat")
	WebElement checkbox;
	
	@CacheLookup
	@FindBy(partialLinkText ="Days")
	WebElement Days;
	
	@CacheLookup
	@FindBy(xpath ="//span[@class='a-size-medium a-color-base a-text-normal']")
	WebElement headphone;
	
	@CacheLookup
	@FindBy(id ="nav-search-submit-button")
	WebElement ProductSearch;
	
	@CacheLookup
	@FindBy(id ="productTitle")
	WebElement Producttitle1;
	
	@CacheLookup
	@FindBy(id ="priceblock_ourprice")
	WebElement ProductPrice1;
	
	@CacheLookup
	@FindBy(id ="nav-link-accountList")
	WebElement Accountlist;
	
	@CacheLookup
	@FindBy(partialLinkText ="Sign")
	WebElement sign;
	
	@CacheLookup
	@FindBy(name ="email")
	WebElement enteremail;
	
	@CacheLookup
	@FindBy(id ="continue")
	WebElement continue1;
	
	@CacheLookup
	@FindBy(className ="a-alert-heading")
	WebElement errormessage;
	
	@CacheLookup
	@FindBy(className ="a-list-item")
	WebElement errormessage1;
	
	@CacheLookup
	@FindBy(name ="email")
	WebElement enteremail2;
	
	@CacheLookup
	@FindBy(id ="continue")
	WebElement continue2;
	
	@CacheLookup
	@FindBy(name ="email")
	WebElement enteremail3;
	
	@CacheLookup
	@FindBy(id ="continue")
	WebElement continue3;
	
	public login(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickelec() throws InterruptedException
	{
		Electronics.click();
		
		Thread.sleep(3000);
		
	}
	
	public void clickMobiles() throws InterruptedException
	{

		Mobiles.click();
	}
	
	public void hoverMobiles() throws InterruptedException
	{
		
		Thread.sleep(3000);

	Actions act = new Actions(driver);
	
	act.moveToElement(mobilehover).perform();
	}
	
	public void clickeoneplus() throws InterruptedException
	{
		
		Thread.sleep(3000);
		
		OnePlus.click();
	}
	
	public void gettitle() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("Results " + text.getText());
	}
	
	public void moblink() throws InterruptedException
	{
		
		Thread.sleep(2000);
		
		Moblink.click();
		
	}
	
	public void Productdetails() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("Product Name " + Producttitle.getText());
		System.out.println("Product Price " + ProductPrice.getText());

	}
	
	public void searchbutton() throws InterruptedException
	{
		Thread.sleep(3000);
		Search.sendKeys("");

	}
	
	public void Checkbox() throws InterruptedException
	{
		Thread.sleep(3000);

		//checkbox.click();
		Days.click();

	}
	
	public void headphoneclick() throws InterruptedException
	{
		Thread.sleep(2000);
headphone.click();

	}
	
	public void Productsearch() throws InterruptedException
	{
		Thread.sleep(2000);
ProductSearch.click();

	}
	
	public void Productdetails1() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("Product Name " + Producttitle1.getText());
		System.out.println("Product Price " + ProductPrice1.getText());

	}
	
	public void hoverSignin() throws InterruptedException
	{
		
		Thread.sleep(3000);

	Actions act = new Actions(driver);
	
	act.moveToElement(Accountlist).perform();
	}
	
	public void Signin() throws InterruptedException
	{
		
		Thread.sleep(3000);
		sign.click();
	
	}
	
	public void Email1(String Number) throws InterruptedException
	{
		Thread.sleep(2000);
		enteremail.clear();

        enteremail.sendKeys(Number);	
        continue1.click();
        
		Thread.sleep(2000);

		System.out.println("Error Message : " + errormessage.getText() + errormessage1.getText());

        
	}
	
	public void Email2(String Number) throws InterruptedException
	{
		Thread.sleep(2000);
		enteremail2.clear();

        enteremail2.sendKeys(Number);	
        continue2.click();
        
	}
	
	public void Email3(String Number) throws InterruptedException
	{
		Thread.sleep(2000);
		enteremail3.clear();

        enteremail3.sendKeys(Number);	
        continue3.click();
        
	}
	
}
