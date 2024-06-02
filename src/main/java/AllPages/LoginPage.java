package AllPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// 1. define elements with locators(name, id, class, xpath, cssSelector, 
				//		linktext, partial linktext
				//		 tagname..)

	// Define userNameTxtbox with name 
	@FindBy(name="username")
	public WebElement usetextbox;
	
	
	//Define pwdTxtbox using name
	@FindBy(name="password")
	public WebElement pwdtextbox;
	
	//login	
	@FindBy(xpath = "//button[text()=' Login ']")
	public WebElement loginbtn;
	
	// 2. We have to define constructor  and initialise all elements  and pass driver ref var
	
	public LoginPage(WebDriver Driver) // 1pc
	{
		
		PageFactory.initElements(Driver, this);
		
		
	}
	
	
	//3. define reusable method and utlise all defined elements
		// for each step , i will define seperate method 

	
//	public  void enterUserName(String user)
//	{
//		System.out.println("Enter user="+user);
//		usetextbox.sendKeys(user);
//	}
//	
//	public void enterpassword(String pwd)
//	{
//		System.out.println("Enter pwd="+pwd);	
//		pwdtextbox.sendKeys(pwd);
//	}
//	
//	public void loginbtn()
//	{
//		System.out.println("Click Login button");
//		loginbtn.click(); 
//	}
	
	
	public void LogintoApplication(String username,String password)
	{
		usetextbox.sendKeys(username);
		System.out.println("entered username");
		pwdtextbox.sendKeys(password);
		System.out.println("entered password");
		loginbtn.click();
		System.out.println(" Login to the application sucssefully");
		
		
		
	}
	
	
}


