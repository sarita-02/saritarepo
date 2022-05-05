package seleniumtrainingclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filpcart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=".\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
	
		WebDriver webdrive=new ChromeDriver();
		
		webdrive.get("https://www.amazon.in/");
		
	//WebElement mobile=webdrive.findElement(By.className("nav-a"));
	//WebElement mobile=webdrive.findElement(By.linkText("Mobiles"));
	//mobile.click();
          //inputphonenum.sendKeys("9420806626");
	List<WebElement> alloption= webdrive.findElements(By.cssSelector("#nav-xshop-container>div>a"));
	System.out.println("total identified elements are:"+alloption.size());
	for(int i=0;i<alloption.size();i++)
	{
	
		WebElement getoption=alloption.get(i);
		String name=getoption.getText();
		System.out.println("option name="+name);
		if(name.equals("Today's Deals"))
		{
			getoption.click();
			break;
		}else
		{
			System.out.println("not found");
		}
	}
	webdrive.navigate().forward();
	}

}
