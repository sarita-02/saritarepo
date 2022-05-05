package seleniumtrainingclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gsmarena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=".\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver webdrive =new ChromeDriver();
		webdrive.manage().window().maximize();
		webdrive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		webdrive.get("https://www.gsmarena.com");
		System.out.println("page title of page="+webdrive.getTitle());
		//click on samsang 
		List<WebElement>alloption=webdrive.findElements(By.cssSelector(".brandmenu-v2>ul>li>a"));
		System.out.println("total number of mobile devices="+alloption.size());
              for(int i=0;i<alloption.size();i++)
              {
            	WebElement phonfinder= alloption.get(i);
            	String name=phonfinder.getText();
            	if(name.equals("SAMSUNG"))
            	{
            		phonfinder.click();
            		break;
            	}
              }
		//print all samsung devices
              List<WebElement> allsam=webdrive.findElements(By.cssSelector(".makers>ul>li>a>strong>span"));
              System.out.println("total count of samsung device="+allsam.size());
              for(int i=0;i<allsam.size();i++)
              {
            	  System.out.println("print all samsung devices:"+allsam.get(i).getText());
              }
	}

}
