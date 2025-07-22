package methods;

public class Methods {

    //overloaded method
    int add(int a, int b){
    return a+b;
    }
   
    int add(int a,int b,int c){
        return a+b+c;
    }

    double add(double a,double b){
        return a+b;
    }
    // method with parameter and return type
    int mul(int x,int y){
        return x*y;
    }
    //method without parameter and no return type
    void hello(){
        System.out.println("Hello World");
    }
    //method with parameter and no return type
    void printMessage(String message){
        System.out.println(message);
    }
    public static void main(String[] args) {
        Methods methods=new Methods();
        int result1= methods.add(2,3);
        int result2= methods.add(2,3,6);
        double result3= methods.add(2.4,3.6);
        System.out.println("The sum is: " + result1);
        System.out.println("The sum is: " + result2);
        System.out.println("The sum is: " + result3);

        int value = methods.mul(2,4);
        System.out.println(value);
        
        methods.hello();

        methods.printMessage("Hello java");
    }
}
