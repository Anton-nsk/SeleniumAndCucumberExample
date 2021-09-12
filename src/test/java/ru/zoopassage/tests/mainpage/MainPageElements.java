package ru.zoopassage.tests.mainpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPageElements {

    @FindBy(xpath = "//*[@id = 'smart-title-search-input-test']")
    protected static WebElement searchInput;
}
