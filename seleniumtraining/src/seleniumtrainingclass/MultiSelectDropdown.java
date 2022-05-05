package seleniumtrainingclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=".\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver webdrive =new ChromeDriver();
		webdrive.manage().window().maximize();
		webdrive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		webdrive.get("http://omayo.blogspot.com/");
		//standared dropdown list------>select tag
		//.identify dropdownlist uniquely
		//create instance of select class
	WebElement multiop=	webdrive.findElement(By.id("multiselect1"));
	Select s1=new Select(multiop);
	//multiselect
	System.out.println("check whether it is multiselect or not="+s1.isMultiple());
	//get bydefault first value
	   //WebElement selectedOption=s1.getFirstSelectedOption();
      // String selectedName=selectedOption.getText();
      // System.out.println("already selected option is="+selectedName);
	//System.out.println("default selected value of droplist is:="+s1.getFirstSelectedOption().getText());
	//get option count
	List<WebElement> option=s1.getOptions();
	System.out.println("Number of option is:="+option.size());
	//get all option name
	for(int i=0;i<option.size();i++)
	{
		System.out.println("Name of option is=:"+option.get(i).getText());
	}
	//select option from dropdown
	s1.selectByIndex(1);
	s1.selectByVisibleText("Audi");
	s1.selectByValue("Hyundaix");
	//get all the selected options
	List<WebElement> selectall=s1.getAllSelectedOptions();
	System.out.println("total selected dropdoemlist is:="+selectall.size());
	//unselect already select options
	//s1.deselectAll();

	}

}
