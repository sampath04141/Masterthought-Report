package module;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","json:target/jsonOutput/cucumber.json","html:target/report.html"},
                features = {"src/test/resources/module/features"}
               // ,tags = "@xx"
)
public class RunCucumberTest {

}
