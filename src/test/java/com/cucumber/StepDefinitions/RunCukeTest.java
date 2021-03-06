package com.cucumber.StepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/com/cucumber/features",
		glue = "com.cucumber.StepDefinitions",
		tags = { "@important,@sanity" },
/*		dryRun= false,
		strict = false,*/
		monochrome=true,
		plugin = { /*progress,usage,rerun*/
				"pretty","json:target/cucumber/testreport.json"
		} 

		)
public class RunCukeTest {
}