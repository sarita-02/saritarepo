package seleniumtrainingclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
		String path =".\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver webdrive=new ChromeDriver();
		webdrive.get("https://demo.actitime.com");
		// TODO Auto-generated method stub
	System.out.println("title of page="+webdrive.getTitle());
	System.out.println("current url is="+webdrive.getCurrentUrl());
	System.out.println("="+webdrive.getPageSource());
	//if(webdrive)
	webdrive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	WebElement user=webdrive.findElement(By.id("username"));
	user.sendKeys("admin");
	WebElement pass=webdrive.findElement(By.name("pwd"));
	pass.sendKeys("manager");
	pass.clear();
	
	pass.sendKeys("manager");
	
	WebElement logbuton=webdrive.findElement(By.id("loginButton"));
	logbuton.sendKeys("login");
	logbuton.click();
	//System.out.println("Homepage title of actitime is="+webdrive.getTitle()());
	webdrive.findElement(By.id("logoutLink")).click();
	
	}
}
