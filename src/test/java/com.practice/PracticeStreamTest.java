package com.practice;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Test
public class PracticeStreamTest {

    public void streamFilterCheck(){
        List<User> users = Arrays.asList(
                new User("Alice", "Admin"),
                new User("Bob", "User"),
                new User("Charlie", "Admin")
        );

        List<String> adminNames = users.stream()
                .filter(user -> "Admin".equals(user.getRole()))
                .map(User::getName)
                //.filter(userName -> userName.startsWith("B"))
                .distinct()
                .sorted()
                .limit(2)
                .collect(Collectors.toList());

        System.out.println(adminNames); // [Alice, Charlie]
    }

    @Test
    public void Exercise() {

        ArrayList<String> a = new ArrayList<String>();
        a.add("apple");
        a.add("banana");
        a.add("cherry");
        a.add("mango");
        a.add("apple");

        System.out.println(a);
        a.removeAll(
                a.stream().filter(s->s.startsWith("a"))
                        .distinct()
                        .toList()
        );
        System.out.println(a);

        if(a.contains("banana"))
            System.out.println("found");
    }
}


