package ru.zoopassage.tests.searchpage;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class SearchPageActions extends SearchPageElements {

    @Step("Проверяем видимость поля поиска")
    public void checkVisibleElement(WebElement element) {
        Assert.assertTrue("Ожидаемый элемент не отображается", element.isDisplayed());
    }

    @Step("Добавить в корзину товар")
    public void addToCart() {
        checkVisibleElement(btnAddCart);
        btnAddCart.click();
        Assert.assertEquals("В корзине более 1 товара", "1", counterGoodOfCart.getText());
    }

    @Step("Проверяем, что найден единственный результат")
    public void sumResultsIsOne() {
        checkVisibleElement(resultsSearch);
        Assert.assertEquals("Найден больше чем 1 элемент", 1, searchItems.size());
    }

    @Step("Выбираем вес товара")
    public void selectWeightProduct(String weight) {
        String weightSelectDefault = defaultWeightSelect.getText();
        if (!weightSelectDefault.equals(weight)) {
            switch (weight) {
                case "2":
                    productOptionSelected("2 кг").isDisplayed();
                    productOptionSelected("2 кг").click();
                    break;
                case "7":
                    productOptionSelected("7 кг").isDisplayed();
                    productOptionSelected("7 кг").click();
                    break;
                case "14":
                    productOptionSelected("14 кг").isDisplayed();
                    productOptionSelected("14 кг").click();
                    break;
                default:
                    throw new IllegalStateException("Неизвестное значение: " + weight);
            }
        }
    }
}
