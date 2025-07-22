package objectclass;

import java.util.Objects;

    class Student{
    private String name;
    private int age;
    private  int studId;

    Student(String name,int age,int studId){
        this.name=name;
        this.age=age;
        this.studId=studId;
    }

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

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", studId=" + studId + "]";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + this.age;
        hash = 67 * hash + this.studId;
        return hash;
    } 
    public boolean equals(Student obj) {
        return this.age == obj.getAge(); 
}
}
public class ObjectClass {
    public static void main(String[] args) {
        Student s1=new Student("Valar",21 ,6);
        Student s2=new Student("hari",21 ,7);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println("Hashcode: "+s1.hashCode());
        System.out.println("Hashcode: "+s2.hashCode());
        System.out.println("Result: "+ s1.equals(s2));
}
}