package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
	(features="projectfeatures",
	glue="stepDefinitions",
	dryRun=false,
	monochrome=true,
	tags = { "@datatable_test","~@example_test","~@variable_test", "~@ignore","~@goodLogin", "~@badLogin", "@fullrun_test" },
	plugin= {"pretty","html:test-output"}	
	)
public class Runner {

}
