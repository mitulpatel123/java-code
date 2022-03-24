package com.company;

public class M_15_ps1 {
    public static void main(String[] args) {
        String s1 = "MITUL";
        System.out.println(s1.toLowerCase());


        //problem 2  white space to _
        String s2 = "mitul patel";
        System.out.println(s2.replace(" ","_"));

        //problem 3  name --> mitul
        String letter = "Dear <|Name|>, Thanks a lot!";
        System.out.println(letter.replace("<|Name|>","mitul"));

        //problem 4 string ma double triple space chhe k nai check it
        String s3 = "hi my  name is   mitul";
        System.out.println(s3.indexOf("  "));
        System.out.println(s3.indexOf("   "));

        //problem 5  convert string like a prof. letter
        String s4 = "Dear Mitul,This is a java cource.Thanks!";
        System.out.println(s4);
        System.out.println("----------------------------------");
        String s5 = "Dear Mitul, \n\tThis is a java cource. \n\tThanks!";
        System.out.println(s5);

    }
}
