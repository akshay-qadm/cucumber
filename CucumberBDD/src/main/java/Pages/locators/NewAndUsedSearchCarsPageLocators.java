package Pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewAndUsedSearchCarsPageLocators {
	
	@FindBy(how=How.ID, using="makes")
	public WebElement make;
	
	@FindBy(how=How.ID, using="models")
	public WebElement model;
	
	@FindBy(how=How.ID, using="locations")
	public WebElement location;
	
	@FindBy(how=How.ID, using="priceTo")
	public WebElement maxPrice;
	
	@FindBy(how=How.ID, using="search-submit")
	public WebElement findMyNextCar;

}
