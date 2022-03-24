package com.company;

public class M_25_varargs {
//    static int sum(int a,int b)
//    {
//        return a+b;
//    }
//    static int sum(int a,int b,int c)
//    {
//        return a+b+c;
//    }
//    static int sum(int a,int b,int c,int d)
//    {
//        return a+b+c+d;
//    }
//    static int sum(int...arr)
//    {
//        int value = 0;
//        for (int a:arr)
//        {
//            value += a;
//        }
//        return value;
//    }

    //method 2 giving minimum one value
    static int sum(int x,int...arr)
    {
        int value = x;
        for (int a:arr)
        {
            value += a;
        }
        return value;
    }

    public static void main(String[] args) {
        System.out.println("the sum of the numbers");
//        System.out.println("the sum of the nothing" +sum());   //-----> through an error in case of method 2
        System.out.println("the sum of two number "+sum(4));
        System.out.println("the sum of two number "+sum(4,5));
        System.out.println("the sum of three number "+sum(4,5,6));
        System.out.println("the sum of four number "+sum(4,5,8,2));
    }
}
