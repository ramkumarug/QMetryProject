package com.testflightbooking.test;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.testflightbooking.steps.StepsBackLog;

public class DataAssignment {
	@QAFDataProvider(dataFile="./resources/data/fromTo.csv")
	@Test
	public void fetchData(String from,String to) {
	
	StepsBackLog s=new StepsBackLog();
	s.OpensTheBrowser();
	s.clicksOnToFlightsTab();
	s.clicksOnToOneWayTab();
	s.entersTheSource(from);
	s.enteringDestination(to);
	
	s.enteringDate("03/01/2018");
	s.clicksOnSearch();
		
	}
}
