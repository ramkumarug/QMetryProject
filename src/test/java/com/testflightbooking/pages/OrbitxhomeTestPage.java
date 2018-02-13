package com.testflightbooking.pages;

import org.hamcrest.Matchers;

import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Validator;

public class OrbitxhomeTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "btn.flights.besttraveldeals")
	private QAFWebElement btnFlightsBesttraveldeals;
	@FindBy(locator = "btn.oneway.besttraveldeals")
	private QAFWebElement btnOnewayBesttraveldeals;
	@FindBy(locator = "txt.departing.besttraveldeals")
	private QAFWebElement txtDepartingBesttraveldeals;
	@FindBy(locator = "txt.flyingfrom.besttravelpage")
	private QAFWebElement txtFlyingfromBesttravelpage;
	@FindBy(locator = "txt.flyingto.besttraveldeals")
	private QAFWebElement txtFlyingtoBesttraveldeals;
	@FindBy(locator = "btn.search.besttraveldeals")
	private QAFWebElement btnSearchBesttraveldeals;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}
	@QAFTestStep(description = "user is on the Homepage")
	public void lauchSite() {
		driver.get("/");
		driver.manage().window().maximize();
	}

	public QAFWebElement getBtnFlightsBesttraveldeals() {
		return btnFlightsBesttraveldeals;
	}

	public QAFWebElement getBtnOnewayBesttraveldeals() {
		return btnOnewayBesttraveldeals;
	}

	public QAFWebElement getTxtDepartingBesttraveldeals() {
		return txtDepartingBesttraveldeals;
	}

	public QAFWebElement getTxtFlyingfromBesttravelpage() {
		return txtFlyingfromBesttravelpage;
	}

	public QAFWebElement getTxtFlyingtoBesttraveldeals() {
		return txtFlyingtoBesttraveldeals;
	}

	public void verifyHomePage() {
		Validator.verifyThat(driver.getTitle(),
				Matchers.equalTo("ORBITZ.com – Best Travel Deals"));

	}
	public QAFWebElement getBtnSearchBesttraveldeals() {
		return btnSearchBesttraveldeals;
	}

}
