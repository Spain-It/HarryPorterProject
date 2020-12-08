package step_defs;

import Pages.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class badKey {
    GetMethods getMethods=new GetMethods();
    Verify verify= new Verify();

    @When("the user send get request with characters end point and headers")
    public void the_user_send_get_request_with_characters_end_point_and_headers() {

        getMethods.set(ScenarioContext.ContextKey.Character, getMethods.getCharacters());
    }

    @When("the user print the response")
    public void the_user_print_the_response() {
        Response response = (Response) ScenarioContext.get(ScenarioContext.ContextKey.Character);

        System.out.println(response.prettyPrint());

        System.out.println();

    }

    @When("verify the status message is {string}")
    public void verify_the_status_message_is(String string) {

        verify.verifyStatusLine(string);

    }

    @When("the user send get request with characters and no key")
    public void the_user_send_get_request_with_characters_and_no_key() {
        getMethods.set(ScenarioContext.ContextKey.NoKeyCharacter, getMethods.getCharactersNoKey());
    }

    @When("verify status code is {int} and contentType is {string}")
    public void verify_status_code_is_and_contentType_is(int stCode, String ConType) {
      verify.statusCodeAndContentType(stCode,ConType);
    }

    @Then("verify the message is {string}")
    public void verify_the_message_is(String string) {
    verify.verifyMessage(string);
    }

    @When("send get request with key and {string} endPoints")
    public void send_get_request_with_key_and_endPoints(String string) {
       getMethods.set(ScenarioContext.ContextKey.Character, getMethods.getCharactersWithKey(string));
    }

    @When("Verify status code is {int} and contentType is {string}")
    public void verify_status_code_is_and_contentType_is(Integer int1, String string) {

     verify.statusCodeAndContentTypeWithKey(int1,string);

    }

    @Then("Verify response contains {int} characters")
    public void verify_response_contains_characters(int int1) {
     verify.verifyNumberOfCharacters(int1);
    }


}
