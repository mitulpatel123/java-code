package com.company;
import java.util.Scanner;

public class M_05_input_output {

    public static void main(String[] args) {
        System.out.println("Tacking the integer number from the USer");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1");
        int a = sc.nextInt();
        System.out.println("Enter the number2");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("the number of sum is ");
        System.out.println(sum);


        System.out.println("Tacking the integer number from the USer");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the float number1");
        float c = sc1.nextFloat();
        System.out.println("Enter the float number2");
        float d = sc1.nextFloat();
        float sum1 = c+d;
        System.out.println(sum1);

        Scanner sc2 = new Scanner(System.in);
        String str1 = sc2.nextLine();
        System.out.println(str1);

        boolean b2 = sc1.hasNextInt();
        System.out.println(b2);




    }
}
