package pl.JDD.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

    private WebDriver driver;
    public ProductPage(WebDriver driver) {
        PageFactory.initElements(driver,this);

    }
}
