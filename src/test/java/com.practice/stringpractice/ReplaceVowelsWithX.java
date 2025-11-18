package com.practice.stringpractice;

public class ReplaceVowelsWithX {
    public static String replaceVowels(String str) {
        char[] c = str.toCharArray();
        String vowels = "AEIOUaeiou";

        for (int i = 0; i < c.length - 1; i++) {
            if (vowels.indexOf(c[i]) != -1) {
                c[i] = 'x';
            }
        }
        String strSwap = new String(c);
        return strSwap;
    }
    public static String replaceVowelsSecondApproach(String str){
        return str.replaceAll("[AEIOUaeiou]", "x");
    }

    public static String replaceSpaceWithDash(String str){
        return str.replaceAll("[ ]", "*");
    }

    public static void main(String[] args) {
        System.out.println(ReplaceVowelsWithX.replaceVowels("Hello World"));
        System.out.println(ReplaceVowelsWithX.replaceVowelsSecondApproach("Hello World"));
        System.out.println(ReplaceVowelsWithX.replaceSpaceWithDash("Hel lo Wor ld"));
    }
}
