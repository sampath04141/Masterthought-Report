package module.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import module.pages.SearchGoogle;
import org.openqa.selenium.WebDriver;


public class SearchOnGoogleSteps {

    SearchGoogle searchGoogle=new SearchGoogle();

    @Given("I should be able to see google search")
    public void i_should_be_able_to_see_google_search() {
        searchGoogle.validateGoogle();
    }

    @When("I type {string}")
    public void i_type(String text) {
        searchGoogle.searchOnGoogle(text);
    }

    @Then("I can see {string} in search results")
    public void i_can_see_in_search_results(String expectedResult) {
        searchGoogle.verifySearchResults(expectedResult);
    }

    @Then("I can see {string} website")
    public void i_can_see_the_site(String expectedResult) {
        searchGoogle.verifyWebsite(expectedResult);
    }


}
