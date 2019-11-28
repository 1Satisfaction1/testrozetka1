package com.rozetkatest.steps.serenity;

public interface ILocators {
    String SEARCH_FIELD = "//input";
    String CLICK_ON_IPHONE_XS = "//span[contains(text(),'xs')]";
    String CLICK_ON_THE_GOLD_COLOR = "(//a[@style=\"background-color: #FC9\"])[1]";
    String CHANGE_COLOR_TO_SPACE_GREY = "(//a[@class=\"variants-i-link ng-star-inserted\"])[2]";
    String ADD_TO_BASKET = "//button[@type='submit']";
    String CHECK_THE_VISIBLE_BASKET = "//button[@class='btn-link-green btn-link cart-check-button']";

}
