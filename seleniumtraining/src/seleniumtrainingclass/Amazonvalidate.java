package seleniumtrainingclass;
//Scenario No-1 20/4/2022
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonvalidate {

	public static void main(String[] args) {
		String path=".\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver webdrive=new ChromeDriver();
		webdrive.get("https://www.amazon.in");
		webdrive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		webdrive.manage().window().maximize();//size of window is increased
		System.out.println("title of page is="+webdrive.getTitle());
		//WebElement todaydeal=webdrive.findElement(By.className("nav-a"));
		String deal="Today's Deal";
	
		//WebElement todaydeal=webdrive.findElement(By.linkText("Today's Deal"));
		 //  todaydeal.click();
			   

	}

}
