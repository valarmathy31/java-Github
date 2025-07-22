package constructors;

public class Student {
    
    String name;
    int id;
    
    //Defalut Constructor
    Student(){
        System.out.println("Default constructor");
    }

    //Parameterized Constructor
    Student(String name,int id){
         System.out.println("Parameterized constructor");
         this.name=name;
         this.id=id;
    }
    
    //Copy Constructor
    Student(Student obj){
         System.out.println("Copy constructor");
         this.name=obj.name;
         this.id=obj.id;
    }

    void displaystudentinfo(){
    System.out.println(" student name: " + name + " \nstudent id: " + id);
    }
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="valar";
        s1.id=6;
        s1.displaystudentinfo();

        Student s2= new Student("hari",7);
        s2.displaystudentinfo();

        Student s3= new Student(s2);
        s3.displaystudentinfo();
    }
}

