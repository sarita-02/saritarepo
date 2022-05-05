package seleniumtrainingclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Executeauto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=".\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver webdrive=new ChromeDriver();
	webdrive.get("https://demosite.executeautomation.com/Login.html");
		System.out.println("Title of page="+webdrive.getTitle());
		System.out.println("length of titlepage is="+webdrive.getTitle().length());
		System.out.println("Url of page is="+webdrive.getCurrentUrl());
		String actualUrl="https://demosite.executeautomation.com/Login.html";
		if(webdrive.getCurrentUrl().equals(actualUrl))
		{
			System.out.println("page open successfully");
		}else {
			System.out.println("page not open successful or url get changed");
		}
       //get the usename password using findelement method
		WebElement username=webdrive.findElement(By.id("userName"));
		username.sendKeys("execution");
		WebElement userpass=webdrive.findElement(By.name("Password"));
		username.sendKeys("admin");
		WebElement userlogin=webdrive.findElement(By.name("Login"));
		//it is not necessory that everytime whatever locator present in html related to login 
		//it works.if not then use another locator css or xpath
		
		userlogin.click();
		
		
		
	}

}
