package com.practice.exceptionpractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionPractice7 {
    public static void main(String[] args) {
        File demofile = new File("src/test/java/com/practice" +
                "/exceptionPractice/demo.txt");

        //auto closeable; Resourses try catch; file is opened and read then closed automatically by garbase collector
        try (BufferedReader br = new BufferedReader(new FileReader(demofile))){
            System.out.println(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
