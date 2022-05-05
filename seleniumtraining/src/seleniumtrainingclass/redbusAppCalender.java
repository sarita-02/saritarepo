package seleniumtrainingclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class redbusAppCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=".\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		
		WebDriver webdrive= new ChromeDriver();
		webdrive.manage().window().maximize();
		webdrive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		webdrive.get("https://www.redbus.in");
		webdrive.findElement(By.cssSelector("#src")).sendKeys("Pune");
		webdrive.findElement(By.cssSelector("li[data-id='130']")).click();
		webdrive.findElement(By.cssSelector("input#dest")).sendKeys("Goa");
		webdrive.findElement(By.cssSelector("li[data-id='210']")).click();
		
	
		webdrive.findElement(By.cssSelector("input#onward_cal")).click();
		//table.rb-monthTable>*:last-child>*:nth-of-type(6)>*:last-child
		//search current date
		webdrive.findElement(By.cssSelector("table.rb-monthTable>*:last-child>*:first-child>*:last-child")).click();
		webdrive.findElement(By.cssSelector("table.rb-monthTable>*:last-child>*:nth-of-type(6)>*:last-child")).click();
	
		webdrive.findElement(By.cssSelector("#search_btn")).click();
		//close the popup
		webdrive.findElement(By.cssSelector("div.close-primo>i")).click();
		//select departure time
	      webdrive.findElement(By.cssSelector("ul[class='dept-time dt-time-filter']>*:nth-of-type(4)>label[for='dtAfter 6 pm']")).click();
		//[class="icon icon-close"]
	      //expand promo
	      webdrive.findElement(By.cssSelector(".tripleFive-compressed>*:nth-of-type(2)>i")).click();
	      try
	      {
               webdrive.findElement(By.cssSelector("[class='icon icon-close']")).click();
	      }catch(Throwable e)
	      {
	    	  System.out.println("Exception get handle="+e);
	      }
    //close
    webdrive.findElement(By.cssSelector("[class='icon icon-close']")).click();
    //select bus-type
	      webdrive.findElement(By.cssSelector("ul[class='list-chkbox']>*:nth-of-type(3)>label[for='bt_AC']")).click();
	      //webdrive.findElement(By.cssSelector("[class='icon icon-close']")).click();
    
	}

}
