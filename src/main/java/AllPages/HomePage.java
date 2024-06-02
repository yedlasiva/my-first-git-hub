package AllPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//WebDriver driver;//  defaul val = null

		// 1. Define all elements with locators  using @Findby annot

		// Define profileImg with className 

	@FindBy(xpath = "//span[@class='oxd-userdropdown-tab']/img[@alt='profile picture']")
	public WebElement profileImg;
	
	
	//Admin menu
	@FindBy(xpath = "//span[text()='Admin']")
	public WebElement Adminmenu;
	
	//system user
	@FindBy(xpath = "//h5[text()='System Users']")
	public WebElement systemusertext;
	
	//add btn
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	public WebElement addbtn;
	
	//add use text msg
	@FindBy(xpath = "//h6[text()='Add User']")
	public WebElement addusertextmsg;
	
	//user drop down
	//@FindBy()
	//public WebElement userroldropdown;
	
	
	
	
	
	
	
	
	
	
	
	// 2. We have to define constructor  and initialise all elements 
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void isProfileImageDisplayed()
	{
		boolean result=profileImg.isDisplayed();
		System.out.println("img is dispalyed="+result);
		
		if(result)
		{
			System.out.println("log in is successfull");
		}
		else
		{
			System.out.println("log in is  not successfull");
		}
	}
	
	
	
	public void navigatoadminmenu()
	{
		System.out.println("click admin btn");
		Adminmenu.click();
	}
	
	
	public void verifysysytemuserpagedisplay()
	{
		boolean result=systemusertext.isDisplayed();
		if(result==true)
		{
			System.out.println("pass.system user page  is display");
		}
		else
		{
			System.out.println("fail.system user page is not display");
		}
	}
	
	
	public void clickaddbtn()
	{
		System.out.println("add btn click");
		addbtn.click();
	}
	
	public void addusemsg()
	{
	boolean	result=addusertextmsg.isDisplayed();
	if(result==true)
		
	{
		System.out.println("pass.add user text is display");
	}
	else
	{
		System.out.println("fail.add user text is not display");	
	}
	}
	
	
	
	
	
	
}

