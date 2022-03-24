package com.company;
class EkClass{
    int a;

    public int getA() {
        return a;
    }

    EkClass(int v){
         this.a = v;
        System.out.println("i am first class and value is "+v);
    }
    public int returnone(){
        return 1;
    }
}
class DoClass extends EkClass{
    DoClass(){
        super(65);
        System.out.println("i  am a second class constructor and value is " +a);
    }
}
public class M_37_this_super {
    public static void main(String[] args) {
       // EkClass n = new EkClass();
        DoClass d = new DoClass();
        //System.out.println(n.getA());
    }
}
