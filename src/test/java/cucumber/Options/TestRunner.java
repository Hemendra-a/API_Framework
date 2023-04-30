package cucumber.Options;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",
plugin ={"pretty","json:target/jsonReports/cucumber-report.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		,"rerun:target/failed_scenarios.txt",
		"html:target/HtmlReports/report.html",
		},
glue= {"stepDefinations"},tags= "")
public class TestRunner {
//tags= {"@DeletePlace"}  compile test verify
}

