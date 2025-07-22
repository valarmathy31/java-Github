package loopingstatements;

public class Looping {
    public static void main(String[] args) {
        // for loop
       System.out.println("for loop: ");
       for(int i=1;i<=5;i++)
       {
        System.out.println(i);
       }
    
       // while loop
       System.out.println("While loop: ");
       int i=1;
       while(i<=5){
        System.out.println(i);
        i++;
       }

       // do-while loop
       System.out.println("Do-While loop: ");
       int j=1;
       do{
        System.out.println(j);
        j++;
       }
       while(j<=5);

       //Enhanched for each
       int[] numbers = {10,20,30,40,50};
       System.out.println("Enhanced for loop: ");
       for(int num : numbers)
       {
        System.out.println(num);
       }

       // Break
       System.out.println("Break Statement:");
        for (int x = 1; x <= 5; x++) {
            if (x == 3) {
                System.out.println("Breaking loop at x = " + x);
                break; 
            }
            System.out.println("x = " + x);
        }

        // Continue
        System.out.println("Continue Statement:");
        for (int y = 1; y <= 5; y++) {
            if (y == 3) {
              continue;
            }
            System.out.println("y = " + y);
        }
    }
}

