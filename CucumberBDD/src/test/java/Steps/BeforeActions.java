package Steps;

import java.io.IOException;

import cucumber.api.java.Before;
import utils.SeleniumDriver;

public class BeforeActions {
	
	@Before
	public static void setUp() throws IOException {
		
		SeleniumDriver.setUpDriver();
	}

}
