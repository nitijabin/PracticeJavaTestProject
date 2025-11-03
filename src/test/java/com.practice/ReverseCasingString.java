package com.practice;

public class ReverseCasingString {
    public static void main(String[] args) {
        String data = "Hello World";
        char[] charDataArray = data.toCharArray();
        StringBuilder result = new StringBuilder();

        for (char c : charDataArray) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            }else if(Character.isLowerCase(c)){
                result.append(Character.toUpperCase(c));
            }else result.append(c);
        }
        System.out.println("Output: " + result.toString());
    }
}
