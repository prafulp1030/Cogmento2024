package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features="src/test/java/FeatureFiles",
		glue= {"Steps"},
		dryRun=false
		)
public class RunnerTest extends AbstractTestNGCucumberTests{

}
