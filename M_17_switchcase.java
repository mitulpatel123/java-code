package com.company;
import java.util.Scanner;

public class M_17_switchcase {
    public static void main(String[] args) {
        System.out.println("Enter the age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        switch (age) {
            case 18 -> System.out.println("you are 18");
            case 26 -> System.out.println("you got a job");
            case 60 -> System.out.println("you are retired");
            default -> System.out.println("pls choose the right ans");
        }
    }
}

