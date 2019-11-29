package com.rozetkatest.pages;

import com.rozetkatest.steps.serenity.ILocators;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import java.util.concurrent.TimeUnit;

public class RozetkaPage extends PageObject implements ILocators{
    @Step
    public void is_the_home_page(){
        getDriver().get("http://Rozetka.com.ua");
    }
    @Step
    public void searchFor(String keywords) {
        $(SEARCH_FIELD).type(keywords);
    }
    @Step
    public void clickOnIphoneXs() {
        $(CLICK_ON_IPHONE_XS).click();
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Step
    public void clickOnTheGoldCircle(){
        $(CLICK_ON_THE_GOLD_COLOR).click();
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Step
    public void clickOnTheSpaceGrayColor(){
        $(CHANGE_COLOR_TO_SPACE_GREY).click();
        getDriver().manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    @Step
    public void clickOnBasketButton(){
        $(ADD_TO_BASKET).click();
        getDriver().manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    @Step
    public boolean searchBy(String word) {
        return $(CHECK_THE_VISIBLE_BASKET).isVisible();
    }
}
