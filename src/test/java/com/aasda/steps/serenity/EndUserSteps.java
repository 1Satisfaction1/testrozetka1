package com.aasda.steps.serenity;

import com.aasda.pages.DictionaryPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

    DictionaryPage dictionaryPage;

    @Step
    public void is_the_home_page() {
        dictionaryPage.open();
    }
    @Step
    public void looks_for(String word) {
        dictionaryPage.looks_for(word);
    }
    @Step
    public void clickOnIphoneXs() {
        dictionaryPage.clickOnIphoneXs();
    }
    @Step
    public void clickOnTheGreyCircle(){
        dictionaryPage.clickOnTheSilverCircle();
    }
    @Step
    public void clickOnTheReturnSpaceGray(){
        dictionaryPage.clickOnTheReturnSpaceGrayColor();
    }
    @Step
    public void clickOnBasketButton(){
        dictionaryPage.clickOnBasketButton();
    }
    @Step
    public void looksFor(String word) {
        Assert.assertTrue("Failed",dictionaryPage.looksFor(word));
    }
}