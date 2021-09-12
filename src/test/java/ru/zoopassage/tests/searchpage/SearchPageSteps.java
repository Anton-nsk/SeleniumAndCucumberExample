package ru.zoopassage.tests.searchpage;

import io.cucumber.java.ru.Затем;
import io.cucumber.java.ru.И;

public class SearchPageSteps extends SearchPageActions {

    @Затем("Проверяем, что найден только один товар")
    public void checkIsGoodOne() {
        sumResultsIsOne();
    }

    @И("Выбираем вес товара \"([^\"]*)\" кг и добавляем в корзину")
    public void selectWeightGood(String weight) {
        selectWeightProduct(weight);
        addToCart();
    }
}
