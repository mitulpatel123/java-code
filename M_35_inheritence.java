package com.company;
class base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("i am in base class and setting x");
        this.x = x;
    }

    public void PrintMe(){
        System.out.println("i am a constructor");
    }
}
class Derived extends base{
   public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class M_35_inheritence {
    public static void main(String[] args) {
        base b = new base();
        b.setX(4);
        System.out.println(b.getX());

        // derived class      creating an object of derived class
        Derived d = new Derived();
        d.setX(43);
        System.out.println(d.getX());
    }
}
