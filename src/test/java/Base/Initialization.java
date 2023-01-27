package Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Initialization {
	
	public static ExtentReports extent;
    public static ExtentHtmlReporter htmlreporter;
    public static ExtentTest testCase;
	
public static WebDriver driver;
    
    public static String URL = "http://192.168.1.35:8083/#/";
     
 @BeforeSuite

    public  void main() throws IOException {
        
        
        //Setting system properties of ChromeDriver
    System.setProperty("webdriver.chrome.driver", "C:\\Automation_Workspace\\chromedriver_win32\\chromedriver.exe");

        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        
        driver.get(URL);
    ExtentReport();
    }
 @AfterSuite
      public void closeChrome(){
     //  driver.close();
    	  extent.flush();
    }
      
      public static void ExtentReport() throws IOException {
    	    extent = new ExtentReports();
    	    htmlreporter = new ExtentHtmlReporter("C:\\Automation_Workspace\\QDMS\\src\\test\\java\\results\\extentreport.html");
    	    
    	    extent.attachReporter(htmlreporter);
    	}


	
}