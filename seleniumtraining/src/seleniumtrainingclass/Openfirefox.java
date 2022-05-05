package seleniumtrainingclass;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
public class Openfirefox {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//String path1="D:\\javaworkspce\\seleniumtraining\\executables\\geckodriver.exe";
		//1.get the path
      String driverpath=System.getProperty("user.dir")+"\\executables\\geckodriver.exe";
      String setpath=System.setProperty("webdriver.gecko.driver", driverpath);
      
      //create instance of firefox driver
      FirefoxDriver foxdrive   =   new FirefoxDriver();
		//enter google url
       foxdrive.get("https://www.google.com/");
    // Get current page source code and print the length in the console 
       String sourcecode= foxdrive.getPageSource();
       System.out.println("Appliction source code="+sourcecode);
       System.out.println("Appliction source code length="+sourcecode.length());
     //Get current url from the application and print in the console 
     String currenturl=foxdrive.getCurrentUrl();
     System.out.println("Current url is="+currenturl);
   //Get current page title and print in the console 
   		System.out.println("Application current Title: "+foxdrive.getTitle());
   		if(foxdrive.getTitle().equals("Google"))
   				{
   			System.out.println("Google search page opened successfully...");
   				}else {
   					System.out.println("Either google search page not opened or its title got changed");
   				
   				}
	}

}
