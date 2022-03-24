package com.company;
class MyMainemp{
    private int id;
    private String name;
    public MyMainemp(){
        id = 46;
        name = "patelmitul";

    }
    public MyMainemp(String myname,int i){
        id = i;
        name = myname;
    }
    public int getId(){
        return id;
    }
    public void setname(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id = i;
    }
}
public class M_32_constructor {
    public static void main(String[] args) {
        //method 1
//        MyMainemp mitul = new MyMainemp();
//        mitul.setId(34);
//        System.out.println(mitul.getId());

        //method 2  create a public constructor and pass the peramiter
        MyMainemp mitul = new MyMainemp("mitulpatel",35);
        System.out.println(mitul.getId());
        System.out.println(mitul.getName());
    }

}
