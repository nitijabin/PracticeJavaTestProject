package com.practice.stringpractice;
import org.testng.annotations.Test;
import java.util.*;

@Test
public class Anagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {

            char[] arrayChar = s.toCharArray();
            Arrays.sort(arrayChar);

            String key = new String(arrayChar);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
    public static boolean isAnagram(String s, String t) {
        char [] str1 = s.toCharArray();
        Arrays.sort(str1);
        String strOneSorted = new String(str1);
        System.out.println(strOneSorted);
        char [] str2 = t.toCharArray();
        Arrays.sort(str2);
        String strTwoSorted = new String(str2);
        System.out.println(strTwoSorted);
        if(strOneSorted.equals(strTwoSorted))
            return true;
        else return false;
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> out = groupAnagrams(strs);
        System.out.println(out);

        String s = "anagram";
        String t = "nagaram";
        if(isAnagram(s,t))
        System.out.println("true");
        else   System.out.println("false");
    }
}

