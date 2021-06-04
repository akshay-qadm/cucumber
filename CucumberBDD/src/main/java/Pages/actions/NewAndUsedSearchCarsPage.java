package Pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

import Pages.locators.NewAndUsedSearchCarsPageLocators;
import utils.SeleniumDriver;

public class NewAndUsedSearchCarsPage {

	public NewAndUsedSearchCarsPageLocators searchCars;
	public WebDriver driver;

	public NewAndUsedSearchCarsPage() {

		searchCars = new NewAndUsedSearchCarsPageLocators();
		driver = SeleniumDriver.getDriver();
		PageFactory.initElements(driver, this.searchCars);
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
	}

	public void selectMake(String make) {

		Select select = new Select(searchCars.make);
		select.selectByVisibleText(make);
	}

	public void selectModel(String model) {

		Select select = new Select(searchCars.model);
		select.selectByVisibleText(model);
	}

	public void selectlocation(String location) {

		Select select = new Select(searchCars.location);
		select.selectByVisibleText(location);
	}

	public void selectMaxPrice(String maxPrice) {

		Select select = new Select(searchCars.maxPrice);
		select.selectByVisibleText(maxPrice);
	}
	
	public void clickFindMyNextCar() {
		
		searchCars.findMyNextCar.click();
	}
}
