package ru.zoopassage.tests.runners;

import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.qameta.allure.Step;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = {"ru.zoopassage.tests"},
        plugin = "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"
)

public class TestRunner {

/*    public static WebDriver driver;

    @Before
    public void setWebDriver() throws Exception {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("['start-maximized']");
        driver = new ChromeDriver(chromeOptions);
    }*/
}
