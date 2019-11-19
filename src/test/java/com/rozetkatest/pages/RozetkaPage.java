package com.rozetkatest.pages;

import com.rozetkatest.steps.serenity.ILocators;
import net.thucydides.core.annotations.DefaultUrl;

import net.thucydides.core.pages.PageObject;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

@DefaultUrl("https://rozetka.com.ua/")
public class RozetkaPage extends PageObject implements ILocators{

    public void searchFor(String keywords) {
        $(SEARCH_FIELD).type(keywords);
    }
    public void clickOnIphoneXs() {
        $(CLICK_ON_IPHONE_XS).click();
    }
    public void clickOnTheSilverCircle(){
        $(CLICK_ON_THE_GOLD_COLOR).click();
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void clickOnTheReturnSpaceGrayColor(){
        $(CHANGE_COLOR_TO_SPACEGREY).click();
        getDriver().manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    public void clickOnBasketButton(){
        $(ADD_TO_BASKET).click();
        getDriver().manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    public boolean searchBy(String word) {
        return $(CHECK_THE_VISIBLE_BASKET).isVisible();
    }
}