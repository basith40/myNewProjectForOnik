package sauce.demo;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/resources/demoBDD.feature",
                  glue = "stapdefinations")
public class TestRunner {
	

}
