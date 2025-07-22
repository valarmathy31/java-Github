package exceptionhandling;

import java.util.Scanner;

//custom exception
class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}
public class ExceptionHandling {
    //method to divide two numbers
    public static int divide(int a, int b) {
        return a/b;
    }
    //method to check age using custom exception
    public static void CheckAge(int age) throws AgeException {
        if (age <= 18) {
            throw new AgeException("Age must be greater than 18");
        } else {
            System.out.println("Adult");
        }
    }
    //method to access array element
    public static void accessArrayElement(int arr[], int index) {
        System.out.println("Element at index " + index + " is " + arr[index]);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
        try {
            //divide
           System.out.println("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.println("Enter second number: ");
            int num2 = sc.nextInt();

            int result = divide(num1, num2);
            System.out.println("Result: " + result);
            
            //age check
            System.out.println("Enter age: ");
            int age = sc.nextInt();
            CheckAge(age);
            
            //access array element
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println("Enter array index to access: ");
            int index = sc.nextInt();
            accessArrayElement(arr, index);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        catch (AgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Error: Invalid index.");
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}