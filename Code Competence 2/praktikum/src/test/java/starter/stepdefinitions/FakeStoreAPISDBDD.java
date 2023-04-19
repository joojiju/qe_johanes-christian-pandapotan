package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Delete;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.rest.interactions.Post;
import net.serenitybdd.screenplay.rest.interactions.Put;
import org.json.simple.JSONObject;

import java.util.List;
import java.util.Map;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.emptyString;

public class FakeStoreAPISDBDD {
    String baseUrl = "https://fakestoreapi.com";

    @Given("{actor} call an api {string} with method {string} with payload below")
    public void callApi(Actor actor, String path, String method, DataTable table) {
        actor.whoCan(CallAnApi.at(baseUrl));

        // Create request body json instance
        JSONObject bodyRequest = new JSONObject();


        // Get headers
        List<List<String>> rowsList = table.asLists(String.class);
        List<String> headerList = rowsList.get(0);

        // Get values
        List<Map<String, String>> rowsMap = table.asMaps(String.class, String.class);
        Map<String, String> valueList = rowsMap.get(0);

        // Loop on every values Then set value with key from header to request body
        for (int i = 0; i < valueList.size(); i++) {
            String key = headerList.get(i);
            bodyRequest.put(key, valueList.get(key));
        }

        switch (method) {
            case "GET":
                actor.attemptsTo(Get.resource(path));
                break;
            case "POST":
                actor.attemptsTo(Post.to(path).with(request -> request.body(bodyRequest)));
                break;
            case "PUT":
                actor.attemptsTo(Put.to(path).with(request -> request.body(bodyRequest)));
                break;
            case "DELETE":
                actor.attemptsTo(Delete.from(path));
                break;
            default:
                throw new IllegalStateException("Unknown method");
        }
    }

    @Given("{actor} call an api {string} with method {string}")
    public void callApi(Actor actor, String path, String method) {
        actor.whoCan(CallAnApi.at(baseUrl));

        switch (method) {
            case "GET":
                actor.attemptsTo(Get.resource(path));
                break;
            case "POST":
                actor.attemptsTo(Post.to(path));
                break;
            case "PUT":
                actor.attemptsTo(Put.to(path));
                break;
            case "DELETE":
                actor.attemptsTo(Delete.from(path));
                break;
            default:
                throw new IllegalStateException("Unknown method");
        }
    }

    @Then("{actor} verify status code is {int}")
    public void userVerifyStatusCodeIs(Actor actor, int statusCode) {
        Response response = SerenityRest.lastResponse();
        response.then().statusCode(statusCode);
    }

    @Then("{actor} verify {string} is exist")
    public void userVerifyIsExist(Actor actor, String data) {
        Response response = SerenityRest.lastResponse();
        response.then().body(data, not(emptyString()));
    }

    @Then("{actor} verify response body should contain {string}")
    public void userVerifyResponseBodyShouldContain(Actor actor, String text) {
        Response response = SerenityRest.lastResponse();
        response.then().body(containsString(text));
    }

    @Then("{actor} verify response is match with json schema {string}")
    public void userVerifyResponseIsMatchWithJsonSchema(Actor actor, String schema) {
        Response response = SerenityRest.lastResponse();
        response.then().body(matchesJsonSchemaInClasspath(schema));
    }
}
