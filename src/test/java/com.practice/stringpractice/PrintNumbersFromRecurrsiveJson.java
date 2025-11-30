package com.practice.stringpractice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.builder.ResponseBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintNumbersFromRecurrsiveJson {

    /*
    Write a function called print_numbers_in_json that takes a JSON string as input and prints all the numeric values found in the JSON string.
    Input Example:
                {
                  "key1": 10,
                  "key2": 20,
                  "key3":30,
                  "key4": "abc"
                  "address:" {
                  "house:" 41,
                  "city:" "whitby"
                  }
                }
    Output: 10 20 30 41
    Constraints:
    The input is a valid JSON string.
    Only numeric values (integers or floats) should be printed.
    Do not print values that are strings, booleans, or null.
    */

    public static void print_numbers_in_json(String json) {

        ObjectMapper mapper = new ObjectMapper();
        try {
            Map<String, Object> map = mapper.readValue(json, Map.class);
            extractValues(map).filter(v -> v instanceof Number).map(Object::toString)
                    .forEach(s -> System.out.print(s + " "));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static Stream<Object> extractValues(Object obj) {
        if (obj instanceof Map<?, ?> map) {
            return map.values().stream().flatMap(PrintNumbersFromRecurrsiveJson::extractValues);
        }
        if (obj instanceof List<?> list) {
            return list.stream().flatMap(PrintNumbersFromRecurrsiveJson::extractValues);
        }
        return Stream.of(obj);
    }

    public static void main(String[] args) {
        String input = """
                {
                  "key1": 10,
                  "key2": 20,
                  "key3": 30,
                  "key4": "abc",
                  "address": {
                    "house": 41,
                    "city": "whitby"
                  }
                }
                """;

        print_numbers_in_json(input);
    }
}


