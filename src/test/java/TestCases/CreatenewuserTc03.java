package TestCases;

import org.openqa.selenium.WebDriver;

import AllPages.HomePage;
import AllPages.LoginPage;
import Utilities.TestBase;

public class CreatenewuserTc03 {

	public static void main(String[] args) {
		
		TestBase tb=new TestBase();
		WebDriver driver = tb.openbrowser();
		LoginPage lpag = new LoginPage(driver);
		lpag.LogintoApplication("Admin", "admin123");
		
		HomePage hhome = new HomePage(driver);
		hhome.isProfileImageDisplayed();
		
		//admin btn
		hhome.navigatoadminmenu();
		
		//dispaly system user
		
		hhome.verifysysytemuserpagedisplay();
		
		//add btn click
		hhome.clickaddbtn();
		
		//add user is dispaly
		hhome.addusemsg();
		
		
		

	}

}
