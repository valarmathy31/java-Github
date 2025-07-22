package arrays;

import java.util.Arrays;

public class ArraysDemo {
     public static void main(String[] args) {
        // one dimensional array
        System.out.println("1 D ARRAY: ");
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            System.out.println("num "+": "+ i);
        }
         System.out.println("------------------");
        // two dimensional array
        int[][] matrix = {
           {1 , 2},
           {3 , 4}
        };
        System.out.println("2 D ARRAY: ");
        for (int i = 0; i < matrix.length; i++) {
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------");
        //Utility methods
        int[] num={2,4,1,3,5};

        // copying the original array
        int[] copy = Arrays.copyOf(num,num.length);
        System.out.println("Copied array: " + Arrays.toString(copy));

        //sorting array
        Arrays.sort(num);
        System.out.println("Sorted array: " + Arrays.toString(num));

        //searching element in array
        int key=3;
        boolean found = false;
        for (int i = 0; i < num.length; i++) {
            if(num[i]==key){
                System.out.println("Element found at index: " + i);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Element not found");
        }
       
        //fill array with value
        Arrays.fill(num,10);
        System.out.println("Filled array: " + Arrays.toString(num));

        //comparing array
        int[] a = {1,2};
        int[] b = {3,4};
        System.out.println("Arrays.equals(a, b): " + Arrays.equals(a, b));

     }
}
