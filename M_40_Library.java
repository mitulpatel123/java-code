package com.company;

import java.util.Scanner;

class Library{
    public int [] TotalBooks = new int[100];
    public int [] IssueDate = new int[100];
    public int [] IssueYear = new int[100];
    public int [] IssueMonth = new int[100];
    public int [] ReturnDate = new int[100];
    public int [] ReturnYear = new int[100];
    public int [] ReturnMonth = new int[100];
    int i =0;
    int j =0;

    public void IssueOfBook(){
        i++;
        System.out.println("Enter the IssueDate");
        System.out.println("-------------------------");
        System.out.println("Enter the Date: ");
        Scanner sc = new Scanner(System.in);
         int Date = sc.nextInt();
         IssueDate[i] = Date;

        System.out.println("Enter the Month: ");
         int Month = sc.nextInt();
        IssueMonth[i] = Month;

        System.out.println("Enter the Year: ");
        int Year = sc.nextInt();
        IssueYear[i] = Year;
        System.out.println("--------------------");
        System.out.printf("You issue book no %d\n",i);
    }
    public void DisplayIssueDate(int i){
        System.out.printf("IssueDate Of Book %d:  %d/%d/%d\n",i,IssueDate[i],IssueMonth[i],IssueYear[i]);

    }

    public void ReturnOfBook(){
        i--;
        j++;
        System.out.println("Enter the ReturnDate");
        System.out.println("-------------------------");
        System.out.println("Enter the Date: ");
        Scanner sc1 = new Scanner(System.in);
        int Date1 = sc1.nextInt();
        ReturnDate[j] = Date1;

        System.out.println("Enter the Month: ");
        int Month1 = sc1.nextInt();
        ReturnMonth[j] = Month1;

        System.out.println("Enter the Year: ");
        int Year1 = sc1.nextInt();
        ReturnYear[j] = Year1;
    }
    public void DisplayReturnDate(int j){
        System.out.printf("ReturnDate Of Book %d:  %d/%d/%d\n",j,ReturnDate[j],ReturnMonth[j],ReturnYear[j]);

    }
    public void AddBook(){
        System.out.println("you adding a book in the library(Returning the book...)");
        System.out.println("Available book is");
        System.out.println((TotalBooks.length)-i);
    }
}
public class M_40_Library {
    public static void main(String[] args) {
    Library book1 = new Library();
    book1.IssueOfBook();
    book1.IssueOfBook();
    book1.IssueOfBook();
    book1.DisplayIssueDate(1);
    book1.DisplayIssueDate(2);
    book1.ReturnOfBook();
    book1.DisplayReturnDate(1);
    book1.AddBook();
    }
}
