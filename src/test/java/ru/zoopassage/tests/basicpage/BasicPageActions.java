package ru.zoopassage.tests.basicpage;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import static ru.zoopassage.tests.infrustructure.driver.Setup.driver;

public class BasicPageActions extends BasicPageElement {

    public BasicPageActions() {
        PageFactory.initElements(driver, this);
    }

    public static void open(String url) {
        driver.get(url);
    }

    @Step("Проверям, что страница загрузилась корректно")
    public void checkOpenedPage() {
        Assert.assertTrue("Лого не отображается", logo.isDisplayed());
    }

    @Step("Проверяем, что открыта требуемая страница")
    public static void checkOpenNeedPage(String namePage) {
        Assert.assertEquals("Найден больше чем 1 элемент", namePage, title.getText());
    }

    @Step("Переходим в корзину")
    public void openCart() {
        btnCart.isDisplayed();
        btnCart.click();
    }
}
