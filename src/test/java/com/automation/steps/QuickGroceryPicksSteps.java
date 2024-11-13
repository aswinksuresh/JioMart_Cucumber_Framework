package com.automation.steps;

import com.automation.pages.GroceryQuickPickPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class QuickGroceryPicksSteps {
    GroceryQuickPickPage groceryQuickPickPage = new GroceryQuickPickPage();
    @Then("verify user is on view all page of quick grocery")
    public void verify_user_is_on_view_all_page_of_quick_grocery() {
         groceryQuickPickPage.verifyIsGroceryQuickPicksPageDisplayed();
    }

    @When("user clicks add to cart button of first product")
    public void user_clicks_add_to_cart_button_of_first_product() {
     groceryQuickPickPage.clickOnAddToCartBtnOnFirstItem();
    }

    @Then("verify added to cart message is displayed")
    public void verify_added_to_cart_message_is_displyaed() {
          groceryQuickPickPage.verifyIsAddedToCartMsgDisplayed();
    }

    @Then("verify the cart icon quantity is {string}")
    public void verify_the_cart_icon_quantity_is(String quantity) {
     Assert.assertEquals(groceryQuickPickPage.verifyCartQuantityIconCount(), quantity);
    }

    @When("user click on cart link icon")
    public void user_click_on_cart_link_icon() {
        groceryQuickPickPage.clickOnCartIcon();

    }

}
