import io.javalin.Javalin;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.Endpoints;

public class EndpointsTest {

    private static Javalin app;

    @BeforeClass
    public static void setup() {
        app = Endpoints.getJavalinInstance();
        app.start(9000);
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 9000;
    }

    @AfterClass
    public static void teardown() {
        app.stop();
    }

    @Test
    public void testGetRequest() {
        get("/get-request").then().body(equalTo("GET request endpoint")).statusCode(202).extract().asString().equals("GET request endpoint hit!");
    }

    @Test
    public void testPostRequest() {
        post("/post-request").then().body(equalTo("POST request endpoint")).statusCode(201).extract().asString().equals("POST request endpoint hit!");
    }

    @Test
    public void testPutRequest() {
        put("/put-request").then().body(equalTo("PUT request endpoint")).statusCode(201).extract().asString().equals("PUT request endpoint hit!");
    }

    @Test
    public void testDeleteRequest() {
        delete("/delete-request").then().body(equalTo("DELETE request endpoint")).statusCode(200).extract().asString().equals("DELETE request endpoint hit!");
    }

    @Test
    public void testPatchRequest() {
        patch("/patch-request").then().body(equalTo("PATCH request endpoint")).statusCode(201).extract().asString().equals("PATCH request endpoint hit!");
    }
}
