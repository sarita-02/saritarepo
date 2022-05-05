package seleniumtrainingclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoblaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=".\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver webdrive =new ChromeDriver();
		webdrive.get("https://www.demoblaze.com/");
		webdrive.manage().window().maximize();
		webdrive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> categories= webdrive.findElements(By.cssSelector("div.list-group>a"));
		   System.out.println("total categories is=:"+categories.size());
		     for(int i=0;i<categories.size();i++)
		     {
		         WebElement cat = categories.get(i);
		          String name= cat.getText();
		          if(name.equals("Laptops"))
		          {
		        	  cat.click();
		        	  break;
		          }
		     }
		
	}

}
