package TestCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.Initialization;
import Page.LoginPage;

public class LoginTest extends Initialization {
	LoginPage loginpg = new LoginPage();

	@Test
	public void Login() throws InterruptedException, IOException {

		PageFactory.initElements(driver, loginpg);

		FileInputStream file = new FileInputStream(
				"C:\\Automation_Workspace\\QDMS\\src\\test\\java\\Excel\\New Microsoft Excel WorksheetQDMS.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Login");
		
		int rowcount = sheet.getLastRowNum();
		
		
		
		for (int i = 0; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);
			
			String uName = (String) row.getCell(0).getStringCellValue();
			String pWord = (String) row.getCell(1).getStringCellValue();
			String dataset = (String) row.getCell(2).getStringCellValue();

			// if(driver.getCurrentUrl().contains(URL)) {

			LoginPage.Username.sendKeys(uName);
			LoginPage.Password.sendKeys(pWord);
			LoginPage.LoginButton.click();
			Thread.sleep(3500);
			
			//driver.navigate().refresh();
			
		String ExpectedResults = "http://192.168.1.35:8083/#/";
		String Actualresults = driver.getCurrentUrl();
		String ExpectedResultsWrong = "http://192.168.1.35:8083/#/login";
		

		if (dataset.equals("Correct"))
		{
			Assert.assertEquals(Actualresults, ExpectedResults);
			System.out.println("Successfully login");
		}	
		
		else 
		{
			
			Assert.assertEquals(Actualresults, ExpectedResultsWrong);
			System.out.println("Invalid username or password");
			
		}

		}
	}
}