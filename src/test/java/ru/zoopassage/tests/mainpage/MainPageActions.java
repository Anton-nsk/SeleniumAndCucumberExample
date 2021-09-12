package ru.zoopassage.tests.mainpage;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static ru.zoopassage.tests.infrustructure.driver.Setup.driver;

public class MainPageActions extends MainPageElements {

    public MainPageActions() {
        PageFactory.initElements(driver, this);
    }

    @Step("Проверяем видимость поля поиска")
    public static void checkVisibleElement(WebElement element) {
        Assert.assertTrue("Ожидаемый элемент не отображается", element.isDisplayed());
    }

    @Step("Проверяем, что поле поиска отображается и ищем товар по названию")
    public static void searchGoodForName(String nameGood) {
        checkVisibleElement(searchInput);
        searchInput.sendKeys(nameGood, Keys.ENTER);
    }
}
