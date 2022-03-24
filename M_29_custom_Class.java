package com.company;
import java.util.Scanner;
class Employee
{
    int id;
    String name;
    int salary;
    public void PrintDetails(){
        System.out.println("my id is "+id);
        System.out.println("and my name is "+name);
    }
    public int getsalary(){
        return salary;
    }
}
public class M_29_custom_Class {
    public static void main(String[] args) {
        System.out.println("this is custom class");
        Employee Mitul = new Employee();       // create an object for a class
        Employee Om = new Employee();          // create a new object

        Mitul.id = 11;
        Mitul.name = "mitul patel";
        Mitul.salary = 1000000;

        Om.id = 12;
        Om.name = "om khatri";
        Om.salary = 100000;

        // method 1
//        System.out.println(Mitul.id);
//        System.out.println(Mitul.name);

        //method 2  print details for a id name of employee
        Mitul.PrintDetails();
        int salary = Mitul.getsalary();
        System.out.println(salary);

        Om.PrintDetails();
        int salary1 = Om.getsalary();
        System.out.println(salary1);


//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the name");
//        String input1 = sc.nextLine();
//
//        System.out.println("enter the id");
//        int id1 = sc.nextInt();
//
//        System.out.println("enter the full name");
//        String name1 = sc.nextLine();

       // Employee input1 = new Employee();
    }
}
