package seleniumtrainingclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=".\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver webdrive=new ChromeDriver();
		webdrive.manage().window().maximize();
		webdrive.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		webdrive.get("https://thompsonsj.com/bootstrap-select-dropdown/");

	}

}
