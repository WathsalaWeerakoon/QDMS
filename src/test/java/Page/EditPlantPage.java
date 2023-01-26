package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditPlantPage {
	
	@FindBy(xpath= "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/table/tbody/tr[2]/td[9]")
	 public static WebElement EditButton;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div[3]/div/button[2]")
	public static WebElement UpdateButton;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/form/div[3]/div[2]/div/div[1]/div/span[2]")
	public static WebElement EditSBUDropdown;
	
	@FindBy (id = "plant_address")
	public static WebElement EditAddress;
}

