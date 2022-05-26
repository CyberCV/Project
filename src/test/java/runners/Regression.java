package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/main/resurces/features/",

        glue = "steps",

        dryRun = false,

        monochrome = true,

        tags ="@regression"
)

public class Regression {
}
