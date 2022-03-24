package com.company;
class A{
    public int a;
    public int Mitul(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am a meth 2 of class A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("I am a meth 2 of class B");
    }

    public void meth3(){
        System.out.println("I am meth 3 of class B");
    }

}
public class M_38_Method_overriding {
    public static void main(String[] args) {
    A a = new A();
    a.meth2();

    B b = new B();
    b.meth2();
    }
}
