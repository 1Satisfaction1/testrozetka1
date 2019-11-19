package com.rozetkatest.steps.serenity;

import com.rozetkatest.pages.RozetkaPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

    RozetkaPage rozetkaPage;

    @Step
    public void is_the_home_page() {
        rozetkaPage.open();
    }
    @Step
    public void searchFor(String product) {
        rozetkaPage.searchFor(product);
    }
    @Step
    public void clickOnIphoneXs() {
        rozetkaPage.clickOnIphoneXs();
    }
    @Step
    public void clickOnTheGoldCircle(){
        rozetkaPage.clickOnTheGoldCircle();
    }
    @Step
    public void clickOnTheReturnSpaceGray(){
        rozetkaPage.clickOnTheReturnSpaceGrayColor();
    }
    @Step
    public void clickOnBasketButton(){
        rozetkaPage.clickOnBasketButton();
    }
    @Step
    public void searchBy(String product) {
        Assert.assertTrue("Failed", rozetkaPage.searchBy(product));
    }
}