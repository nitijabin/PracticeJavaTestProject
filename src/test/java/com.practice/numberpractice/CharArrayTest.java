package com.practice.numberpractice;

public class CharArrayTest {
    public static void main(String[] args){
        String str = "Hello World";
        char[] c = str.toCharArray();

        StringBuilder newString = new StringBuilder();
        for(char ch : c){
            if(ch>= 'A' && ch<= 'Z')
            {
                newString.append((char)(ch+ 32));
            }
           /* else if(ch>= 'a' && ch<= 'z'){
                newString.append((char)(ch - 32));
            }

            */
            else{
                newString.append(ch);
            }
        }
        System.out.println(newString.toString());
    }
}
