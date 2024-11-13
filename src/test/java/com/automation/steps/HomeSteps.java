package com.automation.steps;

import com.automation.pages.Homepage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {
    Homepage  homepage= new Homepage();
    @Given("User opens website")
    public void userOpensWebsite() {
        homepage.openWebsite();
    }
    @Then("verify user is on home page")
    public void verify_user_is_on_home_page() {
        homepage.verifyIsHomePageVisible();

    }

    @Then("user scroll to quick grocery picks")
    public void user_scroll_to_quick_grocery_picks() {
        homepage.scrollToGroceryQuickPicks();

    }

    @When("user click on view all of quick grocery picks")
    public void user_click_on_view_all_of_quick_grocery_picks() {
       homepage.clickOnGroceryQuickPicksViewAll();
    }


    @And("user search by keyword")
    public void userSearchByKeyword() {
        homepage.searchByKeyword();
    }
}
