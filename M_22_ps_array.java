package com.company;
import java.util.Scanner;

public class M_22_ps_array {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);

        //prob 1
//        float [] marks = {56.6f,67.5f,87.6f,23.6f,61.6f};
//        float sum = 0.0f;
//        for (float Element: marks)
//        {
//            sum = sum+Element;
//        }
//
//        System.out.println("the sum of the value is:  "+sum);

        //prob 2 match karava nu number ne given array sathe
//        int [] number = {1,3,4,5,6,7,8,9,69,64,67};
//        System.out.println("Enter the number you want to math with array");
//        int n1 = sc.nextInt();
//        int temp = 0;
//        for (int i=0;i< number.length;i++)
//        {
//            if (n1==number[i])
//            {
//                System.out.println("the number "+n1+" is match");
//                temp = 1;
//            }
//        }
//         if(temp==0)
//        {
//            System.out.println("the number is not match");
//        }

        //prob 3  sum
        //float [] marks = {56.6f,67.5f,87.6f,23.6f,61.6f};
//        float [] marks = {90.6f,90.5f,90.6f,90.6f,90.6f};
//        float sum = 0.0f;
//        for (float Element: marks)
//        {
//            sum = sum+Element;
//        }
//        System.out.println("the avg of marks in phy of the value is:  "+sum/ marks.length);

        //prob 4 add two 2D array
//        int marks1[][] = {{1,2,4},
//                           {3,5,7}};
//        int marks2[][] = {{1,2,4},
//                           {3,5,7}};
//
//        int result[][] = new int[2][3];
//
//        for (int i=0;i<marks1.length;i++)
//        {
//            for (int j=0;j<marks1[i].length;j++)
//            {
//                result[i][j] = marks1[i][j]+marks1[i][j];
//            }
//        }
//        for (int i=0;i<result.length;i++)
//        {
//            for (int j=0;j<result[i].length;j++)
//            {
//                System.out.print(result[i][j]);
//                System.out.print(" ");
//            }
//            System.out.print("\n");
//        }

        //prob 5 revrse an array two method one for loop ne undhu chalavo and biju this method swap an element (length-i-1)

//        int [] arr =  {1,2,3,4};
//        int swap;
//        int l = arr.length;
//        int a = Math.floorDiv(arr.length,2);
//        System.out.println("this is an array ");
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.println(arr[i]);
//        }
//        System.out.println("this is an reverse order");
//        for(int i=0;i<a;i++)
//        {
//            swap = arr[i];
//            arr[i] = arr[l-i-1];
//            arr[l-i-1]=swap;
//
//        }
//        for(int Element: arr)
//        {
//            System.out.println(Element);
//        }

        //prob 6 maximum number
        // in intiger max value is denote in java as Max.value and minimum as min.value

//        int [] arr = {-212,863,-4,55,6};
//        //int max =0;
//        int max = Integer.MIN_VALUE;
//        for (int e: arr)
//        {
//            if (max<e)
//            {
//                max = e;
//            }
//        }
//        System.out.println("the maximum number of array is "+max);
//        System.out.println(Integer.MAX_VALUE);   // this both print max and min value
//        System.out.println(Integer.MIN_VALUE);

//        prob 7 min value
//        int [] arr = {1,2,-34,56,76,4};
//        int min = Integer.MAX_VALUE;
//        for (int e: arr)
//        {
//            if (min>e)
//            {
//                min = e;
//            }
//        }
//        System.out.println("min value is "+min);

        //prob 8 sorted or not
        boolean change = true;
        int [] arr = {1,4,22,555,64,300};
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                change = false;
                System.out.println("the array is not sorted");
                break;
            }
        }
        if (change)
        {
            System.out.println("the array is  sorted");
        }
    }
}
