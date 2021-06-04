package Pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TopNavigationLocators {
	
	@FindBy(how=How.ID, using="cgsearch")
	public WebElement search;
	
	@FindBy(how=How.XPATH, using="//input[@id='cgsearch']/following-sibling::a")
	public WebElement searchButton;
	
	@FindBy(how=How.XPATH, using="//li[@class='uhf-sell']//button")
	public WebElement sellMyCar;
	
	@FindBy(how=How.XPATH, using="//li[@class='uhf-user']/a")
	public WebElement signUpSignIn;

}
