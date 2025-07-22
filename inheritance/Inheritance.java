package inheritance;
// single inheritance
class Animal {
    public String type;

    public Animal(String type) {
        this.type=type;
    }
    void eat(){
        System.out.println("Animal is eating");
    } 
}
class Cat extends Animal{
   public String color;

   public Cat(String type, String color){
    super(type);
    this.color=color;
   }
   void sound(){
    System.out.println("cat sounds Meow");
   }
}
//Multilevel inheritance
class Kitten extends Cat{
    public String food;

    public Kitten(String type,String color,String food){
        super(type,color);
        this.food=food;
    }
    void play(){
        System.out.println("kitten is playing");
    }
}
//Heirarchical inheritance
class Vehicle{
    public String name;

    public Vehicle(String name){
        this.name=name;
    }
    void speed(){
        System.out.println("Vehicle speed");
    }
}
class Cycle extends Vehicle{
    public String color;

    public Cycle(String name,String color){
        super(name);
        this.color=color;
    }
    void color(){
        System.out.println("Cycle color");
    }
}
class Bike extends Vehicle{
    public int price;

    public Bike(String name,int price){
        super(name);
        this.price=price;
    }
    void rate(){
        System.out.println("Bike rate");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        System.out.println("Single Inheritance: ");
        Cat obj=new Cat("bombay cat","blue");
        System.out.println("Cat type: " + obj.type);
        System.out.println("Cat color: " + obj.color);
        obj.eat();
        obj.sound();
        
        System.out.println("-----------------------");

        System.out.println("Multilevel Inheritance: ");
        Kitten obj1=new Kitten("Ragdoll","white","Whiskas");
        System.out.println("Kitten type: " + obj1.type);
        System.out.println("Kitten color: " + obj1.color);
        System.out.println("Kitten food: " + obj1.food);
        obj1.eat();
        obj1.sound();
        obj1.play();

        System.out.println("-----------------------");

        System.out.println("Heirarchical Inheritance: ");
        Cycle obj2=new Cycle("Gear bike","blue");
        System.out.println("Cycle name: " + obj2.name);
        System.out.println("Cycle color: " + obj2.color);
        obj2.speed();
        obj2.color();

        Bike obj3=new Bike("Yamaha FZ",50000);
        System.out.println("Bike name  : " + obj3.name);
        System.out.println("Bike price : " + obj3.price);
        obj3.speed();
        obj3.rate();
    }
}
