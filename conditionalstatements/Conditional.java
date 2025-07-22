
import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        
        //if 
        int age=25;
        if(age>18){
            System.out.println("Adult");
        }

        //if-else
        int Age=25;
        if(Age>18){
            System.out.println("Allowed");
        }
        else
        {
           System.out.println("Not Allowed");
        }

        //nested if-else
        int mark=85;
        if(mark>=90){
            System.out.println("Grade A");
        }
        else if (mark>=70) {
            System.out.println("Grade B");
        }
        else{
            System.out.println("Grade C");
        }
       
        //ternary operator
        int mark1=45;
        String result = (mark1>=90) ? "Grade A" : (mark1>=70) ? "Grade B" : "Grade C";
        System.out.println(result);

        //Switch
        int day = 2;
        switch(day){
            case 1:
              System.out.println("MONDAY");
              break;
            case 2:
              System.out.println("TUESDAY");
              break;
            default:
              System.out.println("Invalid day");
        }

        // consise switch
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day: ");
        int dayNum = sc.nextInt();
        String dayName = switch (dayNum) {
        case 1, 7 -> "Weekend"; 
        case 2, 3, 4, 5, 6 -> {
        yield "Weekday";
      }
      default -> "Invalid";
    };
    System.out.println("Day Name: " + dayName);
    sc.close();
  }
}

