package TestCases;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Base.Initialization;
import Page.AddPlantPage;



public class AddPlantButton extends Initialization 


{
	
	//AddPlantPage Addplantpage = new AddPlantPage();
	
	@Test
	public void AddPlantButtoncheck() throws InterruptedException , IOException
	{
		//PageFactory.initElements(driver, Addplantpage);
		
		//SoftAssert sa = new SoftAssert();
		WebElement AddPlantButton = driver.findElement(By.xpath("//*[@id=\"addPlant\"]"));
		
//		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Report/Automation.html");
//		
//		ExtentReports extent = new ExtentReports();
//		
//		extent.attachReporter(reporter);
//		
		
		
		
		 //check if element visible
		
		boolean AcctualElement=AddPlantButton.isDisplayed();
        boolean ExpectedElement=true;
        
        
        
	
        boolean elementvisible = true;
        testCase = extent.createTest("ELEMENT-VISIBLE");
		try {
			Assert.assertEquals(AcctualElement,ExpectedElement);
		} catch (Exception e) {
			elementvisible=false;
		}
		if (elementvisible) {
			testCase.log(Status.INFO,"ActualElement :- " + AcctualElement);
			testCase.log(Status.INFO,"ExpectedElement :- " + ExpectedElement);
			testCase.log(Status.INFO,"Element Available");
			testCase.log(Status.PASS,"Correct element");
		} else {
			testCase.log(Status.INFO,"ActualElement :- " + AcctualElement);
			testCase.log(Status.INFO,"ExpectedElement :- " + ExpectedElement);
			testCase.log(Status.INFO,"Element not available");
			testCase.log(Status.FAIL,"No Element");
		}
			Thread.sleep(2000);	
		
			
			
		//Check position
		
		Point ActualLocation = AddPlantButton.getLocation();
        
        int actual_x = ActualLocation.getX();
        int actual_y = ActualLocation.getY();
		
		System.out.println("X axis: "+actual_x);
		System.out.println("Y axis: "+actual_y);
		
		//testCase = extent.createTest("******");
		
		Point ExpectedLocation = new Point(1154,93);
		
		
		 boolean position = true;
		 testCase = extent.createTest("POSITION");
			try {
				Assert.assertEquals(ActualLocation,ExpectedLocation);
			} catch (Exception e) {
				position=false;
			}
			if (position) {
				testCase.log(Status.INFO,"ActualLocation :- " + ActualLocation);
				testCase.log(Status.INFO,"ExpectedLocation :- " + ExpectedLocation);
				testCase.log(Status.INFO,"Correct Position");
				testCase.log(Status.PASS,"Position correct");
			} else {
				testCase.log(Status.INFO,"ActualLocation :- " + ActualLocation);
				testCase.log(Status.INFO,"ExpectedLocation :- " + ExpectedLocation);
				testCase.log(Status.INFO,"wrong Position");
				testCase.log(Status.FAIL,"Position Wrong");
			}
				Thread.sleep(2000);	
				
				
				
		// check font size
		
				String ActualfontsSize = AddPlantButton.getCssValue("font-size"); 
				System.out.println("Font Size: "+ActualfontsSize); 
				testCase = extent.createTest("FONT-SIZE");
				String ExpectedfontsSize ="14px";
				boolean fontsize = true;
				try {
					Assert.assertEquals(ActualfontsSize, ExpectedfontsSize);
				} catch (Exception e) {
					fontsize=false;
				}
				if (fontsize) {
					testCase.log(Status.INFO,"ActualfontsSize :- " + ActualfontsSize);
					testCase.log(Status.INFO,"ExpectedfontsSize :- " + ExpectedfontsSize);
					testCase.log(Status.INFO,"Correct font-size");
					testCase.log(Status.PASS,"Font-size Correct");
				} else {
					testCase.log(Status.INFO,"ActualfontsSize :- " + ActualfontsSize);
					testCase.log(Status.INFO,"ExpectedfontsSize :- " + ExpectedfontsSize);
					testCase.log(Status.INFO,"Wrong font-size");
					testCase.log(Status.FAIL,"Font-size Wrong");
				}
					Thread.sleep(2000);	
				 
				
		// Check the size
				
				Dimension ActualSize = AddPlantButton.getSize();
				System.out.println("Size :"+ActualSize);
				Dimension ExpectedSize = new Dimension(180,32);
				
				
				boolean size = true;
				testCase = extent.createTest("BUTTON-SIZE");
				try {
					Assert.assertEquals(ActualSize,ExpectedSize);
				} catch (Exception e) {
					size=false;
				}
				if (size) {
					testCase.log(Status.INFO,"ActualSize :- " + ActualSize);
					testCase.log(Status.INFO,"ExpectedSize :- " + ExpectedSize);
					testCase.log(Status.INFO,"Correct Size");
					testCase.log(Status.PASS,"Correct Size");
				} else {
					testCase.log(Status.INFO,"ActualSize :- " + ActualSize);
					testCase.log(Status.INFO,"ExpectedSize :- " + ExpectedSize);
					testCase.log(Status.INFO,"wrong Size");
					testCase.log(Status.FAIL,"wrong Size");
				}
					Thread.sleep(2000);	
				
				
		//Check test button color
				
				String ActualColour = AddPlantButton.getCssValue("background-color");
				System.out.println("rgb :"+ActualColour);
				
				
				//String hexcolour = Color.fromString(ActualColour).asHex();
				String ExpectedColour = "rgba(0, 19, 40, 1)";
		
		
				
				
				boolean colour = true;
				
				testCase = extent.createTest("BUTTON-COLOUR");
				try {
					Assert.assertEquals(ActualColour,ExpectedColour);
				} catch (Exception e) {
					colour=false;
				}
				if (colour) {
					testCase.log(Status.INFO,"ActualColour :- " + ActualColour);
					testCase.log(Status.INFO,"ExpectedColour :- " + ExpectedColour);
					testCase.log(Status.INFO,"Correct Colour");
					testCase.log(Status.PASS,"Correct Colour");
				} else {
					testCase.log(Status.INFO,"ActualColour :- " + ActualColour);
					testCase.log(Status.INFO,"ExpectedColour :- " + ExpectedColour);
					testCase.log(Status.INFO,"wrong Colour");
					testCase.log(Status.FAIL,"wrong Colour");
				}
					Thread.sleep(2000);	
				
				
				//sa.assertAll();
//		if(Actual==Expected)
//		{
//			System.out.println("Correct colour");
//		}
//		else
//		{
//			System.out.println("Wrong colour");
//		}
		
//		
//				ExtentTest logger = extent.createTest("Login Test");
//				logger.log(Status.INFO,"Login to HRM");
//				logger.log(Status.PASS,"Login Verified");
//				extent.flush();
//		
		
		
		
		
		
	}
	
	
}
