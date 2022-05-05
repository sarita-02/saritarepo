package seleniumtrainingclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Criciinfovalidate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=".\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver webdrive=new ChromeDriver();
		webdrive.get("https://www.gsmarena.com");
		System.out.println("get title of Home page="+webdrive.getTitle());
		  String homepage=" ";
		  List<WebElement>phonefinder=webdrive.findElements(By.cssSelector(".brandmenu-v2>ul>li>a"));
		  System.out.println("mobile phonename count:="+phonefinder.size());
		  for(int i=0;i<phonefinder.size();i++)
		  {
			  WebElement finder= phonefinder.get(i);
			  String name=finder.getText();
			  System.out.println("names of mobile is:="+name);
			  if(name.equals("SONY"))
			  {
				  finder.click();
				 
			  }
			  else
			  {
				  continue;
			  }

			  }
		  }
		
}
