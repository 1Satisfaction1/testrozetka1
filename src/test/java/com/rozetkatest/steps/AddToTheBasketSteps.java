package com.rozetkatest.steps;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.rozetkatest.steps.serenity.EndUserSteps;

public class AddToTheBasketSteps {

    @Steps
    EndUserSteps bil;

    @Given("the user is on the Rozetka home page")
    public void givenTheUserIsOnTheRozetkaHomePage() {
        bil.is_the_home_page();
    }
    @When("^the user search for a thing by name '(.*)'")
    public void theUserSearchForAThingByNameIphone(String product) { bil.searchFor(product); }
    @And("^the user choose by name iphone xs$")
    public void theUserChooseByNameIphoneXs() { bil.clickOnIphoneXs(); }
    @And("^the user click on the gold circle in any iphone$")
    public void theUserClickOnTheGoldCircleInAnyIphone(){
        bil.clickOnTheGoldCircle();}
    @And("^the user return space gray color$")
    public void theUserReturnSpaceGrayColor(){
        bil.clickOnTheReturnSpaceGray(); }
    @And("^the user click on basket button$")
    public void theUserClickOnBasketButton() {
        bil.clickOnBasketButton(); }
    @Then("^the user check button '(.*)'")
    public void theUserCheckButtonОформитьЗаказIsVisible(String product) {
        bil.searchBy(product);
    }
}
