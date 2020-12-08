$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/charactersIDandHouse.feature");
formatter.feature({
  "name": "Verify number of character id and house",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "number of character id and house",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@conid"
    }
  ]
});
formatter.step({
  "name": "set URI",
  "keyword": "Given "
});
formatter.match({
  "location": "SortingHats.set_URI()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "send get request with key and \"character\" endPoints",
  "keyword": "When "
});
formatter.match({
  "location": "badKey.send_get_request_with_key_and_endPoints(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify status code is 200 and contentType is \"application/json; charset\u003dutf-8\"",
  "keyword": "When "
});
formatter.match({
  "location": "badKey.verify_status_code_is_and_contentType_is(Integer,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify all characters in the response have \"_id\" field which is not empty",
  "keyword": "When "
});
formatter.match({
  "location": "CharactersIdAndHouse.verify_all_characters_in_the_response_have_field_which_is_not_empty(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that value type of the field dumbledoresArmy is a boolean in all characters in the response",
  "keyword": "And "
});
formatter.match({
  "location": "CharactersIdAndHouse.verify_that_value_type_of_the_field_dumbledoresArmy_is_a_boolean_in_all_characters_in_the_response()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify value of the house in all characters in the response is one of the following",
  "rows": [
    {
      "cells": [
        "\"Gryffindor\"",
        "\"Ravenclaw\"",
        "\"Slytherin\"",
        "\"Hufflepuff\""
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CharactersIdAndHouse.verify_value_of_the_house_in_all_characters_in_the_response_is_one_of_the_following(String\u003e)"
});
formatter.result({
  "status": "passed"
});
});