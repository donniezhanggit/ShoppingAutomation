package testRunners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import managers.FileReaderManager;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = {""},
        plugin = { "pretty", "html:target/cucumber-reports" ,"json:cucumber.json"}
)

public class TestRunner {

}
