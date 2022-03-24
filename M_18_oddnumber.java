package com.company;
import java.util.Scanner;

public class M_18_oddnumber {
    public static void main(String[] args) {
        System.out.println("Enter the number as long as you print it");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i=1;i<=a;i++)
        {
            if ((i%2)!=0)
            {
                //2n+1;
                System.out.println(i);
            }

        }
    }
}
