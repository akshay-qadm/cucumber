package Pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import Pages.locators.SignInPageLocators;
import utils.SeleniumDriver;

public class SignInPage {
	
	WebDriver driver= SeleniumDriver.getDriver();
	SignInPageLocators logIn;
	
	public SignInPage() {
		
		logIn= new SignInPageLocators();
		PageFactory.initElements(driver, this.logIn);
		AjaxElementLocatorFactory factory= new AjaxElementLocatorFactory(driver, 10);
	}
	
	public void clickSignIn() {
		
		logIn.signIn.click();
	}
	
	public void enterEmail(String email) {
		
		logIn.email.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		
		logIn.password.sendKeys(password);
	}
	
	public String getPageTitle() {
		
		return driver.getTitle();
	}
	
	public String getSource() {
		
		return driver.getPageSource();
	}
	
	public void submit() {
		
		logIn.submit.click();
	}

}
