package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",

        glue = "steps",

        dryRun = false,

        monochrome = true,

        tags = "@test",

        plugin = {"html:target/cucmber.html","pretty", "json:target/cucumber.json",
        "rerun:target/failed.txt"
        }
)
public class RunnerClass {
}
