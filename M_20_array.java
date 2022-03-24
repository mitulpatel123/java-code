package com.company;

import javax.swing.*;
import javax.swing.text.Element;
import java.util.Scanner;

public class M_20_array {
    public static void main(String[] args) {
        int [] marks = new int[5];
//        marks[1] = 1;
//        marks[2] = 12;
//        marks[3] = 13;
//        marks[4] = 15;
//        marks[0] = 145;
//        System.out.println(marks[0]);


        //for length
//        int [] roll = {1,2,3,4,5,6};
//        System.out.println(roll.length);
//        float [] m1 = {67.6f,56.6f,56,43,78};
//        System.out.println(m1[0]);
//        String [] student = {"mitul","om","shubham"};
//        System.out.println(student[0]);
//        System.out.println(student.length);
//
//        for (int i=0;i<roll.length;i++)
//        {
//            System.out.println(roll[i]);
//        }


//        System.out.print("\n");
//        for (int i= roll.length-1;i>=0;i--)
//        {
//            System.out.println(roll[i]);
//        }
//        System.out.println("from each loop");
//        //int i =0;
//        for (int Element: roll)
//        {
//            //System.out.printf("%d->",i);
//            System.out.println(Element);
//           // i++;
  //      }
        int [] m4 = new int[5];
        Scanner st = new Scanner(System.in);
        for (int i =0;i<5;i++){
            int st1 = st.nextInt();
            m4[i] = st1;
        }
        for (int i =0;i<5;i++){
            System.out.println(m4[i]);
        }
    }
}
