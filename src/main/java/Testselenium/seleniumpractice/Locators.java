package Testselenium.seleniumpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * author of the file is bapparaya
 */
public class Locators {


	public static void main(String[] args) {
		
	 
		
	 WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.zoho.com/en-in/crm/");
		driver.manage().window().maximize();
		driver.findElement(By.className("zgh-login")).click();
		try{
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		Boolean isdisplay = driver.findElement(By.id("banner_0")).isDisplayed();
		System.out.println(isdisplay);
		
		//driver.findElement(By.partialLinkText("Learn m")).click();
		
		List<WebElement> elms = driver.findElements(By.id("fed_signin_options"));
		elms.size();
		

	}

}
