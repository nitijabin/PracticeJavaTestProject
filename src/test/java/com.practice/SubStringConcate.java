package com.practice;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Test
public class SubStringConcate {
    /*   public List<Integer> findSubstring(String s, String[] words) {
           return new ArrayList<>();
       }
    */
    private long counter;

    private void wasCalled() {
        counter++;
    }
    public void tttt() {
        List<String> elements =
                Stream.of("aubi", "kkbkjh", "ckjk", "bughiu").filter(element -> element.contains("b")).collect(Collectors.toList());
        Optional<String> anyElement = elements.stream().findAny();
        System.out.println(anyElement);

        List<String> list = Arrays.asList("abc1", "abc2", "abc3");
        counter = 0;
        Stream<String> stream = list.stream().filter(element -> {
            wasCalled();
            return element.contains("2");
        });
        System.out.println(stream.collect(Collectors.toList()));
    }


}
