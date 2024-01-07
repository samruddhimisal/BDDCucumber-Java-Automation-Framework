package CucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Features", 
glue="StepDefinitions", 
monochrome=true, 
tags="@PlaceOrder or @OffersPage",
plugin= {"html:target/cucumberHTMLReport.html","json:target/cucumberJSONReport.json",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
"rerun:target/failed_Scenarios.txt"})

public class TestNGTestRunner extends AbstractTestNGCucumberTests
{
	//Run the scenarios in parallel
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
}
