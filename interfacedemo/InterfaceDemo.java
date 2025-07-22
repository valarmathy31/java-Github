package interfacedemo;

interface dog{

    void sound();
    void color();
}
interface cat{
    void type();
    void food();
}
class Animal implements dog,cat{

    @Override
    public void color() {
        System.out.println("black");
    }
    @Override
    public void sound() {
        System.out.println("bark");   
    }
    @Override
    public void type() {
        System.out.println("bombaycat");   
    }
    @Override
    public void food() {
        System.out.println("Whiskas");   
    }
}
public class InterfaceDemo {
      public static void main(String[] args) {
        Animal obj1=new Animal();
        obj1.sound();
        obj1.color();
        obj1.type();
        obj1.food();

    }
}
