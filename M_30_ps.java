package com.company;
class emp{
    int salary;
    String name;

    public int GetSalary(){
        return salary;
    }

    public void SetName(String n){
        name = n;
    }

    public String GetName(){
        return name;
    }

}

class cellPhone{
    public void ring(){
        System.out.println("ringing...");
    }
    public void vibrate(){
        System.out.println("vibrating...");
    }
    public void call(){
        System.out.println("calling...om...");
    }
}
class Square{
    int side;
    int breadth;
    public int area()
    {
        return (side*side);
    }
    public int perimiterOfSquare(){
        return 4*side;
    }
    public int rectengleArea(){
        return (side*breadth);
    }
    public int perimiterOfRectengle(){
        return (2*(side+breadth));
    }
}
class tommy{
    public void heat()
    {
        System.out.println("heating the enemy...");
    }
    public void run()
    {
        System.out.println("Running from the enemy...");
    }
    public void fire()
    {
        System.out.println("firing to the enemy...");
    }
}
public class M_30_ps {
    public static void main(String[] args) {
        //problem 1
//        System.out.println("mitul");
//        emp mitul = new emp();
//        mitul.SetName("mitul patel");
//        mitul.salary = 345;
//        System.out.println(mitul.GetSalary());
//        System.out.println(mitul.GetName());

       // problem 2
//        cellPhone iphone = new cellPhone();
//        iphone.call();
//        iphone.vibrate();
//        iphone.ring();

        //problem 3
//        Square sq = new Square();
//        sq.side = 5;
//        sq.breadth = 4;
//        System.out.println("area of square");
//        System.out.println(sq.area());
//        System.out.println("perimeter of square");
//        System.out.println(sq.perimiterOfSquare());
//        System.out.println("area of rectangle");
//        System.out.println(sq.rectengleArea());
//        System.out.println("perimeter of rectangle");
//        System.out.println(sq.perimiterOfRectengle());

        //problem 5
        tommy player1 = new tommy();
        player1.run();
        player1.fire();
        player1.heat();
    }
}
