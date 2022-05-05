package KeybordOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Suedo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver webdrive=new ChromeDriver();
		webdrive.get("https://www.saucedemo.com");
		
	WebElement standuser=webdrive.findElement(By.xpath("//div[@id='login_credentials']"));
	Actions act=new Actions(webdrive);
	act.moveToElement(standuser).doubleClick().sendKeys(Keys.chord(Keys.CONTROL,"c")).keyUp(Keys.CONTROL).build().perform();
	
	WebElement username=webdrive.findElement(By.xpath("//input[@id='user-name']"));
	act.moveToElement(username).click().sendKeys(Keys.chord(Keys.CONTROL,"v")).keyUp(Keys.CONTROL).build().perform();
		//Actions act=new Actions(webdrive);
WebElement standpass=webdrive.findElement(By.xpath("//div[text()='secret_sauce']"));
act.moveToElement(standpass).doubleClick().sendKeys(Keys.chord(Keys.CONTROL,"c")).keyUp(Keys.CONTROL).build().perform();

WebElement pwd=webdrive.findElement(By.xpath("//input[@placeholder='Password']"));
act.moveToElement(pwd).click().sendKeys(Keys.chord(Keys.CONTROL,"v")).keyUp(Keys.CONTROL).keyUp(Keys.CONTROL).build().perform();
		

	}

}
