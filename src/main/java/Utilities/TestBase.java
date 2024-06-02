package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase 
{

	public static  WebDriver openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(20,Tim)
		
		System.out.println("page");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// .implicitlyWait
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}

	
	
}
