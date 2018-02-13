package com.testflightbooking.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.qmetry.qaf.automation.testng.report.Report;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.testflightbooking.pages.FlightsPageSearchResults;
import com.testflightbooking.pages.OrbitxhomeTestPage;

public class TestOrbitz extends WebDriverBaseTestPage<WebDriverTestPage> {

	@Override
	protected void openPage(PageLocator locator, Object... args) {
		// TODO Auto-generated method stub
		
	}
	
	@Test
	
	public void testOrbitz()
	{
		OrbitxhomeTestPage homepage= new OrbitxhomeTestPage();
		homepage.lauchSite();
		homepage.verifyHomePage();
		homepage.getBtnFlightsBesttraveldeals().click();
		homepage.getBtnOnewayBesttraveldeals().click();
		homepage.getTxtFlyingfromBesttravelpage().sendKeys("pune");
		homepage.getTxtFlyingtoBesttraveldeals().sendKeys("coimbatore");
		homepage.getTxtDepartingBesttraveldeals().sendKeys("03/03/2018"+Keys.ENTER);
	  /*  homepage.getBtnSearchBesttraveldeals().click();*/
//		String	text=driver.findElement(By.xpath("//input[@id='arrival-airport-1']")).getText();
//		Reporter.log(text);
         Reporter.log("Elements in the component");
		FlightsPageSearchResults object = new FlightsPageSearchResults();
		object.verifyResults();
		 Reporter.log("Listed above are the Elements in the component");
		
		
	}

}
