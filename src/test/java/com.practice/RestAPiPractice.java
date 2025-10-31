package com.practice;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.*;

@Test
public class RestAPiPractice {

    String baseUrl = "https://api.restful-api.dev";

    public RequestSpecification reqSpec(String url) {
        return new RequestSpecBuilder().setBaseUri(url).setContentType(ContentType.JSON).build();
    }

    public ResponseSpecification resSpec() {
        return new ResponseSpecBuilder().expectStatusCode(200).build();
    }


    public void validateGetAPI() {
        String jk = "/4";
        Response resp =
                RestAssured.given(reqSpec(baseUrl)).header("Authorization", "Bearer 12123").when().get("/objects" + jk).then().spec(resSpec()).statusCode(200).body("id", equalTo("4")) // Validate fields
                        .body("name", containsString("iPhone 11")) // Partial match
                        .body("data.color", equalTo("Purple"))
                        .body("data.capacity", equalTo(null))
                        .log().all().extract().response();
        System.out.println(resp);
        JsonPath jsonPath;
        Assert.assertEquals(resp.jsonPath().getString("name"), "Apple iPhone 11, 64GB");

    }
}
