package com.company;
class myemp{
    private int id;
    private String name;

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
public class M_31_access_modifiers {
    public static void main(String[] args) {
        myemp mitul = new myemp();
        mitul.setId(3);
        mitul.setname("mitulpatel");
        System.out.println(mitul.getId());
        System.out.println(mitul.getName());
    }
}
