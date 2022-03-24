package com.company;

public class M_21_2D_array {
    public static void main(String[] args) {
        int [][] student;
        student = new int[2][3];
        student[0][0] = 101;
        student[0][1] = 102;
        student[0][2] = 103;
        student[1][0] = 201;
        student[1][1] = 202;
        student[1][2] = 203;

        for(int i=0;i< student.length;i++)
        {
            for(int j=0;j< student[i].length;j++)
            {
                System.out.print(student[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
