package com.company;
import java.util.Scanner;

public class M_11_practice3 {
    public static void main(String[] args) {
        System.out.println("Given num is 50");
        int a = 50;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        double b = sc.nextDouble();

        System.out.println("your enter number is true when gretter than store number --> " +(a<b));
    }
}
