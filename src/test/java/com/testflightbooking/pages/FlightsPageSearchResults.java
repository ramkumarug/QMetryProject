package com.testflightbooking.pages;


import java.util.List;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

import components.SearchresultsTestPage;

public class FlightsPageSearchResults extends WebDriverBaseTestPage<WebDriverTestPage> {
	int i=0;
	@Override
	protected void openPage(PageLocator locator, Object... args) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	@FindBy(locator = "li.childresults.searchresults")
	private  List<SearchresultsTestPage>  liChildresultsSearchresults;
	
	public List<SearchresultsTestPage>  getLiChildresultsSearchresults() {
		return liChildresultsSearchresults;
	}
	
	public void verifyResults() {
		
		for(SearchresultsTestPage result:liChildresultsSearchresults) {
			
			if(i<5) {
				Reporter.log("Flight name :"+result.getFlightnameSearchresult().getText());
				
				Reporter.log("Source and Destination::"+result.getTimeArrivalanddepartureSearchresults().getText());
				
				Reporter.log("Price:"+result.getPriceSearchresults().getText());
				i++;
				
			}
			else
				break;
			
		
				
			
		}
	}

}
