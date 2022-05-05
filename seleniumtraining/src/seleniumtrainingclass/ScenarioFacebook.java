package seleniumtrainingclass;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScenarioFacebook {

	public static void main(String[] args) {
		 String driverpath=System.getProperty("user.dir")+"\\executables\\\\geckodriver.exe";
	      String setpath=System.setProperty("webdriver.gecko.driver", driverpath);
	      
	      //create instance of firefox driver
	      FirefoxDriver foxdrive   =   new FirefoxDriver();
	      foxdrive.get("https://www.facebook.com");
	      //foxdrive.wait(30);
	      //homepagetile
	      System.out.println("Application current title="+foxdrive.getTitle());
	      System.out.println("home page title="+foxdrive.getTitle().length());
	      if(foxdrive.getTitle().equals("facebook"))
	      {
	    	  System.out.println("tile correct");
	      }
	      else
	      {
	    	  System.out.println("title incorrect");
	      }
	     
	      foxdrive.close();
	      

	}

}
