package com.rozetkatest.steps;
import com.rozetkatest.pages.RozetkaPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class AddToTheBasketSteps {
    RozetkaPage rozetkaPage;

    @Given("the user is on the Rozetka home page")
    public void TheUserIsOnTheRozetkaHomePage() {
        rozetkaPage.is_the_home_page();
    }

    @When("^the user search for a thing by name '(.*)'")
    public void theUserSearchForAThingByNameIphone(String product) {
        rozetkaPage.searchFor(product);
    }

    @And("^the user choose by name iphone xs$")
    public void theUserChooseByNameIphoneXs() {
        rozetkaPage.clickOnIphoneXs();
    }

    @And("^the user click on the gold circle in any iphone$")
    public void theUserClickOnTheGoldCircleInAnyIphone() {
        rozetkaPage.clickOnTheGoldCircle();
    }

    @And("^the user return space gray color$")
    public void theUserReturnSpaceGrayColor() {
        rozetkaPage.clickOnTheSpaceGrayColor();
    }

    @And("^the user click on basket button$")
    public void theUserClickOnBasketButton() {
        rozetkaPage.clickOnBasketButton();
    }

    @Then("^the user check button '(.*)'")
    public void theUserCheckButtonОформитьЗаказIsVisible(String product) {
        Assert.assertTrue("Failed", rozetkaPage.searchBy(product));
    }
}