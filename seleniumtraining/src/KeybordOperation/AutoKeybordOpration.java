package KeybordOperation;
 import utility.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoKeybordOpration {

	public static void main(String[] args) {
		//String path=".\\executables\\chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver",path);
		WebDriverManager.chromedriver().setup();
		WebDriver webdrive=new ChromeDriver();
		webdrive.get("http://demo.automationtesting.in/Register.html");
		WebElement activeObj=webdrive.findElement(By.cssSelector("input[placeholder='First Name']"));
		activeObj.click();
		WebElement activeObject=webdrive.switchTo().activeElement();
		String activeObjectPlaceholder=activeObject.getAttribute("placeholder");
		String expectedActiveObject="First Name";
		if (activeObjectPlaceholder.equals(expectedActiveObject)) {
			System.out.println("curson pointer validation is sucessful");
		}else {
			System.out.println("curson pointer validation is unsucessful");
		}
	     activeObject.sendKeys("Madhu",Keys.TAB);
	     webdrive.switchTo().activeElement().sendKeys("Walunj",Keys.TAB);
	     
	     webdrive.switchTo().activeElement().sendKeys("Kopargaon",Keys.TAB);
	     
	     webdrive.switchTo().activeElement().sendKeys("madhubare1@gmail.com",Keys.TAB);
	     
		webdrive.switchTo().activeElement().sendKeys("9289678999",Keys.TAB);
        
         webdrive.switchTo().activeElement().sendKeys(Keys.ARROW_RIGHT);
         webdrive.switchTo().activeElement().click();
         
         webdrive.switchTo().activeElement().sendKeys(Keys.TAB);
         webdrive.switchTo().activeElement().click();
         
         webdrive.switchTo().activeElement().sendKeys(Keys.TAB);
         webdrive.switchTo().activeElement().sendKeys(Keys.TAB);
         //webdrive.switchTo().activeElement().sendKeys(Keys.TAB);
        // webdrive.switchTo().activeElement().sendKeys(Keys.TAB);
         
        webdrive.switchTo().activeElement().sendKeys(Keys.TAB);
         webdrive.switchTo().activeElement().click();
         //select skill
         webdrive.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
         webdrive.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
  
         webdrive.switchTo().activeElement().click();
         //selsect country
         webdrive.switchTo().activeElement().sendKeys(Keys.TAB);
         webdrive.switchTo().activeElement().click();
         //select country name
         webdrive.switchTo().activeElement().sendKeys(Keys.TAB);
         webdrive.switchTo().activeElement().click();
         //webdrive.switchTo().activeElement().click();
         
         webdrive.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
         webdrive.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
         webdrive.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
         webdrive.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
         webdrive.switchTo().activeElement().click();
         //select year
         webdrive.switchTo().activeElement().sendKeys(Keys.TAB);
         webdrive.switchTo().activeElement().click();
         
         webdrive.switchTo().activeElement().sendKeys(Keys.TAB);
         webdrive.switchTo().activeElement().click();
         
         
         
         
         
         
	   /* Actions act=new Actions(webdrive);//not default constructer use param constructer
	    act.sendKeys(Keys.ARROW_RIGHT).perform();
	     //multiselectdropdownlist
	     WebElement multiop=webdrive.findElement(By.id("msdd"));
	     act.moveToElement(multiop).click().build().perform();
	   
	     List<WebElement> selectlist=webdrive.findElements(By.cssSelector("div>multi-select>*:last-child>ul>li"));
	        System.out.println("count of element="+selectlist.size());
	        act.moveToElement(selectlist.get(6)).click().perform();
	        act.moveToElement(selectlist.get(15)).click().perform();
	    
	/*   for(int i=0;i<selectlist.size();i++)
	    {
		  
	    		WebElement option=selectlist.get(i);
	    		//System.out.println("")
	    		act.moveToElement(option).click().build().perform();
	    	}
	    }*/
	    	
	    /* webdrive.findElement(By.cssSelector("body")).click();
	    act.sendKeys(Keys.PAGE_DOWN).perform();
	    webdrive.switchTo().activeElement();
	    WebElement selectskill= webdrive.findElement(By.cssSelector("#Skills"));
	    	act.moveToElement(selectskill).click().build().perform();
	    	Select skill=new Select(selectskill);
	          skill.selectByIndex(10);
	    	
	          WebElement country=webdrive.findElement(By.cssSelector("select#country option[value='India');*/


	     
		
		

	}

}
