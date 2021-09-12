package ru.zoopassage.tests.mainpage;

import io.cucumber.java.ru.Тогда;

public class MainPageSteps {

    MainPageActions mainPageActions;

    public MainPageSteps() {
        this.mainPageActions = new MainPageActions();
    }

    @Тогда("Ищем товар с названием \"([^\"]*)\"$")
    public  void searchGood(String goodName) {
        MainPageActions.searchGoodForName(goodName);
    }
}
