package com.jhumildes;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("Jessy","Humble", 345));
        employeeList.add(new Employee("Jake","Young", 4356));
        employeeList.add(new Employee("Kamilla", "Maia", 8743));
        employeeList.add(new Employee("Dora","Linda",3456));

        employeeList.forEach(employee -> System.out.println(employee));

    }
}
