package Steps;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Pages.actions.HomePage;
import Pages.actions.NewAndUsedSearchCarsPage;
import Pages.actions.SearchResultsPage;
import Pages.actions.SignInPage;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.SeleniumDriver;

public class StepDefinition {
	
	HomePage homePage= new HomePage();
	NewAndUsedSearchCarsPage searchCars= new NewAndUsedSearchCarsPage();
	SearchResultsPage searchResult= new SearchResultsPage();
	SignInPage signIn= new SignInPage();
	
	//Steps to search new and used cars
	
	@Given("^User is at home page \"([^\"]*)\" of cars guide website$")
	public void user_is_at_home_page_of_cars_guide_website(String url) throws Throwable {
	    
		SeleniumDriver.openPage(url);
	}

	@When("^user move to menu$")
	public void user_move_to_menu(List<String> list) throws Throwable {

		String menu= list.get(1);
		homePage.goToBuyAndSell();
	}

	@And("^click on \"([^\"]*)\" link$")
	public void click_on_link(String searchCars) throws Throwable {
	    
		homePage.goToSearchCars();
	}

	@And("^select \"([^\"]*)\" from anyMake dropdown$")
	public void select_from_anyMake_dropdown(String make) throws Throwable {
	    
		searchCars.selectMake(make);
	}

	@And("^select \"([^\"]*)\" from Any Model dropdown$")
	public void select_from_Any_Model_dropdown(String model) throws Throwable {

		searchCars.selectModel(model);
	}
	
	@And("^select \"([^\"]*)\" from Location dropdown$")
	public void select_from_Location_dropdown(String location) throws Throwable {
	   
		searchCars.selectlocation(location);
	}


	@And("^select \"([^\"]*)\" from Price\\(Max\\) dropdown$")
	public void select_from_Price_Max_dropdown(String maxPrice) throws Throwable {
	    
		searchCars.selectMaxPrice(maxPrice);
	}

	@And("^click on Find_my_next_car button$")
	public void click_on_Find_my_next_car_button() throws Throwable {
	    
		searchCars.clickFindMyNextCar();
	}

	@Then("^search results should be displayed$")
	public void search_results_should_be_displayed() throws Throwable {
	    
		List<WebElement> search= searchResult.getSearchResults();
		if(search.size()==0) {
			Assert.fail("No results displayed");
		}
	}

	@And("^page title should be \"([^\"]*)\"$")
	public void page_title_should_be(String title) throws Throwable {
	    
		Assert.assertEquals(searchResult.getPageTitle(), title);
	}
	
	
	//Steps for Login Functionality
	
	@When("^user click on signUp signIn button$")
	public void user_click_on_signUp_signIn_button() throws Throwable {
	    
		homePage.topnav.signUpSignIn();
	}

	@When("^click on signIn link$")
	public void click_on_signIn_link() throws Throwable {
	    
		signIn.clickSignIn();
	}

	@When("^user enter email \"([^\"]*)\"$")
	public void user_enter_email(String email) throws Throwable {
	    
		signIn.enterEmail(email);
	}

	@When("^user enter password \"([^\"]*)\"$")
	public void user_enter_password(String password) throws Throwable {
	    
		signIn.enterPassword(password);
	}

	@When("^user click submit$")
	public void user_click_submit() throws Throwable {
	    
		signIn.submit();
	}

	@Then("^user should be able to successfully login$")
	public void user_should_be_able_to_successfully_login() throws Throwable {
	    
		Thread.sleep(2000);
		if(signIn.getSource().contains("Wrong email or password")) {
			Assert.fail("Login failed");
		}
	}

	@Then("^message should be displayed \"([^\"]*)\" and user can not login$")
	public void message_should_be_displayed_and_user_can_not_login(String message) throws Throwable {
	    
		Thread.sleep(2000);
		Assert.assertTrue(signIn.getSource().contains(message));
	}

}
