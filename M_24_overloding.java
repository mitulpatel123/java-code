package com.company;

public class M_24_overloding {
        static void morning()
        {
            System.out.println("hello good morning");
        }
        static void change(int a)
        {
            a = 98;
        }
        static void foo()
        {
            System.out.println("hello foo good morning ");
        }
        static void foo(int a)
        {
            System.out.println("hello foo "+a+ " good morning ");
        }
        static void foo(int a,int b)
        {
            System.out.println("hello "+a+" hello");
            System.out.println("hello "+b+" hello");
        }
       static void change2(int [] arr)
       {
        arr[0] = 98;
       }

        public static void main(String[] args) {
            morning();

            //method 1 intiger passing ---> value not change
//            int a = 56;
//            change(a);
//            System.out.println("int not change " + a);
//
//            //method 2 passing reffrence or array --> value change
//            int [] marks = {33,45,65,67,69,70};
//            change2(marks);
//            System.out.println("arr change " + marks[0]);

//            method overloding
            foo();
            foo(300);
            foo(400,700);

        }

}
