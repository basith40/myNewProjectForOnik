package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@io.cucumber.testng.CucumberOptions(  
	    features = "src/test/java/features",
	    glue="stepDefinations")
public class TestRunner extends AbstractTestNGCucumberTests  {

}
