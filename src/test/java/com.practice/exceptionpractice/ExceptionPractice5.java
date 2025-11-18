package com.practice.exceptionpractice;

import java.io.*;

public class ExceptionPractice5 {
    public static void main(String[] args) {
        File demofile = new File("src/test/java/com/practice" +
                "/exceptionPractice/demo.txt");
        FileReader fr;
        BufferedReader br = null;
        try {
            fr = new FileReader(demofile);
            br = new BufferedReader(fr);
            System.out.println(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
