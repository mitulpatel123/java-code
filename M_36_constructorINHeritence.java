package com.company;
class base1{
    public int x;

    //creating constructor
    base1(){
        System.out.println("i am a constructor");
    }
    base1(int x){
        System.out.println("i am overloaded base class with value of a as: "+x);
    }
}
class Derived1 extends base1 {
    public int y;
   Derived1(){
       super(4);
       System.out.println("i am derived class constructor");
   }
   Derived1(int x,int y){
       super(x);
       System.out.println(" this is y in derived class  as : "+y);
   }

}
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am ChildOfDerived class");
    }
    ChildOfDerived(int x,int y,int z){
        super(x, y);
        System.out.println("I am ChildOfDerived class and z is as:"+z);
    }
}
public class M_36_constructorINHeritence {
    public static void main(String[] args) {
       // base1 b = new base1();
        //Derived1 d = new Derived1();
        //Derived1 d = new Derived1(45,67);
       // ChildOfDerived cd = new ChildOfDerived();
        ChildOfDerived cd = new ChildOfDerived(12,45,90);


    }
}
