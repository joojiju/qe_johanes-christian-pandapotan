package apiTest;

import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.IsEqual.equalTo;

public class apiTest {
    @Test
    public void getAllPosts() {
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .header("Content-Type", "application/json")
                .when()
                .log().all()
                .get("/posts")
                .then()
                .log().all()
                .statusCode(200)
                .body("size()", greaterThan(0));
    }

    @Test
    public void createNewPosts() {
        JSONObject requestParams = new JSONObject();
        requestParams.put("userId", 1);
        requestParams.put("title", "Testing");
        requestParams.put("body", "Coba Tes");

        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .header("Content-Type", "application/json")
                .body(requestParams.toJSONString())
                .when()
                .log().all()
                .post("/posts")
                .then()
                .log().all()
                .statusCode(201)
                .body("userId", equalTo(1))
                .body("title", equalTo("Testing"))
                .body("body", equalTo("Coba Tes"))
                .body("id", notNullValue());
    }

    @Test
    public void createNewPostsInvalid() {
        JSONObject requestParams = new JSONObject();
        requestParams.put("userId", "User");
        requestParams.put("title", "Testing");
        requestParams.put("body", "Coba Tes");

        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .header("Content-Type", "application/json")
                .body(requestParams.toJSONString())
                .when()
                .log().all()
                .post("/posts")
                .then()
                .log().all()
                .statusCode(404)
                .body("userId", equalTo("User"))
                .body("title", equalTo("Testing"))
                .body("body", equalTo("Coba Tes"))
                .body("id", notNullValue());
    }

    @Test
    public void getPostsById() {
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .header("Content-Type", "application/json")
                .when()
                .log().all()
                .get("/posts/1")
                .then()
                .log().all()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("userId", equalTo(1))
                .body("title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"))
                .body("body", equalTo("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"));
    }

    @Test
    public void getPostsByIdInvalid() {
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .header("Content-Type", "application/json")
                .when()
                .log().all()
                .get("/posts/user")
                .then()
                .log().all()
                .statusCode(404);
    }

    @Test
    public void editPostsById() {
        String updatedTitle = "Ubah";
        String updatedBody = "Ubah";

        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .header("Content-Type", "application/json")
                .body("{\"id\":1,\"userId\":1,\"title\":\"" + updatedTitle + "\",\"body\":\"" + updatedBody + "\"}")
                .when()
                .log().all()
                .put("/posts/1")
                .then()
                .log().all()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("userId", equalTo(1))
                .body("title", equalTo(updatedTitle))
                .body("body", equalTo(updatedBody));
    }

    @Test
    public void editPostsByIdInvalid1() {
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .header("Content-Type", "application/json")
                .body("{\"id\":user,\"userId\":1,\"title\":\"Updated Title\",\"body\":\"Updated Body\"}")
                .when()
                .log().all()
                .put("/posts/user")
                .then()
                .log().all()
                .statusCode(500);
    }

    @Test
    public void editPostsByIdInvalid2() {
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .header("Content-Type", "application/json")
                .body("{\"id\":9999,\"userId\":1,\"title\":\"Updated Title\",\"body\":\"Updated Body\"}")
                .when()
                .log().all()
                .put("/posts/9999")
                .then()
                .log().all()
                .statusCode(500);
    }

    @Test
    public void deletePostsById() {
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .header("Content-Type", "application/json")
                .when()
                .log().all()
                .delete("/posts/1")
                .then()
                .log().all()
                .statusCode(200);
    }

    @Test
    public void deletePostsByIdInvalid1() {
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .header("Content-Type", "application/json")
                .when()
                .log().all()
                .delete("/posts/user")
                .then()
                .log().all()
                .statusCode(404);
    }

    @Test
    public void deletePostsByIdInvalid2() {
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .header("Content-Type", "application/json")
                .when()
                .log().all()
                .delete("/posts")
                .then()
                .log().all()
                .statusCode(404);
    }
}
