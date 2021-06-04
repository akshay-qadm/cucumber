package Pages.actions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import Pages.locators.SearchResultsPageLocators;
import utils.SeleniumDriver;

public class SearchResultsPage {
	
	SearchResultsPageLocators searchResult;
	WebDriver driver= SeleniumDriver.getDriver();
	
	public SearchResultsPage() {
		
		searchResult= new SearchResultsPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), this.searchResult);
		AjaxElementLocatorFactory factory= new AjaxElementLocatorFactory(SeleniumDriver.getDriver(), 10);
	}
	
	public List<WebElement> getSearchResults(){
		
		return searchResult.searchResults;
	}
	
	public String getPageTitle() {
		
		return driver.getTitle();
	}

}
