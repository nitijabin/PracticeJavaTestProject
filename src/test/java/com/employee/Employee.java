package com.employee;

import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private double salary;

    Employee(int id, String name, double salary){
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }

    public int getId(){
        return id;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", salary=" + salary +
               '}';
    }

    public double getSalary() {
        return salary;
    }
}
