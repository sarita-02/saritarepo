package seleniumtrainingclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Techlistic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=".\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
        WebDriver webdrive=new ChromeDriver();
        webdrive.get("https://www.techlistic.com/");
        webdrive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webdrive.manage().window().maximize();
        System.out.println(" page title"+webdrive.getTitle());
        
	}

}
