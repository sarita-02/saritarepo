package seleniumtrainingclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actimecalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path =".\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver webdrive=new ChromeDriver();
		webdrive.get("https://demo.actitime.com");
		webdrive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement user=webdrive.findElement(By.id("username"));
		user.sendKeys("admin");
		WebElement pass=webdrive.findElement(By.name("pwd"));
		pass.sendKeys("manager");
		pass.clear();
		pass.sendKeys("manager");
		
		WebElement logbuton=webdrive.findElement(By.id("loginButton"));
		logbuton.sendKeys("login");
		logbuton.click();
		//click  on addnew button &select new task
		webdrive.findElement(By.cssSelector("div#container_tasks")).click();
		webdrive.findElement(By.cssSelector(".addNewButton")).click();
		webdrive.findElement(By.cssSelector("div.dropdownContainer.addNewMenu>*:nth-of-type(3)")).click();
		webdrive.findElement(By.cssSelector("div.customerSelector>div>div>*:nth-of-type(3)")).click();
		//select new customer
	  // WebElement newcust = webdrive.findElement(By.cssSelector(".customerSelector>div>div>div>div>*:nth-of-type(1)>div"));
		//print all itemlist of customer
		List<WebElement> newcust1=webdrive.findElements(By.cssSelector(".customerSelector .searchItemList>.itemRow" ));
		System.out.println("total number of customer list="+newcust1.size());
		for(int i=0;i<newcust1.size();i++)
		{
			System.out.println(" "+newcust1.get(i).getText());
		}
		   		

		
	   WebElement newcust=webdrive.findElement(By.cssSelector(".customerSelector .searchItemList>*:nth-of-type(1)"));
	   newcust.click();
	//enter new customer name
	webdrive.findElement(By.cssSelector("input.newCustomer")).sendKeys("Madhu");
	//webdrive.findElement(By.cssSelector("div>input[placeholder='Enter Project Name']")).sendKeys("Hotel Management");
	//enter project name
	webdrive.findElement(By.cssSelector("tbody>*[class='selectProjectRow']>td>*:nth-of-type(1)")).sendKeys("Hotel Management");
	webdrive.findElement(By.cssSelector("[class='commitButtonPlaceHolder']>*:first-child>div")).click();
	webdrive.findElement(By.cssSelector("tbody>tr>td>input[placeholder='Enter task name']")).sendKeys("Testing");
		

	}

}
