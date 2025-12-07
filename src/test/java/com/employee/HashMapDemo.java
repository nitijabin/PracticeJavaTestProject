package com.employee;

import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {
       /* Map<String, String> countryCapitalMap = new HashMap<>();
        countryCapitalMap.put("USA", "Washngton DC");
        countryCapitalMap.put("Canada", "Ottawa");
        countryCapitalMap.put("Bangladesh", "Dhaka");

        Set<String> redultSet = countryCapitalMap.keySet();
        System.out.println(redultSet);
        System.out.println("USA " + "USA".hashCode() % 16);
        System.out.println("Canada " + "Canada".hashCode() % 16);
        System.out.println("Bangladesh " + "Bangladesh".hashCode() % 16);

        Map<String, String> countryCapitalTreeMap = new TreeMap<>();
        countryCapitalTreeMap.put("USA", "Washngton DC");
        countryCapitalTreeMap.put("Canada", "Ottawa");
        countryCapitalTreeMap.put("Bangladesh", "Dhaka");

        Set<String> redultTreeSet = countryCapitalTreeMap.keySet();
        System.out.println(redultTreeSet);
        System.out.println("USA " + "USA".hashCode() % 16);
        System.out.println("Canada " + "Canada".hashCode() % 16);
        System.out.println("Bangladesh " + "Bangladesh".hashCode() % 16);


        Map<String, String> countryCapitalLinkedMap = new LinkedHashMap<>();
        countryCapitalLinkedMap.put("USA", "Washngton DC");
        countryCapitalLinkedMap.put("Bangladesh", "Dhaka");
        countryCapitalLinkedMap.put("Canada", "Ottawa");

        Set<String> redultLinkedSet = countryCapitalLinkedMap.keySet();
        System.out.println(redultTreeSet);
        System.out.println("USA " + "USA".hashCode() % 16);

        System.out.println("Bangladesh " + "Bangladesh".hashCode() % 16);

        System.out.println("Canada " + "Canada".hashCode() % 16);



        for (Map.Entry<String, String> entry : countryCapitalMap.entrySet()) {
            System.out.println("Hashmap : "+ entry.getKey() + "----->" + entry.getValue());
        }

        for (Map.Entry<String, String> entry : countryCapitalTreeMap.entrySet()) {
            System.out.println("Treemap : "+ entry.getKey() + "----->" + entry.getValue());
        }

        for (Map.Entry<String, String> entry : countryCapitalLinkedMap.entrySet()) {
            System.out.println("Linkedmap : "+ entry.getKey() + "----->" + entry.getValue());
        }

        */

        HashMap<Employee, String> empHashMap = new HashMap();
        Employee e1 = new Employee(101, "Niti", 135000);
        Employee e2 = new Employee(101, "Niti", 135000);
        Employee e3 = new Employee(102, "Kollol", 135000);
        Employee e4 = new Employee(103, "Anik", 135000);

        empHashMap.put(e1, "Whitby");
        empHashMap.put(null, "Ajex");
        empHashMap.put(null, "Whitby");
        empHashMap.put(e3, "Oshawa");
        empHashMap.put(e4, "Pickering");

        System.out.println(empHashMap);
        System.out.println(empHashMap.get(e2));

    }
}
