package com.aasda.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.aasda.steps.serenity.EndUserSteps;
import org.yecht.Data;

public class DefinitionSteps {

    @Steps
    EndUserSteps bil;

    @Given("the user is on the Rozetka home page")
    public void givenTheUserIsOnTheRozetkaHomePage() {
        bil.is_the_home_page();
    }
    @When("^the user looks for a thing by name '(.*)'")
    public void theUserLooksForAThingByNameIphone(String word) { bil.looks_for(word); }
    @And("^the user choose by name iphone xs$")
    public void theUserChooseByNameIphoneXs() { bil.clickOnIphoneXs(); }
    @And("^the user click on the silver circle in any iphone$")
    public void theUserClickOnTheGoldCircleInAnyIphone(){
        bil.clickOnTheGreyCircle();}
    @And("^the user return space gray color$")
    public void theUserReturnSpaceGrayColor(){
        bil.clickOnTheReturnSpaceGray(); }
    @And("^the user click on basket button$")
    public void theUserClickOnBasketButton() {
        bil.clickOnBasketButton(); }
    @Then("^the user check button '(.*)'")
    public void theUserCheckButtonОформитьЗаказIsVisible(String word) {
        bil.looksFor(word);
    }
}
