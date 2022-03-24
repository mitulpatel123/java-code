package com.company;

import java.util.Locale;

public class M_14_string_methods {
    public static void main(String[] args) {
        String name = new String("mitul");
        String n1 = "MITUL patel";
        System.out.println(name);
        System.out.println(n1);

        int value = n1.length();
        System.out.println(value);

        //all capital string convert into lower case
        String s1 = n1.toLowerCase();
        System.out.println(s1);

        //all small string convert into uper case
        String s2 = n1.toUpperCase();
        System.out.println(s2);

        //trim for white space hatai de
        String newtrim = "   mitul   ";
        System.out.println(newtrim);
        System.out.println(newtrim.trim());
        String n2 = newtrim.trim();
        System.out.println(n2);

        //substring --> aetle jya thi index aapo tya thi string print kare
        System.out.println(name.substring(3 ));

        //substring(2,3) ---> strting from 2 and end in 3-1 = 2
        System.out.println(name.substring(1,3));

        //for replace character in string use replace
        System.out.println(name.replace("m","j"));

        //check string start with mi
        System.out.println(name.startsWith("mi"));
        System.out.println(name.startsWith("tu"));


        //check string end with ul
        System.out.println(name.endsWith("ul"));
        System.out.println(name.endsWith("mi"));

        //charAt--> work print the number of that position character
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));

        //indexof return a substring mitul mathi  (it)--> 1
        System.out.println(name.indexOf("it"));

        //indexof ma index pan aapi sakay ("it",3) to mitul ma i thi search thase aagad nu ignore thase
        System.out.println(name.indexOf("ul",3));

        //lastindexof  retunt last index
        // last index
        String modifyname = "mitttuuulll";
        System.out.println(modifyname.length());
        System.out.println(modifyname.lastIndexOf("l"));
        System.out.println(modifyname.lastIndexOf("t"));
        System.out.println(modifyname.lastIndexOf("t",3));    // mitt mathi searche thase 3 index 6e


        //name is equal mate name.equal()
        System.out.println(name.equals("mitul"));

        // uper lower case ne ignore karva mate
        System.out.println(name.equalsIgnoreCase("MITUL"));


        System.out.println("print ma double code add karva mate \" aavapray chhe");
        System.out.println("print ma double code add karva mate \\ aavapray chhe");
    }
}
