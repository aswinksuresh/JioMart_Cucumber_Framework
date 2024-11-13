package com.automation.steps;

import com.automation.pages.CartPage;
import io.cucumber.java.en.Then;

public class CartSteps {
    CartPage cartPage = new CartPage();
    @Then("verify user is on cart page")
    public void verify_user_is_on_cart_page() {
    cartPage.verifyIsCartPageDisplayed();
    }

    @Then("verify the cart quantity")
    public void verify_the_cart_quantity() {
       cartPage.verifyCartQuantity();
    }
}
