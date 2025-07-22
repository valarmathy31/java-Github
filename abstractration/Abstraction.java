package abstractration;

abstract class Animal{
     String color;

     Animal(String color){
        this.color=color;
     }
     //Abstract method - has no body/implementation and overridden in subclass
     abstract String display(String color); 
     //Concrete method 
     void eat(){
        System.out.println("Animal is eating");
     }  
    }
class Dog extends Animal{
    Dog(String color){
     super(color);
    }
    @Override
    String display(String color){
        return color;
    } 
}
class Cat extends Animal{
    Cat(String color){
        super(color);
    }
    @Override
    String display(String color){
        return color;
    } 
}

public class Abstraction {
    public static void main(String[] args) {
        Animal obj1=new Dog("Black");
        Animal obj2=new Cat("White");
        obj1.eat();
        System.out.println(obj1.display(obj1.color));
        obj2.eat();
        System.out.println(obj2.display(obj2.color));

        
        
    }
}

