package WebdriverManagerBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserBasics {
	
	
	public static void main(String[] args) {
		


//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
			//		download chromedriver.exe manually and write above stmt in code

			// if browser version changes -- we have to download same version of driver.exe
			//		ex:  chrome browser Version 110.0.5481.178   --->  chromdriver.exe  110 
			// chrome browser Version  112  --  --->  chromdriver.exe  112 


			// download chromedriver.exe file with WebdriverManager
		System.out.println("hi");
			WebDriverManager.chromedriver().setup();
//			WebDriverManager.edgedriver().setup();
			
			// ff - geckodriver
//			WebDriverManager.firefoxdriver().setup();
			



			//2  create obj for ChromeDriver- Class 
			WebDriver driver =  new ChromeDriver();// open chrome browser with empty url 		

			driver.get("file:///C:/imp%20Sample%20html%20files/SampleWebpage.html");


			// click  Electronics,  Computers  checkbox
			/*
			 * WebElement ElectronicsCheckBoxele= driver.findElement(By.id("eleId"));
			 * ElectronicsCheckBoxele.click();
			 * 
			 * WebElement ComputersChkboxEle= driver.findElement(By.id("cid"));
			 * ComputersChkboxEle.click();
			 * 
			 */

		}



}
