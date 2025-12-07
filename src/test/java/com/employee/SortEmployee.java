package com.employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortEmployee {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee( 1,"Llex", 135000));
        employeeList.add(new Employee(2, "Tang", 120000));
        employeeList.add(new Employee(3, "Iresh", 135000));
        employeeList.add(new Employee(4, "Ritz", 100000));

        Employee e1 = new Employee(101, "Niti", 135000);
        Employee e2 = new Employee(101, "Niti", 135000);
        System.out.println("E1: " + e1.hashCode());
        System.out.println("E2: " + e2.hashCode());

        if(e1.equals(e2)){
            System.out.println("True");
        }else System.out.println("False");
        sortEmployeeBySalary(employeeList);
    }

    public static void sortEmployeeBySalary(List<Employee> employees){
        employees.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName))
                .forEach(s-> System.out.println(s.getName()+ " : "+s.getSalary()));
    }
}
