package seleniumtrainingclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropdownlist {

	public static void main(String[] args) {
		
		String path=".\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver webdrive=new ChromeDriver();
		webdrive.get("http://demo.automationtesting.in/Register.html");
		//1.identify dropdown list
		WebElement skillDropdown=webdrive.findElement(By.id("Skills"));
		//2.create instance of select class and pass the skillDropdownas constructer in select
		Select selectSkill=new Select(skillDropdown);
		//.check whtere dropdown list is multiselected or not
		System.out.println("Is dropdown is allowing you to select multiple option: "+selectSkill.isMultiple());
		//getfirstselected option from dropdown
		System.out.println("Already selected option name: "+selectSkill.getFirstSelectedOption().getText());
		
		//get option count of dropdownlist 
				List<WebElement> options=selectSkill.getOptions();
				System.out.println("Option count is:"+options.size());
				//Get dropdown option names
				for(int i=0;i<options.size();i++) {
					System.out.println("Option "+i+": "+options.get(i).getText());
				}
				//select option from drop list
				selectSkill.selectByIndex(3);//index
               selectSkill.selectByVisibleText("APIs");
	}

}
