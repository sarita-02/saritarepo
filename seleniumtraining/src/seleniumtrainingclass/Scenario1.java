package seleniumtrainingclass;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {

	public static void main(String[] args) {
//1.get required browser executable path
		String path= System.getProperty("user.dir")+".\\executables\\chromedriver.exe";
		//2.set required browser executable path using setproperty
		System.setProperty("webdriver.chrome.driver",path);//key,value
		//3
		ChromeDriver chdrive=new ChromeDriver();
		chdrive.get("https://demo.actitime.com");
		//pagetiltle &tiltle length
		System.out.println("page title of page="+chdrive.getTitle());
		System.out.println("title length of page="+chdrive.getTitle().length());
		//get page url
		String cururl=chdrive.getCurrentUrl();
		System.out.println("Current url is"+cururl);
		if(chdrive.getCurrentUrl().equals("https://demo.actitime.com/login.do"))
		{
			System.out.println("url opened successfully");
		}else
		{
			System.out.println("url not opened successfully");

		}
		System.out.println("url page="+chdrive.getPageSource());
		System.out.println("url page="+chdrive.getPageSource().length());
		//chdrive.close();
		
	}

}
