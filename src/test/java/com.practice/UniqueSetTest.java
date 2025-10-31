package com.practice;

import org.testng.annotations.Test;
import java.util.HashSet;
import java.util.Set;

@Test
public class UniqueSetTest {

    @Test
    public void neerwer(){
        int [] set = {2,3, 2,1,4, 3,4};
        int number = uniqueSetResult(set);
        System.out.println("Print: " + number);
    }

    public int uniqueSetResult(int [] arr){
        Set<Integer> newset = new HashSet();
        for(int num : arr){
            newset.add(num);
        }
        return newset.size();
    }
}
