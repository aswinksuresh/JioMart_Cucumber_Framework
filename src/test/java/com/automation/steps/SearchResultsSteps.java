package com.automation.steps;

import com.automation.pages.SearchResultPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchResultsSteps {
    SearchResultPage searchResultPage = new SearchResultPage();
    @When("user set the sort from high to low")
    public void user_set_the_sort_from_high_to_low() {
        searchResultPage.sortFromHighToLow();
    }

    @Then("verify current option is changed")
    public void verify_current_option_is_changed() {
        searchResultPage.checkPriceHighToLowOptionSelected();
    }

    @Then("verify search results are displayed")
    public void verifySearchResultsAreDisplayed() {
        Assert.assertTrue(searchResultPage.verifySearchResultsVisible());
    }
}
