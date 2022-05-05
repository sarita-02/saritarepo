package webdrivermanager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.*;
public class CalenderHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver webdrive= new ChromeDriver();
		//webdrive.manage().window().maximize();
		//webdrive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		webdrive.get("https://www.redbus.in");
		
		

	}

}
