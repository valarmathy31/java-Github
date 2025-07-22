package polymorphism;
//Method overloading
class Calculator{

    int add(int a,int b){
        return a+b;
    }
     int add(int a,int b,int c){
        return a+b+c;
     }
     double add(double a,double b){
        return a+b;
     }
     String add(String a,String b){
        return a+b;
     }
}
//Method overriding
class Fruit{
    void color(){
      System.out.println("Fruit color");
    }
}
class Apple extends Fruit{
    @Override
    void color(){
        super.color();
         System.out.println("Red");
    }
}
class Orange extends Fruit{
    @Override
    void color(){
        super.color();
        System.out.println("Orange");
    }
}
public class Polymorphism {
    public static void overloading(){
        Calculator cal=new Calculator();
        System.out.println("result1: " + cal.add(5,6));
        System.out.println("result2: " + cal.add(5,6,8));
        System.out.println("result3: " + cal.add(5.5,6.3));
        System.out.println("result4: " + cal.add("Valar","mathy"));
    }
    public static void overriding(){
        Fruit obj1=new Fruit();
        Apple obj2=new Apple();
        Orange obj3=new Orange();
        obj1.color();
        obj2.color();
        obj3.color();
    }
    public static void main(String[] args) {
        System.out.println("Method Overloading: ");
        overloading();

        System.out.println("------------------");

        System.out.println("Method Overriding: ");
        overriding();
}
}