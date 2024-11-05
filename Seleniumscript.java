
//Maximize window and then it quit
//Dev: Amna Khalil
package Swiftuni;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Seleniumscript 
{
	private WebDriver driver; 
	
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		
		
		System.out.println(driver.getTitle()); 
		driver.quit();
	}
	
	public static void main(String[] args) { 
		
		Seleniumscript test= new Seleniumscript();
		test.setUp(); 
	}

}
