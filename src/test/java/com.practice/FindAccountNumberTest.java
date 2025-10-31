package com.practice;


import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
@Test
public class FindAccountNumberTest {

    public void findAccountNumber() {
        String[] accountNumber = {"finance-12345", "hr-1234", "it-123456", "admin-123", "finance", "hr"};
        List<String> result1 =
                Arrays.stream(accountNumber)
                        .filter(s -> s.matches("^(finance|it|hr)-\\d{4,6}$"))
                        .collect(Collectors.toList());

        System.out.println(result1);
        //   Arrays.stream(accountNumber).filter(s -> s.matches("^(finance | hr)-\\d{4,6}$")).collect(Collectors
        //   .toList());
    }
}