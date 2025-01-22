package org.example;


import org.example.entity.Employee;

import javax.swing.*;
import java.util.*;

public class Main {


    public static void br() {
        System.out.println("------------------------------------------------------");
    }

    /*findDuplicates methodu içerisinde tekrar eden employeeleri başka bir listeye ekle ve
     bu listeyi return et. unique data için HashSet mi ?? */
    public static List<Employee> findDuplicates(List<Employee> employeeList) {

        List<Employee> duplicatedEmployees = new LinkedList<>();
        Map<Integer, Employee> employeeMap = new HashMap<>();

        for(Employee employee: employeeList) {
            if (employee == null) {
                System.out.println("DATA NOT FOUND - NULL");
                continue;
            } if (employeeMap.containsKey(employee.getId())) {
                duplicatedEmployees.add(employee);
            } else {
                employeeMap.put(employee.getId(), employee);
            }
        }
        return duplicatedEmployees;
    }


    /* Main sınıfı içerisinde Bir method daha yazmalısın findUniques Input olarak bir adet List almalı.
    findUniques LinkedList içerisinde geçen tekrar eden elemanlardan sadece bir tanesini ve tekrar etmeyen eleman varsa
    bu elemanları bulup bir mape eklemeli.
    */

    public static Map<Integer, Employee> findUniques(List<Employee> employeeList) {
        Map<Integer, Employee> employeeMap = new HashMap<>();
        Iterator<Employee> iterator = employeeList.iterator();

        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee == null) {
                System.out.println("null data buldum");
                continue;
            }
            if (!employeeMap.containsKey(employee.getId())) {
                employeeMap.put(employee.getId(), employee);

            }

        }
        return employeeMap;
    }




    /*Main sınıfı içerisinde removeDuplicates adında bir method daha yazmalısın. Input olarak bir adet List almalı.
    LinkedList list içerisinde bir data birden fazla kez geçiyorsa hepsini silmeli.
    Sadece tek geçen kayıtları bir listeye eklemeli ve bu listeyi dönmeli.
     */

    public static List<Employee> removeDuplicates(List<Employee> employeeList) {

        List<Employee> duplicates = findDuplicates(employeeList);
        Map<Integer, Employee> uniques = findUniques(employeeList);
        List<Employee> onlyUnique = new LinkedList<>(uniques.values());
        onlyUnique.removeAll(duplicates);
        return onlyUnique;
    }


    public static void main(String[] args) {

        List<Employee> employeesList = new ArrayList<>();

        Employee employee1 = new Employee(1, "Berk", "K");
        Employee employee2 = new Employee(1, "Furkan", "Y");
        Employee employee3 = new Employee(2, "Naim", "K");
        Employee employee4 = new Employee(2, "Gökhan", "Ö");
        Employee employee5 = new Employee(5, "Emrah", "K");
        Employee employee6 = new Employee(20, "Ali", "A");
        Employee employee7 = new Employee(20, "Veli", "V");
        Employee employee8 = new Employee(30, "Ayşe", "A");
        Employee employee9 = new Employee(30, "Fatma", "F");
        Employee employee10 = new Employee(999, "Mæhmut", "M");


        employeesList.add(employee1);
        employeesList.add(employee2);
        employeesList.add(employee3);
        employeesList.add(employee4);
        employeesList.add(employee5);
        employeesList.add(employee6);
        employeesList.add(employee7);
        employeesList.add(employee8);
        employeesList.add(employee9);
        employeesList.add(employee10);


        System.out.println("Full list of total " + employeesList.size() + " employees: " + employeesList);
        br();
        System.out.println("Duplicated Employees:\n" + findDuplicates(employeesList));
        br();
        System.out.println("Unique Employees:\n" + findUniques(employeesList));
        br();
        System.out.println("Remove dupes return uniques only: " + removeDuplicates(employeesList));






    }
}