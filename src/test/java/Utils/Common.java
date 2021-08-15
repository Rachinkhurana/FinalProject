package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Common {
	
	WebDriver driver;
	public void setupbrowser(String browser , String url) {
		String currdir = System.getProperty("user.dir");
		
		if (browser.equalsIgnoreCase("Chrome"))
		{		System.setProperty("webdriver.chrome.driver", currdir+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("edge"))
		{		System.setProperty("webdriver.edge.driver", currdir+"\\drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		}
		
		else 
		{
			System.out.println("Please enter valid browser name");
			//System.exit(0);
		}
		driver.manage().window().maximize();
		if (url!="")
		driver.get(url);
		else
			driver.get("about:blank");
	}
	
public void closebrowser() 
{

	driver.close();
}

public void quitbrowser() 
{

	driver.quit();
}

public WebDriver getdriver() 
{

	return driver;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
