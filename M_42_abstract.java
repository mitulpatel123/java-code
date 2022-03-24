package com.company;

abstract class Parent2{
    public Parent2(){
        System.out.println("i am a parent class constructor");
    }
    public void SayHello(){
        System.out.println("hello sir");
    }
    abstract public void greet();
    abstract public void greet2();

}

class child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("good morning");
    }

    @Override
    public void greet2() {
        System.out.println("good afternoon");
    }
}

abstract class child3 extends Parent2{
    public void th(){
        System.out.println("i am good");
    }
}
public class M_42_abstract {
    public static void main(String[] args) {
        // Parent2 p = new Parent2();   ---- error   can't create an obj of abstract class
         child2 c = new child2();
        // child3 cc = new child3();    ---- error  can't create an obj of abstract class






    }
}
