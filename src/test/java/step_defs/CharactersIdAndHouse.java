package step_defs;

import Pages.Verify;
import io.cucumber.java.en.*;

import java.util.List;

public class CharactersIdAndHouse {
    Verify verify= new Verify();

    @When("Verify all characters in the response have {string} field which is not empty")
    public void verify_all_characters_in_the_response_have_field_which_is_not_empty(String id) {
    verify.verifyIdisNotEmpty(id);
    }

    @When("Verify that value type of the field dumbledoresArmy is a boolean in all characters in the response")
    public void verify_that_value_type_of_the_field_dumbledoresArmy_is_a_boolean_in_all_characters_in_the_response() {
     verify.verifydumbledoresArmyIsBoolean();
    }

    @Then("Verify value of the house in all characters in the response is one of the following")
    public void verify_value_of_the_house_in_all_characters_in_the_response_is_one_of_the_following(List<String > house) {
     verify.verifyHouses(house);
    }


}
