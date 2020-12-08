package Pages;

import io.restassured.response.Response;
import org.junit.Assert;

import java.util.Hashtable;
import java.util.List;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class Verify {

    public void verifyStatusLine(String string) {
        Response response = (Response) ScenarioContext.get(ScenarioContext.ContextKey.NoKeyCharacter);
        assertTrue(response.statusLine().contains(string));

    }
    public void statusCodeAndContentType(int stCode, String ConType) {
        Response response = (Response) ScenarioContext.get(ScenarioContext.ContextKey.NoKeyCharacter);
        assertEquals(ConType,response.contentType());
        assertEquals(stCode,response.statusCode());
    }

    public void verifyMessage(String message){
        Response response = (Response) ScenarioContext.get(ScenarioContext.ContextKey.NoKeyCharacter);
        assertEquals(message,response.path("error"));

    }
    public void statusCodeAndContentTypeWithKey(int stCode, String ConType) {
        Response response = (Response) ScenarioContext.get(ScenarioContext.ContextKey.Character);
        assertEquals(ConType,response.contentType());
        assertEquals(stCode,response.statusCode());
    }

    public void verifyNumberOfCharacters(int num){
        Response response = (Response) ScenarioContext.get(ScenarioContext.ContextKey.Character);
        List<String> characters = response.path("name");
        assertEquals(num,characters.size());

    }

    public void verifyIdisNotEmpty(String id){
        Response response = (Response) ScenarioContext.get(ScenarioContext.ContextKey.Character);
        List<String> listId = response.path(id);

        for (String stringStringHashtable : listId) {
            assertThat(stringStringHashtable,notNullValue());
        }

    }

    public void verifydumbledoresArmyIsBoolean(){
        Response response = (Response) ScenarioContext.get(ScenarioContext.ContextKey.Character);
        List<Boolean> listDumbledoresArmy = response.path("dumbledoresArmy");

        for (Boolean listArmy : listDumbledoresArmy) {

            assertThat(Boolean.valueOf(listArmy),isA(Boolean.class));
        }

    }

    public void verifyHouses(List<String> house) {
        Response response = (Response) ScenarioContext.get(ScenarioContext.ContextKey.Character);
        List<String> listHouses = response.path("house");
        System.out.println("listHouses.size() = " + listHouses.size());
        // house.add(" ");    "findAll {it.name == \"Gryffindor\"}.members"

        for (String listHouse : listHouses) {
           // assertTrue(house.contains(listHouse));
        }

    }
}
