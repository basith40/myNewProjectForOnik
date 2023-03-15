package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = "src/test/java/cucumber", glue = "stapDefinitions",monochrome = true,
tags = "", plugin = {"html:target/cucmber.html"})
public class TestngTestRuner extends AbstractTestNGCucumberTests{

}
