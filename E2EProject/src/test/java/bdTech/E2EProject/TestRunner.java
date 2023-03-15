package bdTech.E2EProject;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/features",
                  glue = "steps")
public class TestRunner extends AbstractTestNGCucumberTests{

}
