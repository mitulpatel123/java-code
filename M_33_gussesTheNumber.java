package com.company;
import java.util.Random;
import java.util.Scanner;

class game{
    public int NumberOfGuess = 0;
    public int UserInput;
    public int computerInput;

    public int getNumberOfGuess() {
        return NumberOfGuess;
    }
    public void setNumberOfGuess(int numberOfGuess) {
        NumberOfGuess = numberOfGuess;
    }


    game()
    {
        Random rand  = new Random();
        this.computerInput = rand.nextInt(100);
    }

    void TakeUser()
    {
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        UserInput = sc.nextInt();
    }

    boolean IsCorrectNumber()
    {
        NumberOfGuess++;
        if (UserInput == computerInput){
            System.out.format("Yes you have guess the right number %d\n the number of guess is %d",UserInput,NumberOfGuess);
            return true;
        }
        else if (UserInput<computerInput)
        {
            System.out.println("To low...");
        }
        else if (UserInput>computerInput)
        {
            System.out.println("To high...");
        }

        return false;
    }
}



public class M_33_gussesTheNumber {
    public static void main(String[] args) {
        game obj = new game();
        boolean b = false;
        while(!b){
            obj.TakeUser();
            b = obj.IsCorrectNumber();
        }
    }
}

