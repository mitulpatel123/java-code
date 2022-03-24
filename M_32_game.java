package com.company;

import java.util.Random;
import java.util.Scanner;

public class M_32_game {
    public static void main(String[] args) {
        System.out.println("this is game for rock paper and sissors");
        System.out.println("0 == rock, 1 == paper, 2 == sissors");
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int UserInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if (UserInput == computerInput){
            System.out.println("Draw");
        }
        else if (UserInput == 0 && computerInput == 2 || UserInput == 1 && computerInput == 0 || UserInput == 2 && computerInput == 1){
            System.out.println("You win!");
        }
        else {
            System.out.println("computer win");
        }

        System.out.println("computer choice is  " +computerInput);
    }
}
