package com.company;
class Circle{
    public int Radius;
    Circle(int r){
        System.out.println("this is a circle parameterized constructor ");
        this.Radius = r;
    }
    public double CircleArea(){

        return Math.PI*this.Radius*this.Radius;
    }

}
class Cylinder1 extends Circle{
    public int Height;

    Cylinder1(int r,int h) {
        super(r);
        System.out.println("i am a cylinder parameterized constructor");
        this.Height = h;
    }
    public double volume(){
        return Math.PI*this.Radius*this.Radius*this.Height;
    }
}
class Rectangle3{
    public int length;
    public int width;



    Rectangle3(int l,int w){
        System.out.println("this is a Rectangle parameterized constructor ");
        this.length = l;
        this.width = w;
       int  rr= rectangleArea();
        System.out.println("The area of Rectangle is: "+rr);
    }
    public int rectangleArea(){
        return length*width;
    }

}
class  Cuboid extends Rectangle3{
    public int breadth;
    Cuboid(int l,int b,int w){
       super( l, b);
        System.out.println("i am a Cuboid parameterized constructor");
       this.breadth = b;
       int cc = CuboidVolume();
        System.out.println("The volume of cube is: "+cc);
    }
    public int CuboidVolume(){
        return length*breadth*width;
    }
}
public class M_41_ps {
    public static void main(String[] args) {
        //problem 1
       // Circle objc = new Circle(4);
        //Cylinder1 obj1 = new Cylinder1(12,4);

        //problem 2
        //Rectangle3 rc = new Rectangle3(3,4);
        Cuboid cb = new Cuboid(3,4,5);

    }
}
