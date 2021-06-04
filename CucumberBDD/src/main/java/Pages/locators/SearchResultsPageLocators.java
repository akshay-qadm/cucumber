package Pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchResultsPageLocators {
	
	@FindBy(how=How.XPATH, using="//div[@class='carListing--content ']")
	public List<WebElement> searchResults;

}
