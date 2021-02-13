package cucumberRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions
( 
		features =".//src/test/java/features/OrderingsingletopPizza.feature",
   		glue = "stepdefinitions",
   		monochrome =true,
   		plugin = {"pretty", "html:test-output/cucumber/report.html"}
   		
   		
				)
public class CukeRunner {

}
