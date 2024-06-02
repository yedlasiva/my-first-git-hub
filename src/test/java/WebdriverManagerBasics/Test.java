package WebdriverManagerBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) {
		
		
		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
		 * ChromeDriver();
		 */
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("file://C://imp%20Sample%20html%20files//SampleWebpage.html");
		
		
		

	}

}
