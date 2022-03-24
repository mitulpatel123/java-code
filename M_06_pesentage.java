package com.company;
import java.util.Scanner;

public class M_06_pesentage {
    public static void main(String[] args) {
        System.out.println("Enter the 6 subject marks");
        System.out.println("--------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of subject 1 ");
        byte a = sc.nextByte();
        System.out.println("enter the marks of subject 2 ");
        byte b = sc.nextByte();
        System.out.println("enter the marks of subject 3 ");
        byte c = sc.nextByte();
        System.out.println("enter the marks of subject 4 ");
        byte d = sc.nextByte();
        System.out.println("enter the marks of subject 5 ");
        byte e = sc.nextByte();
        System.out.println("enter the marks of subject 6 ");
        byte f = sc.nextByte();
        System.out.println("------------------------------");
        int t1= (a+b+c+d+e+f);
        System.out.println("Total number of marks is  "+t1);
        System.out.println("------------------------------");
        System.out.println("percentage is: ");
        float b1 = (100*t1)/600;
        System.out.println(b1);
    }
}
