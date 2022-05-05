package seleniumtrainingclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Vtiger {

	public static void main(String[] args) {
		 String driverpath=System.getProperty("user.dir")+"\\executables\\\\geckodriver.exe";
	     System.setProperty("webdriver.gecko.driver", driverpath);
	      
	      //create instance of firefox driver
	      WebDriver webdrive   =   new FirefoxDriver();	
     webdrive.get("https://demo.vtiger.com/vtigercrm/index.php");
     webdrive.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
     WebElement user=webdrive.findElement(By.id("username"));
 	user.clear();
 	user.sendKeys("admin");
	user.clear();
	user.sendKeys("admin");
	WebElement pass=webdrive.findElement(By.id("password"));
 	pass.sendKeys("Test@123");
 	pass.clear();
 	pass.sendKeys("Test@123");
 	WebElement sign = webdrive.findElement(By.className("button"));
 	sign.click();
 	
 	
     

	}

}
