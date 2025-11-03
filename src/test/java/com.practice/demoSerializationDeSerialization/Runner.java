package com.practice.demoSerializationDeSerialization;

import com.google.gson.Gson;

public class Runner {
    public static void main(String[] args) {
        //achieve serialization using Gson or Jackson library

        User user = new User("Niti", 33);
        Gson gson = new Gson();
        String convert = gson.toJson(user);
        System.out.println(convert);

        // deserialization with Gson
        String deserialize = "{\"name\":\"Niti\",\"age\":33}";
        User user2 = gson.fromJson(deserialize, User.class);
        System.out.println(user2);
    }
}
