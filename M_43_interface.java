package com.company;
interface Bycle{
    int a = 45;
    void applyBreak(int decrement);
    void SpeedUp(int increment);
}
interface Horn{
    void BlowHorn1();
    void BlowHorn2();
}

class avonCycle implements Bycle,Horn{
    void BlowHorn(){
        System.out.println("pee pee pee");
    }
    public  void applyBreak(int decrement){     //--------  public always
        System.out.println("Apply break");
    }
   public void SpeedUp(int increment){
       System.out.println("speed up");
   }

   public void BlowHorn1(){
       System.out.println("chal hut.....");
   }
    public void BlowHorn2(){
        System.out.println("abbe sale");
    }
}
public class M_43_interface {
    public static void main(String[] args) {
    avonCycle cycle1 = new avonCycle();
    cycle1.applyBreak(1);
    //you can create a properties in interface
        System.out.println(cycle1.a);
        //but you can not changed or modified properties becuze they are final
        //cycle1.a =565;
       // System.out.println(cycle1.a);

        cycle1.BlowHorn1();
        cycle1.BlowHorn2();
    }
}
