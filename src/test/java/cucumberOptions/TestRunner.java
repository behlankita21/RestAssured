package cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//import io.cucumber.testng.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/feature/placevalidation.feature",plugin ="json:target/jsonReports/cucumber-report.json",glue="stepDefinations")
		

public class TestRunner {

}
