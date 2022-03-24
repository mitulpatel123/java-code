package com.company;

public class M_16_elseIf_switch {
    public static void main(String[] args) {
        int age = 16;
        if (age>18){
            System.out.println("you can go");
        }
        else {
            System.out.println("you can not");
        }

        boolean b1 = true;
        boolean b2 = false;
        if (b1 && b2){
            System.out.println("y");
        }
        else {
            System.out.println("N");
        }

        if (b1 || b2)
        {
            System.out.println("y");
        }
        else {
            System.out.println("n");
        }
        if (b1 != b2){
            System.out.println("y");
        }
        else {
            System.out.println("n");
        }
    }
}
