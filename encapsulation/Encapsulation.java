package encapsulation;

class Student{
    private String name;
    private int age;
    private final int fees = 60000;
    //it contains getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getFees() {
        return fees;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", fees=" + fees + "]";
    }
    
}
public class Encapsulation {
    public static void main(String[] args) {
    Student s1= new Student();
    s1.setName("Valar");
    s1.setAge(22);
    System.out.println("Name: "+s1.getName());
    System.out.println("Age: "+ s1.getAge());
    System.out.println("Fees: "+s1.getFees());
    System.out.println(s1);
    }
}
