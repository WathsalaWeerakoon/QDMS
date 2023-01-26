package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddPlantPage {
	
	@FindBy (id = "addPlant")
	public static WebElement AddPlantButton;
	
	@FindBy (name = "plant_code")
	public static WebElement Code;
	
	@FindBy (name = "plant_name")
	public static WebElement Plant;
	
	@FindBy (name = "plant_address")
	public static WebElement Address;
	
	@FindBy (id = "sub_business_unit")
	public static WebElement SubBuissinessUnit;
	
	
	
	//@FindBy (xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[3]/div/button[2]/span")
	@FindBy(xpath="//div[@class='ant-modal-footer']/div/button[2]/span")
	public static WebElement Savebutton;
 
}
