package ru.zoopassage.tests.searchpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static ru.zoopassage.tests.infrustructure.driver.Setup.driver;

public class SearchPageElements {

    @FindBy(xpath = "//*[@class = 'product-option selected']/div[@class = 'product-option__amount']")
    protected WebElement defaultWeightSelect;
    @FindBy(id = "zag1")
    protected WebElement resultsSearch;
    @FindBy(xpath = "//div[contains(@class, 'catalog-products')]/div")
    protected List<WebElement> searchItems;
    @FindBy(xpath = "//a[contains(@class, 'product-buttonbar')]/*[@alt = 'Корзина']/..")
    protected WebElement btnAddCart;
    @FindBy(xpath = "//*[@class = 'navbar__cart-item-amount']")
    protected WebElement counterGoodOfCart;

    public SearchPageElements() {
        PageFactory.initElements(driver, this);
    }

    public WebElement productOptionSelected(String weight) {
        return driver.findElement(By.xpath(String.format("//*[@class = 'product-option']/div[text() = '%s']", weight)));
    }
}
