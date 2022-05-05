package webdrivermanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chromeopen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver webdrive= new ChromeDriver();
		webdrive.get("https://www.avis.co.uk");
		//webdrive.findElement(By.id("")).click();

	//div#consent-modal>div>div>div>a
	}
}
