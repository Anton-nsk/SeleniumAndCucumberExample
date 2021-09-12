package ru.zoopassage.tests.basicpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasicPageElement {

    @FindBy(id = "zag1")
    protected static WebElement title;
    @FindBy(xpath = "//*[@id = 'header']//img[@alt='Зоо Пассаж']")
    protected WebElement logo;
    @FindBy(id = "bx_basketT0kNhm")
    protected WebElement btnCart;
}
