package com.company;
class cylinder {
    private int radius;
    private int height;
    //problem 3

    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }
    public double SurfaceArea(){
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;

    }
    public double volumeOfCylinder(){
        return Math.PI * radius *radius *height;


    }
}
class rectangle{
    private int length;
   private int breadth;

    public rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public rectangle() {
        this.length = 4;
        this.breadth = 4;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
class sphare{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
public class M_34_ps {
    public static void main(String[] args) {
       // cylinder MyCylinder = new cylinder();
        //problem 3
        cylinder MyCylinder = new cylinder(9,12);
        MyCylinder.setRadius(9);
        MyCylinder.setHeight(12);

       int h =  MyCylinder.getHeight();
       int g =  MyCylinder.getRadius();
        /* problem 1 */
        System.out.println(h);
        System.out.println(g);
        //problem 2
        System.out.println(MyCylinder.volumeOfCylinder());
        System.out.println(MyCylinder.SurfaceArea());


        //problem 4
       // rectangle r = new rectangle(5,5);
        rectangle r = new rectangle();
        rectangle s = new rectangle();
        System.out.println(r.getBreadth());
        System.out.println(r.getLength());

        //problem 5
        sphare sp = new sphare();
        sp.setHeight(44);
        sp.setRadius(55);
        System.out.println(sp.getHeight());
        System.out.println(sp.getRadius());

    }
}
