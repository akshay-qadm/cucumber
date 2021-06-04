package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDriver {
	
	private static SeleniumDriver seleniumDriver;
	
	private static WebDriver driver;
	private static WebDriverWait wait;
	public final static int TIMEOUT= 10;
	public final static int PAGE_LOAD_TIMEOUT=50;
	public static FileInputStream fis;
	public static Properties config;
	
	private SeleniumDriver() throws IOException {
		
		fis= new FileInputStream("F:\\Automation\\cucumber\\CucumberBDD\\src\\test\\resources\\properties\\config.properties");
		config= new Properties();
		config.load(fis);
		
		if(config.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		
		else if(config.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		wait= new WebDriverWait(driver, TIMEOUT);
		
	}
	
	public static void openPage(String url) {
		
		driver.get(url);
	}
	
	public static void setUpDriver() throws IOException {
		
		if(seleniumDriver==null) {
			
			seleniumDriver= new SeleniumDriver();
		}
		
	}
	
	public static WebDriver getDriver() {
		
		return driver;
	}
	
	public static void tearDown() {
		
		if(driver!=null) {
			
			driver.close();
			driver.quit();
		}
		
		seleniumDriver=null;
	}

}
