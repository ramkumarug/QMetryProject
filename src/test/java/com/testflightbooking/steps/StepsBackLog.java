/**
 * 
 */
package com.testflightbooking.steps;

import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;

import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.step.NotYetImplementedException;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.util.Validator;

/**
 * @author Ram.kumar
 */
public class StepsBackLog extends WebDriverBaseTestPage<WebDriverTestPage> {

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "user opens the browser")
	public void OpensTheBrowser() {
		launchPage(null, null);

	}

	@Override
	protected void openPage(PageLocator locator, Object... args) {
		driver.get("/");
		driver.manage().window().maximize();

	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "user should see the orbitz homepage")
	public void verifyHomePage() {
		Validator.verifyThat(new WebDriverTestBase().getDriver().getCurrentUrl(),
				Matchers.equalToIgnoringCase(
						ConfigurationManager.getBundle().getString("env.baseurl")));
	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "user clicks on to flights tab")
	public void clicksOnToFlightsTab() {
		click("btn.flights.besttraveldeals");
	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "user clicks on to one way tab")
	public void clicksOnToOneWayTab() {
		click("btn.oneway.besttraveldeals");
	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "user enters the {0} in source")
	public void entersTheSource(String source) {

		sendKeys(source, "txt.flyingfrom.besttravelpage");
		click("lst.from.besttraveldeals");
	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "user enters {0} in destination")
	public void enteringDestination(String destination) {
		click("txt.flyingto.besttraveldeals");
		sendKeys(destination, "txt.flyingto.besttraveldeals");
		click("lst.to.besttraveldeals");
	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "user enters {0} as the date of journey")
	public void enteringDate(String date) {

		sendKeys(date, "txt.departing.besttraveldeals");
		click("txt.departing.besttraveldeals");
		click("btn.calender.besttraveldeals");

	}

	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "clicks on search")
	public void clicksOnSearch() {
		click("btn.search.besttraveldeals");
	}



}
