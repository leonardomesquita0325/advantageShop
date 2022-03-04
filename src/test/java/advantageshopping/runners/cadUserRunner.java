package advantageshopping.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		        features = ".\\src\\test\\resources\\advantageshopping\\features\\cadUser.feature",
		        glue = { "" },
                plugin = {"pretty"},
                monochrome = true,
                snippets = SnippetType.CAMELCASE,
                dryRun = false
                )
public class cadUserRunner {

}
