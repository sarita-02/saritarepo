package seleniumtrainingclass;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opencrome_Browser {

	public static void main(String[] args) {
		String path="D:\\javaworkspce\\seleniumtraining\\executables\\chromedriver.exe";
		//this path not more corret beaz path change every system
		String path1=".\\executables\\chromedriver.exe";
		String path3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",path1);
		// TODO Auto-generated method stub
       ChromeDriver d1=new ChromeDriver();
	}

}
