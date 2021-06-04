package Pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInPageLocators {
	
	@FindBy(how=How.LINK_TEXT, using="SIGN IN")
	public WebElement signIn;
	
	@FindBy(how=How.LINK_TEXT, using="SIGN UP")
	public WebElement signUp;
	
	@FindBy(how=How.XPATH, using="//button[@data-provider='facebook']")
	public WebElement logInWithFacebook;
	
	@FindBy(how=How.XPATH, using="//button[@data-provider='google-oauth2']")
	public WebElement logInWithGoogle;
	
	@FindBy(how=How.XPATH, using="//input[@type='email']")
	public WebElement email;
	
	@FindBy(how=How.XPATH, using="//input[@type='password']")
	public WebElement password;
	
	@FindBy(how=How.XPATH, using="//button[@type='submit']")
	public WebElement submit;
	
	
	

}
