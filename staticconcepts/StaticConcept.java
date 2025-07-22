package staticconcepts;

public class StaticConcept {
     
    //non static variable
    String name;
    //static variable
    static String companyName; 
    
    //static block to initialize static variables
    static{
        companyName="Virtusa";
        System.out.println("Static block executed");
    }
    //constructor to set non static field
    StaticConcept(String name) {
        this.name=name;
    }
    // Non static method - directly access any static member 
    public void displayName(){
       System.out.println("Name: " + name );
       System.out.println("company name from non static: " + companyName);
     }
     // Static method - cannot access directly and need to create object
    static void displaycompanyName(){
        System.out.println("company name: " + companyName);
        StaticConcept obj=new StaticConcept("Valar");
        System.out.println("Accessing non static member from static: " + obj.name);
    }
    public static void main(String[] args) {
        //directly access static method
        StaticConcept.displaycompanyName();
        //create object and access non static method
        StaticConcept obj1=new StaticConcept("valar");
        StaticConcept obj2=new StaticConcept("hari");
        obj1.displayName();
        obj2.displayName();
        //modify static variables
        StaticConcept.companyName="Embitel technologies";
        obj1.displayName();
        obj2.displayName();
    }
       
}
