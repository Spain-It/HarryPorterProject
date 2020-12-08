package Pages;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utilities.ConfigurationReader;

import java.util.List;
import java.util.Map;
import java.util.Random;

import static io.restassured.RestAssured.*;

public class GetMethods extends basePage {

    public Response getCharacters() {
        return given().accept(ContentType.JSON).queryParam("key", ConfigurationReader.get("key") + "0").get(EndPoints.toEnum("character").toString());
    }

    public Response getCharactersNoKey() {
        return given().accept(ContentType.JSON).get(EndPoints.toEnum("char").toString());
    }
    public Response getCharactersWithKey(String endPoint) {
        return given().accept(ContentType.JSON).queryParam("key",
             ConfigurationReader.get("key")).get(EndPoints.toEnum(endPoint).toString());
    }

    public Response getCharactersWithName() {
        Response response = (Response) ScenarioContext.get(ScenarioContext.ContextKey.Character);
        List<Map<String, Object>> listCharacters = response.as(List.class);
        Random rn = new Random();
        int num = rn.nextInt(195) + 0;
        String rnName = listCharacters.get(num).get("name").toString();
        System.out.println("rnName = " + rnName);
        Map<String, Object> expectedOneCharacter = listCharacters.get(num);
        System.out.println("expectedOneCharacter = " + expectedOneCharacter);

        return given().accept(ContentType.JSON).queryParam("key",
                ConfigurationReader.get("key")).get(EndPoints.toEnum("char").toString());
    }


}
