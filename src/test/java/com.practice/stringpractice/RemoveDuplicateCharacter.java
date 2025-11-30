package com.practice.stringpractice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateCharacter {
    public static void main(String[] args) {
        String str = "Hello World";
       // RemoveDuplicateCharacter.practice(str);
        RemoveDuplicateCharacter.practiceTwo(str);
    }

    public static void practice(String str) {

        String strPP = str.replaceAll("[^A-Za-z]", "");
        char[] strArr = strPP.toCharArray();

        Set<Character> strOne = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();
        for (char c : strArr) {
            strOne.add(c);
        }
        for (char c : strOne) {
            sb.append(c);
        }
        System.out.println(sb);
    }

    public static void practiceTwo(String str){
        char[] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        List<Character> newList = new ArrayList<>();
        for(char c : ch){
          if(!newList.contains(c)){
              newList.add(c);
          }
        }
        for(char c : newList){
            sb.append(c);
        }
        System.out.println(sb.toString().replaceAll("[^A-Za-z]",""));
    }
}
