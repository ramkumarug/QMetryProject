package components;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebComponent;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class SearchresultsTestPage extends QAFWebComponent {

	
	
	
	
	public SearchresultsTestPage(String locator) {
		super(locator);
		// TODO Auto-generated constructor stub
	}

	@FindBy(locator = "time.arrivalanddeparture.searchresults")
	private QAFWebElement timeArrivalanddepartureSearchresults;
	
	@FindBy(locator = "price.searchresults")
	private QAFWebElement priceSearchresults;
	
	@FindBy(locator = "duration.searchresults")
	private QAFWebElement durationSearchresults;
	
	@FindBy(locator = "flightname.searchresult")
	private QAFWebElement flightnameSearchresult;




	

	

	public QAFWebElement getTimeArrivalanddepartureSearchresults() {
		return timeArrivalanddepartureSearchresults;
	}

	public QAFWebElement getPriceSearchresults() {
		return priceSearchresults;
	}

	public QAFWebElement getDurationSearchresults() {
		return durationSearchresults;
	}

	public QAFWebElement getFlightnameSearchresult() {
		return flightnameSearchresult;
	}

}
