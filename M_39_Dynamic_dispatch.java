package com.company;
class phone{
    public void time(){
        System.out.println("time  is 13 pm...");
    }
    public void on(){
        System.out.println("the phone is on...");
    }
}
class Smartphone extends phone{
    public void music(){
        System.out.println("music is playing...");
    }
    public void on(){
        System.out.println("the smartphone is on...");
    }
}
public class M_39_Dynamic_dispatch {
    public static void main(String[] args) {
//        phone obj = new phone();
//        Smartphone obj2 = new Smartphone();

        phone obj = new Smartphone();

        obj.on();
//      obj.music();   ---. not allowed
        obj.time();
    }
}
