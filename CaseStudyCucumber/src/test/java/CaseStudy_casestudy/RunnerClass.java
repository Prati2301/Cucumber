package CaseStudy_casestudy;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="feature"
,glue = {"CaseStudy_casestudy"},
		tags="@Login"
//tags="@Data-Driven"


)


public class RunnerClass {
	
}
