package com.practice;

import io.restassured.builder.ResponseBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintNumbersInJson {

    /*
    Write a function called print_numbers_in_json that takes a JSON string as input and prints all the numeric values found in the JSON string.
    Input Example:
    {"key1":10, "key2": 20, "key3":30, "key4":"abc"}
    Output: 10 20 30
    Constraints:
    The input is a valid JSON string.
    Only numeric values (integers or floats) should be printed.
    Do not print values that are strings, booleans, or null.
    */

    public static void print_json(String input) {
        //String regex = "-?\\d+(\\.\\d+)?";
        //String regex = ":(\\s*)[^A-Za-z](.\\d+)";
        // input = "abc123test45xyz-90end";
        String regex = ":(\\s*)(\\d+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group(2));
        }
    }

    public static void printResponseBuilder(String input) {
        ResponseBuilder responseBuilder =
                new ResponseBuilder().setBody(input).setStatusCode(200).setContentType(ContentType.JSON);
        Response response = responseBuilder.build();
        Map<String, Object> map = response.jsonPath().getMap("");
        map.values().stream()
                .filter(v -> v instanceof Integer)
                .forEach(System.out::println);
    }

    public static void printMap() {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("John", 50);

        scores.computeIfPresent("John", (key, value) -> 15);
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            entry.setValue(entry.getValue() + 10);
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        //System.out.println(scores);
    }

    public static void main(String[] args) {
        String input = """
                {
                  "key1": 10,
                  "key2": 20,
                  "key3":30,
                  "key4": "abc"
                }
                """;

        printResponseBuilder(input);
        print_json(input);
        printMap();
    }
}
