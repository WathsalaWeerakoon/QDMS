package TestCasesEdit;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.Initialization;
import Page.AddPlantPage;
import Page.EditPlantPage;

public class EditPlantTest extends Initialization{
	
	EditPlantPage Editplantpage = new EditPlantPage();
	
	@Test
	
	public void EditPlant () throws InterruptedException,IOException
	{
		PageFactory.initElements(driver, Editplantpage);
		
		Thread.sleep(2000);
		
		EditPlantPage.EditButton.click();
		
		
		FileInputStream file = new FileInputStream("C:\\Automation_Workspace\\QDMS\\src\\test\\java\\Excel\\New Microsoft Excel WorksheetQDMS.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Edit_Plant");
        
        int rowcount = sheet.getLastRowNum();
        for(int i=0; i<=rowcount;i++) {        
        	XSSFRow row = sheet.getRow(i);    
    
        	String Address = (String)row.getCell(0).getStringCellValue();
            String Sbu = (String)row.getCell(1).getStringCellValue();
            
		
		/*AddPlantPage.Plant.sendKeys(Keys.CONTROL +"a");
		Thread.sleep(2000);
	    AddPlantPage.Plant.sendKeys(Keys.DELETE);
	    
	    Thread.sleep(2000);
		AddPlantPage.Plant.sendKeys("RMC kandyS");*/
		
        Thread.sleep(2000);
        EditPlantPage.EditAddress.sendKeys(Keys.CONTROL + "a");
        EditPlantPage.EditAddress.sendKeys(Keys.DELETE);
        EditPlantPage.EditAddress.sendKeys(Address);
            
		Thread.sleep(2000); 
		EditPlantPage.EditSBUDropdown.click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.= '" + Sbu +"']")).click();
		
		Thread.sleep(2000);
        EditPlantPage.UpdateButton.click();
		
	}
	
	}
	

}
