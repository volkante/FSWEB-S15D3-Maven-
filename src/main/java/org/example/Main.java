package org.example;


import org.example.entity.Employee;

import java.util.*;

public class Main {

    //findDuplicates metodu

    public static List<Employee> findDuplicates(List<Employee> list){
        Set<Employee> uniqueEmployees = new HashSet<>();
        List<Employee> duplicatesList = new ArrayList<>();
        for(Employee employee:list){
            if (!uniqueEmployees.contains(employee)){
                uniqueEmployees.add(employee);
            } else {
                duplicatesList.add(employee);
            }
        }
        return duplicatesList;
    }

    public static Map<Integer, Employee> findUniques(List<Employee> list){
        Map<Integer,Employee> employeeMap = new HashMap<>();
        for(Employee employee: list){
            if(employee != null){
                employeeMap.put(employee.getId(), employee);
            }

        }
        return employeeMap;
    }

    public static List<Employee> removeDuplicates(List<Employee> list){

        List<Employee> uniqueList = new LinkedList<>();

        for(Employee employee: list){
            if(employee!=null){
                if(!uniqueList.contains(employee)){
                    uniqueList.add(employee);
                } else {
                    uniqueList.remove(employee);
                }
            }
        }
        return uniqueList;
    }


    public static void main(String[] args) {

        //Employee list tanımla:
        List<Employee> myEmployees = new LinkedList<>();
        //4 tane Employee oluştur, 2'si tekrar etsin
        Employee employee1 = new Employee(1,"Ali", "Tas");
        Employee employee2 = new Employee(2, "Barış", "Kara");
        Employee employee3 = new Employee(2,"Barış", "Kara");
        Employee employee4 = new Employee(3, "Ezgi", "Temelli");
        Employee employee5 = new Employee(3, "Ezgi", "Temelli");



        myEmployees.add(employee1);
        myEmployees.add(employee2);
        myEmployees.add(employee3);
        myEmployees.add(employee4);
        myEmployees.add(employee5);


        System.out.println("MyEmployees Listesi: " + myEmployees);


        System.out.println("Duplicatessssssss: " + Main.findDuplicates(myEmployees));
        System.out.println("uniqueler: " + Main.findUniques(myEmployees));
        System.out.println("tek tabancalarrrrrrr:" + Main.removeDuplicates(myEmployees));






        System.out.println("Hello World!");
    }
}