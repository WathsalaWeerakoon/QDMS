package TestCasesAdd;

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
import Page.LoginPage;

public class AddPlantTest extends Initialization {
	
	AddPlantPage Addplantpage = new AddPlantPage();
	
	@Test
	
	public void AddPlant() throws InterruptedException , IOException
	{
		
		PageFactory.initElements(driver, Addplantpage);
		Thread.sleep(2000);
		//Addplantpage.AddPlantButton.click();
		
		FileInputStream file = new FileInputStream("C:\\Automation_Workspace\\QDMS\\src\\test\\java\\Excel\\New Microsoft Excel WorksheetQDMS.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Add_Plant");
        
        int rowcount = sheet.getLastRowNum();
        for(int i=0; i<=rowcount;i++) {        
        	XSSFRow row = sheet.getRow(i);    
    
            String code = (String)row.getCell(0).getStringCellValue();
            String plant = (String)row.getCell(1).getStringCellValue();
            String address = (String)row.getCell(2).getStringCellValue();
            String Sbu = (String)row.getCell(3).getStringCellValue();
            
            //if(driver.getCurrentUrl().contains(URL)) {
            
           // AddPlantPage.Code.sendKeys(Keys.CONTROL + "a");
            Addplantpage.AddPlantButton.click();
            AddPlantPage.Code.sendKeys(code);
            Thread.sleep(2000);
            AddPlantPage.Plant.clear();
            AddPlantPage.Plant.sendKeys(plant);
            Thread.sleep(2000);
            AddPlantPage.Code.clear();
            AddPlantPage.Address.sendKeys(address);
            Thread.sleep(2000);
            AddPlantPage.Address.clear();
            AddPlantPage.SubBuissinessUnit.click();
            Thread.sleep(2000);
    		driver.findElement(By.xpath("//span[.= '" + Sbu + "']")).click();
    		Thread.sleep(2000);
            AddPlantPage.Savebutton.click();
            
            
           
//		//;
	            
	            
	            //if(driver.getCurrentUrl().contains(URL)) {
	            
	           /* AddPlantPage.Code.sendKeys("REF");
	            AddPlantPage.Plant.sendKeys("NEW PLANT");
	            AddPlantPage.Address.sendKeys("Jaffna");
	            Thread.sleep(2000);
	            AddPlantPage.SubBuissinessUnit.click();
	            Thread.sleep(2000);
	    		driver.findElement(By.xpath("//span[.='RMC']")).click();
	    		Thread.sleep(2000);
	            AddPlantPage.Savebutton.click();*/
	            
	            
	            
	            
	            
	            /*Thread.sleep(2500);
	            driver.navigate().refresh();*/
	        
		//Thread.sleep(2000);
//		AddPlantPage.SubBuissinessUnit.click();
//		
//		Thread.sleep(1000);
//		AddPlantPage.SubBuissinessUnit.sendKeys(Keys.ENTER);
		//
		
	            
		
	        }
	
	
	}
//}
}	
	


