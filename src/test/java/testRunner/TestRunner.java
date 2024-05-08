package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
				//features = {".//Features"},
				//features = {".//Features/Login.feature"},
				features = {".//Features/Login.feature",".//Features/Registration.feature"},
				//features = {".//Features/LoginDDtExcel.feature"},
				//features = {".//Features/Registration.feature"},
				//features= {"@target/rerun.txt"},
				glue="stepDefinitions",
				plugin = {"pretty","html:reports/myreports.html",
						"rerun:target/rerun.txt",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
						},
				dryRun = false,  //checking brtween scenario steps and step definations methods
				monochrome = true,  //to avoid the junk charachers in output
				publish = true  //to publish report in cucumber server
				
				//tags="@sanity"  //this will execute scenario tagged with @sanity
				//tags="@sanity and @regression"  //scenario tagged with both sanity and regression
				//tags="@sanity and not @regression"  //scenario tagged with @sanity but not tagged with @regression
				//tags="@sanity or @regression"  //Scenario tagged with @sanity or @regression
				//tags="@regression"
		)
public class TestRunner {

}
