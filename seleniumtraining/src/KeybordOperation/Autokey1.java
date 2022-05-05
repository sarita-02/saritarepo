package KeybordOperation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autokey1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//utility s1=new utility();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
       //WebDriver driver= s1.setUp("chrome", "http://demo.automationtesting.in/Register.html");
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement firstName = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		
		firstName.sendKeys("Madhu",Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"),Keys.TAB);
		
		driver.switchTo().activeElement().sendKeys(Keys.CONTROL,"v");
		
		
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		
		driver.switchTo().activeElement().sendKeys("at:khirdiganesh tal-kopergaon",Keys.TAB);
		
		driver.switchTo().activeElement().sendKeys("madhubare1@gmail.com", Keys.TAB);
		
		driver.switchTo().activeElement().sendKeys("9420806626",Keys.TAB);
		
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_RIGHT);
		
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_LEFT);
		
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		
		driver.switchTo().activeElement().click();
		
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		
		
		WebElement forLang =driver.switchTo().activeElement();
		Actions act = new Actions(driver);
		
		//driver.findElement(By.id("msdd")).click();
		act.moveToElement(forLang, 0, 45).click().build().perform();
		driver.switchTo().activeElement();
		//List<WebElement> lang = driver.findElements(By.cssSelector("ul.ui-autocomplete>li>a"));
		List<WebElement> lang=driver.findElements(By.cssSelector("div>multi-select>*:last-child>ul>li>a"));
		
		lang.get(7).click();
		lang.get(15).click();
		
		
		WebElement target= driver.switchTo().activeElement();
		act.moveToElement(target, 0,70).click().build().perform();
		
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().click();;
		
		WebElement skillDrop = driver.switchTo().activeElement();
		
		Select skill = new Select(skillDrop);
		
		List<WebElement> options = skill.getOptions();
		
		skill.selectByIndex(7);
		
		WebElement target1= driver.switchTo().activeElement();
		target1.sendKeys(Keys.ESCAPE);
		
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().click();
		
		driver.switchTo().activeElement().click();
		
		WebElement target3=driver.switchTo().activeElement();
		
		act.moveToElement(target3, 0, 50).click().build().perform();
		
		driver.switchTo().activeElement().sendKeys("India");
		
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);

		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		
		driver.switchTo().activeElement().click();
		
		WebElement year = driver.switchTo().activeElement();
		
		Select selectYear= new Select(year);
		
		selectYear.selectByValue("1991");
		driver.switchTo().activeElement().click();
		
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		
		WebElement month = driver.switchTo().activeElement();
		
		Select selectMonth= new Select(month);
		
		selectMonth.selectByValue("November");
		driver.switchTo().activeElement().click();
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		
	}

}
