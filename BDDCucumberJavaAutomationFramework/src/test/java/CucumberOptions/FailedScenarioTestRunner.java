package CucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="@target/failed_Scenarios.txt", 
glue="StepDefinitions", 
monochrome=true,
plugin= {"html:target/cucumberHTMLReport.html","json:target/cucumberJSONReport.json",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class FailedScenarioTestRunner extends AbstractTestNGCucumberTests
{
	//Run the scenarios in parallel
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
}
