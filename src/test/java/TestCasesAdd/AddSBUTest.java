package TestCasesAdd;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.Initialization;
import Page.AddSBUPage;

public class AddSBUTest extends Initialization {
	
	AddSBUPage Addsubpage = new AddSBUPage();
	
	@Test
	
	public void AddSUB() throws InterruptedException,IOException
	{
		PageFactory.initElements(driver, Addsubpage);
		
		Thread.sleep(2000);
		AddSBUPage.SBU.click();
		
		Thread.sleep(2000);
		AddSBUPage.AddSBUButton.click();
		
		FileInputStream file = new FileInputStream("C:\\Automation_Workspace\\QDMS\\src\\test\\java\\Excel\\New Microsoft Excel WorksheetQDMS.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Add_SBU");
        
        int rowcount = sheet.getLastRowNum();
        for(int i=0; i<=rowcount;i++) {        
        	XSSFRow row = sheet.getRow(i);    
    
            String entersub = (String)row.getCell(0).getStringCellValue();
            String enterdescription = (String)row.getCell(1).getStringCellValue();
           
		
		
		
		Thread.sleep(2000);
		AddSBUPage.EnterSubBusinessUnit.sendKeys(entersub);
		
		Thread.sleep(2000);
		AddSBUPage.EnterSUBDescription.sendKeys(enterdescription);
		
		Thread.sleep(2000);
		AddSBUPage.SaveButton.click();
		
		
		
		
	}

}
}
