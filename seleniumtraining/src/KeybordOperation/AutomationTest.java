package KeybordOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver webdrive=new ChromeDriver();
		webdrive.get("http://demo.automationtesting.in/Register.html");
		
		//identify first name input field
				WebElement username=webdrive.findElement(By.cssSelector("input[placeholder='First Name']"));
				username.sendKeys("admin");
				//create an instance of Actions class by passing required browser instance to its constructor
				Actions act=new Actions(webdrive);
				
				//with the help of Actions class reference perform appropriate action
				act.moveToElement(username).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
				//paste it in last name field
				WebElement lastName=webdrive.findElement(By.cssSelector("input[placeholder='Last Name']"));
				act.moveToElement(lastName).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
			}

	}

