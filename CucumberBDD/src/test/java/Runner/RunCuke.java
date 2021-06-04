package Runner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;

import com.cucumber.listener.ExtentCucumberFormatter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = { "json:target/RunCuke/cucumber.json", "pretty", "html:target/RunCuke/cucumber.html",
		"com.cucumber.listener.ExtentCucumberFormatter" }, features = "src/test/resources/features", glue = "Steps", dryRun=false, monochrome=true)

public class RunCuke extends AbstractTestNGCucumberTests {

	@BeforeClass
	public static void setUp() {
//		Initialise the extent report and generates output in
//		output/Run_<unique timestamp>/report.html file by default
		SimpleDateFormat sdf= new SimpleDateFormat("ddMMyyyy_hhmmss");
		Date curDate= new Date();
		String strDate= sdf.format(curDate);
		String fileName= System.getProperty("user.dir")+"\\target\\Extent_Reports\\"+strDate+".html";
		
		File file= new File(fileName);
		ExtentCucumberFormatter.initiateExtentCucumberFormatter(file, false);
		ExtentCucumberFormatter.loadConfig(new File("src/test/resources/extent-config.xml"));
		
		ExtentCucumberFormatter.addSystemInfo("Browser", "chrome");
		ExtentCucumberFormatter.addSystemInfo("Selenium version", "3.14.1");
		
		Map<String,String> systeminfo= new HashMap<String,String>();
		systeminfo.put("Cucumber version", "v1.2.3");
		systeminfo.put("Extent Report Version", "v1.1.0");
		
	}

}
