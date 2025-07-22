package strings;

public class StringDemo {
    public static void main(String[] args) {
        //string creation(literal vs new)
        String str1="Hello";
        String str2="Hello";
        String str3= new String("Hello");
        
        //equals vs ==
        //== check if reference variable point to same object
        //equals check the value of object
        System.out.println("str1==str2: " + (str1==str2));//true
        System.out.println("str1==str3: " + (str1==str3));//false
        System.out.println("str1.equals(str2): " + (str1.equals(str2)));//true

       //Immutability
       String a="Hello";
       a=a.concat(" world");
       System.out.println("After concat: "+ a);

       //String methods
       String text = "Good morning";
       System.out.println("Length: " + text.length());
       System.out.println("Trimmed: " + text.trim());
       System.out.println("Uppercase: " + text.toUpperCase());
       System.out.println("Substring: " + text.substring(2, 7));
       System.out.println("Replaced: " + text.replace("morning", "evening"));
       System.out.println("Contains 'Good'? " + text.contains("Good"));
       System.out.println("Char at 5: " + text.charAt(5));
       System.out.println("Index of 'g': " + text.indexOf('g'));
      
       //split and loop
       String color="pink,blue,black";
       String[] colors = color.split(",");
        System.out.print("colors: ");
        for (String col : colors) {
            System.out.print(col + " ");
        }
        System.out.println();
    }
}
    
