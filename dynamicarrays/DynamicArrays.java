package dynamicarrays;

import java.util.ArrayList;
import java.util.Arrays;

public class DynamicArrays {
    public static void main(String[] args) {
        //convert array to arraylist
        String[] arr = {"Valar","vicky","hari"};
        ArrayList<String> name = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Initial List (from Array): " + name);

        //add element
        name.add("deepti");
        System.out.println("after adding: "+ name);

        //add element at specific index
        name.add(3,"harsha");
        System.out.println("after adding element at index 3: " + name);

       // get element
       System.out.println("Element at index 1: "+ name.get(1));

       //set element
       name.set(1,"priyanka");
       System.out.println("After replacing: " + name);

       //remove element by index
       name.remove(3);
       System.out.println("After removing: "+ name);

       //remove object
       name.remove("deepti");
       System.out.println("After removing: "+ name);

       //contains element
       System.out.println("Contains Valar? " + name.contains("Valar"));

       //get index of value
        System.out.println("Index of hari: " + name.indexOf("hari"));

       //size 
       System.out.println("Size: " + name.size());

       //check if list is empty
       System.out.println("Is empty? " + name.isEmpty());

       //toString
       System.out.println("List as String: " + name.toString());

       //clear
        name.clear();
       System.out.println("After clear(): " + name);
       System.out.println("Is empty now? " + name.isEmpty());
    }
}
