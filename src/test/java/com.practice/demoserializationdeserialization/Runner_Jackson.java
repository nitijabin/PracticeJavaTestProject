package com.practice.demoserializationdeserialization;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Runner_Jackson {
    public static void main(String[] args) throws JsonProcessingException {
        //achieve serialization using Gson or Jackson library

        User user = new User("Niti", 33);
       //JAckson

        ObjectMapper mapper = new ObjectMapper();
        String data = mapper.writeValueAsString(user);
        System.out.println(data);

        String prettyData = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
        System.out.println(prettyData);

        //Deserialize
        String deserialize = "{\"name\":\"Niti\",\"age\":33}";
        User user2 = mapper.readValue(deserialize, User.class);
        System.out.println(user2);
    }
}
