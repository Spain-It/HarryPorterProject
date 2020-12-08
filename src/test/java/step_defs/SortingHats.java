package step_defs;

import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ConfigurationReader;

import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;

public class SortingHats {
    static Response response;

    @Given("set URI")
    public void set_URI() {
        baseURI = ConfigurationReader.get("harryptr.uri");
    }

    @When("the user send get request")
    public void the_user_send_get_request() {

        response = given().get("/v1/sortingHat");
    }

    @Then("Verify the statusCode is {int}")
    public void verify_the_statusCode_is(Integer int1) {
        assertThat(response.statusCode(), is(int1));

    }

    @Then("Verify the Content Type is is {string}")
    public void verify_the_Content_Type_is_is(String conType) {
        assertThat(response.contentType(), is(conType));
    }

    @Then("Rensponse body contains  one of")
    public void rensponse_body_contains_one_of(List<String> listHouse) {
        assertTrue(listHouse.contains(response.asString()));
    }

    @When("the user send get request with {string} end point and headers")
    public void the_user_send_get_request_with_characters_end_point_and_headers(String str) {
        response = given().accept(ContentType.JSON).queryParam("key", ConfigurationReader.get("key") + "0").get(str);
    }

    @Then("Verify the response status message is {string}")
    public void verify_the_response_status_message_is(String string) {
   assertTrue(response.statusLine().contains(string));
    }

    @Then("Verify the response is following")
    public void verify_the_response_is_following(Map<String, String> error) {
     assertEquals(response.path("error"),error.get("error"));
    }


}
