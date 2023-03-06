package com.example;

import static io.restassured.RestAssured.given;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import java.io.File;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void testUploadEndpoint() {
        given().formParam("test", "name — —")
                .formParam("checked", "true")
                .formParam("choice", "YES")
                .multiPart("file", new File("test.csv"), "text/csv")
            .contentType(ContentType.MULTIPART)
                .when().post("")
                .then()
                .statusCode(200).log().all(true);
    }
}