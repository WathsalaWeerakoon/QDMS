package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddSBUPage {
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")
	public static WebElement AddSBUButton;
	
	@FindBy (xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div/div[1]/div[1]")
	public static WebElement SBU;
	
	@FindBy (xpath = "//*[@id=\"sub_business_unit\"]")
	public static WebElement EnterSubBusinessUnit;
	
	@FindBy (xpath = "//*[@id=\"description\"]")
	public static WebElement EnterSUBDescription;
	
	@FindBy (xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[3]/div/button[2]")
	public static WebElement SaveButton;
	
}
