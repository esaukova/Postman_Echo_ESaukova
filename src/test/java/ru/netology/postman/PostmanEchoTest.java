package ru.netology.postman;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {
    @Test
    void testPostmanEcho() {
        given()
                .log().all()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("some data")
                .when()
                .post("/post")
                .prettyPeek()
                .then()
                .statusCode(200)
                .body("data", equalTo("some data"))
        ;
    }
}
