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

import Base.Initialization;
import Page.AddPlantPage;

public class AddPlantButton extends Initialization 


{
	
	//AddPlantPage Addplantpage = new AddPlantPage();
	
	@Test
	public void AddPlantButtoncheck() throws InterruptedException , IOException
	{
		//PageFactory.initElements(driver, Addplantpage);
		
		SoftAssert sa = new SoftAssert();
		WebElement AddPlantButton = driver.findElement(By.xpath("//*[@id=\"addPlant\"]"));
		
		 //check if element visible
		
		boolean AcctualElement=AddPlantButton.isDisplayed();
        boolean ExpectedElement=true;
        Assert.assertEquals(AcctualElement,ExpectedElement);
	
		
		
		//Check position
		
		Point ActualLocation = AddPlantButton.getLocation();
        
        int actual_x = ActualLocation.getX();
        int actual_y = ActualLocation.getY();
		
		System.out.println("X axis: "+actual_x);
		System.out.println("Y axis: "+actual_y);
		
		Point ExpectedLocation = new Point(1154,93);
		
		sa.assertEquals(ActualLocation,ExpectedLocation);
		
		// check font size
		
				String ActualfontsSize = AddPlantButton.getCssValue("font-size"); 
				System.out.println("Font Size: "+ActualfontsSize); 
				
				String ExpectedfontsSize ="14px";
				
				sa.assertEquals(ActualfontsSize,ExpectedfontsSize);		
				
		// Check the size
				
				Dimension ActualSize = AddPlantButton.getSize();
				System.out.println("Size :"+ActualSize);
				Dimension ExpectedSize = new Dimension(180,32);
				
				sa.assertEquals(ActualSize,ExpectedSize);
				
		//Check test button color
				
				String ActualColour = AddPlantButton.getCssValue("background-color");
				System.out.println("rgb :"+ActualColour);
				
				
				//String hexcolour = Color.fromString(ActualColour).asHex();
				String ExpectedColour = "rgba(0, 19, 40, 1)";
		
		
				sa.assertEquals(ActualColour,ExpectedColour);
				sa.assertAll();
//		if(Actual==Expected)
//		{
//			System.out.println("Correct colour");
//		}
//		else
//		{
//			System.out.println("Wrong colour");
//		}
		
		
		
		
		
		
		
		
		
	}
	
	
}
