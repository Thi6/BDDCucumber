package com.bae.BDD.Test;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features = "C:\\Users\\Admin\\eclipse-workspace\\BDD\\src\\test\\java\\TeaTesting.feature", glue = {"com.bae.BDD.Test"})
@CucumberOptions(features = "C:\\Users\\Admin\\eclipse-workspace\\BDD\\src\\test\\java\\com\\bae\\BDD\\Test\\Parametisation.feature", glue = {"com.bae.BDD.Test"})
public class Runner {

}
