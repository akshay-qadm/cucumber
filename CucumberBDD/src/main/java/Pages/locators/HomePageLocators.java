package Pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageLocators {
	
	@FindBy(how=How.LINK_TEXT, using="buy + sell")
	public WebElement buyAndSell;
	
	@FindBy(how=How.LINK_TEXT, using="reviews")
	public WebElement reviews;
	
	@FindBy(how=How.LINK_TEXT, using="news")
	public WebElement news;
	
	@FindBy(how=How.LINK_TEXT, using="Search Cars")
	public WebElement searchCars;
	
	

}
