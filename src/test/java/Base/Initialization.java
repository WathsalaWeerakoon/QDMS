package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class Initialization {
	
public static WebDriver driver;
    
    public static String URL = "http://192.168.1.35:8083/#/";
     
 @BeforeSuite

    public  void main() {
        
        
        //Setting system properties of ChromeDriver
    System.setProperty("webdriver.chrome.driver", "C:\\Automation_Workspace\\chromedriver_win32\\chromedriver.exe");

        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        
        driver.get(URL);
    
    }
      public void closeChrome(){
       //driver.quit();
    }


	
}