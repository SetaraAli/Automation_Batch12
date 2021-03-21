package ups.nj.myrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(  		
		// features means location of cucumber  feature folder 
		features = "CucumberBDD/loginFunction.feature",
		glue = "ups.nj.stefdef"		
		)
public class LoginRunner extends AbstractTestNGCucumberTests {

}
