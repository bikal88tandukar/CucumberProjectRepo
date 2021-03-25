package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/example02/assertion.feature",
				"src/test/java/example03/login.feature",
				"src/test/java/example04/multiple.feature"
				},
		glue = {"StepDefinitions"}
		
		)
public class TestRunner {

}
