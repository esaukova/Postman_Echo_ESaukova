package ru.netology.postman;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {
    @Test
    void testPostmanEcho() {
        // Given - When - Then
        //
        given()
                .log().all()
                .baseUri("https://postman-echo.com")
                .body("some data") //
        //
                .when()
                .post("/post")
        //
                .then()
                .statusCode(200)
                .body("data", equalTo("some data"))
        ;
    }
}
