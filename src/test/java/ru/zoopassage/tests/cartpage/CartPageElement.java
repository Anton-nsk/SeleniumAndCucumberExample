package ru.zoopassage.tests.cartpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static ru.zoopassage.tests.infrustructure.driver.Setup.driver;

public class CartPageElement {

    @FindBy(id = "basket_items")
    protected WebElement resultsSearch;

    @FindBy(xpath = "//div[@id = 'basket_items']/div")
    protected List<WebElement> itemInBasket;

    @FindBy(xpath = "//*[@class = 'errortext'][text() = 'Ваша корзина пуста']")
    protected WebElement cartIsEmpty;

    protected WebElement deletePositionByName(String nameGood) {
        return driver.findElement(By.xpath(String.format("//div[@data-item-name = '%s']//*[@class = 'pagecart-positions-cost__remove']", nameGood)));
    }

    protected WebElement nameGoodInCart(String nameGood) {
        return driver.findElement(By.xpath(String.format("//div[@data-item-name = '%s']", nameGood)));
    }

    public CartPageElement() {
        PageFactory.initElements(driver, this);
    }
}
