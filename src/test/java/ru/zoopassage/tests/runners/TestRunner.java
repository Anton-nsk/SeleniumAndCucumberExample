package ru.zoopassage.tests.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = {"ru.zoopassage.tests"},
        plugin = "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"
)

public class TestRunner {

}
