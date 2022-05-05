package seleniumtrainingclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=".\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver webdrive=new ChromeDriver();
		webdrive.manage().window().maximize();
		webdrive.get("https://opensource-demo.orangehrmlive.com/");
    WebElement username=  webdrive.findElement(By.id("txtUsername"));
    username.sendKeys("Admin");
    WebElement password=webdrive.findElement(By.id("txtPassword"));
       password.sendKeys("admin123");
    WebElement login=webdrive.findElement(By.id("btnLogin"));
    login.click();
    		
      
	}

	

}
