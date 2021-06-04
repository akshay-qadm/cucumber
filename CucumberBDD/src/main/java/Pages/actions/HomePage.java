package Pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import Pages.locators.HomePageLocators;
import utils.SeleniumDriver;

public class HomePage {
	
	public HomePageLocators homePage;
	public WebDriver driver;
	public Actions action;
	public TopNavigation topnav= new TopNavigation();
	
	public HomePage() {
		
		homePage= new HomePageLocators();
		driver= SeleniumDriver.getDriver();
		PageFactory.initElements(driver, this.homePage);
		AjaxElementLocatorFactory factory= new AjaxElementLocatorFactory(driver, 10);
	}
	
	public void goToBuyAndSell() {
		
		action= new Actions(driver);
		action.moveToElement(homePage.buyAndSell).perform();
	}
	
	public void goToSearchCars() {
		
		action.moveToElement(homePage.searchCars).click().perform();
		
	}
	
	public void gotoSignUpSignIn() {
		
		topnav.signUpSignIn();
	}

}
