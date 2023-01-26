package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.Initialization;
import Page.DashboardPage;

public class DashboardTest extends Initialization
{
	
DashboardPage Dashboardpage = new DashboardPage();
	@Test
	
	public void Dashboard () throws InterruptedException,IOException
	{
		
		
		PageFactory.initElements(driver, Dashboardpage);
	
	Thread.sleep(2000);
	Dashboardpage.Master.click();
	
	

}
}