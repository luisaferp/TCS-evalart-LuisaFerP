package co.com.tcs.evalart.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/evalart.feature",
        tags = "@Regresion",
         glue =  "co.com.tcs.evalart.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class RunnersTags {
}
