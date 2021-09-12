package ru.zoopassage.tests.cartpage;

import io.qameta.allure.Step;
import org.junit.Assert;

public class CartPageActions extends CartPageElement {

    @Step("Проверяем, что в корзине единственная позиция и с требуемым наименованием")
    public void checkGoodForCart(int numberPositions, String nameGood) {
        checkInBasketGoods(numberPositions);
        Assert.assertTrue("Товара нет в корзине", nameGoodInCart(nameGood).isDisplayed());
    }

    @Step("Удалим позицию из корзины")
    public void deletePosition(String namePosition) {
        deletePositionByName(namePosition).isDisplayed();
        deletePositionByName(namePosition).click();
    }

    @Step("Проверяем, что корзина пуста")
    public void checkCartIsEmpty() {
        Assert.assertTrue("Корзина не пуста", cartIsEmpty.isDisplayed());
    }

    private void checkInBasketGoods(int numberPositions) {
        Assert.assertEquals("Количество товаров не совпадает с ожидаемым", numberPositions, itemInBasket.size());
    }
}
