package seleniumtrainingclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartDropList {

	public static void main(String[] args) {
		String path=".\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver webdrive =new ChromeDriver();
		webdrive.get("https://www.flipkart.com");
		webdrive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		webdrive.manage().window().maximize();
	//	WebElement cross=webdrive.findElement(By.cssSelector("._2doB4z"));
              // cross.click();
               webdrive.findElement(By.cssSelector("._2doB4z")).click();
              // click();
    List<WebElement> alloption = webdrive.findElements(By.cssSelector("._331-kn>div>div>div>a"));
    System.out.println("total count of item"+alloption.size());
    
         for(int i=0;i<alloption.size();i++)
         {
        	 System.out.println("print all name of list ="+alloption.get(i).getText());
         }
	}}