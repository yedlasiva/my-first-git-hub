package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import AllPages.HomePage;
import AllPages.LoginPage;
import Utilities.TestBase;

public class TestTc01 {

	public static void main(String[] args) {
		
		/*
		 * System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		 * WebDriver driver=new ChromeDriver();
		 * 
		 * //driver.manage().timeouts().implicitlyWait(20,Tim)
		 * 
		 * System.out.println("page"); driver.get(
		 * "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 * 
		 * // .implicitlyWait
		 * 
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 */
		// Create loginpage class object
		
		TestBase tb=new TestBase();
		WebDriver driver = tb.openbrowser();
		LoginPage lpag = new LoginPage(driver);
//		lpag.enterUserName("Admin");
//		lpag.enterpassword("admin123");
//		lpag.loginbtn.click();
		lpag.LogintoApplication("Admin", "admin123");
		
		HomePage hhome = new HomePage(driver);
		hhome.isProfileImageDisplayed();

	}

}
