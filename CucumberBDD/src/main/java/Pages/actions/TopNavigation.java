package Pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import Pages.locators.TopNavigationLocators;
import utils.SeleniumDriver;

public class TopNavigation {
	
	public TopNavigationLocators topnav;
	
	public TopNavigation() {
		
		topnav= new TopNavigationLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), this.topnav);
		AjaxElementLocatorFactory factory= new AjaxElementLocatorFactory(SeleniumDriver.getDriver(), 10);
	}
	
	public void signUpSignIn() {
		
		topnav.signUpSignIn.click();
	}
	
	public void clickSellMyCar() {
		
		topnav.sellMyCar.click();
	}
	
	public void clickSearchButton() {
		
		topnav.searchButton.click();
	}

}
