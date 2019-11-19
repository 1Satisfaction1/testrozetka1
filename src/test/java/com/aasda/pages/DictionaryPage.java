package com.aasda.pages;

import com.aasda.steps.serenity.ILocators;
import net.thucydides.core.annotations.DefaultUrl;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

@DefaultUrl("https://rozetka.com.ua/")
public class DictionaryPage extends PageObject {

    public void looks_for(String keywords) {
        $(ILocators.SEARCH_FIELD).type(keywords);
    }

    public void clickOnIphoneXs() {
        $(ILocators.CLICK_ON_IPHONE_XS).click();
    }

    public void clickOnTheSilverCircle(){
        $(ILocators.CLICK_ON_THE_SILVER_COLOR).click();
        //getDriver().findElement(By.xpath("//a[@class='g-i-tile-i-variants-color']")).getAttribute("background-color").equals("666");
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void clickOnTheReturnSpaceGrayColor(){
        $(ILocators.CHANGE_COLOR_TO_SPACEGREY).click();
        getDriver().manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    public void clickOnBasketButton(){
        $(ILocators.ADD_TO_BASKET).click();
        getDriver().manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    public boolean looksFor(String word) {
        return $(ILocators.CHECK_THE_VISIBLE_BASKET).isVisible();
    }
}