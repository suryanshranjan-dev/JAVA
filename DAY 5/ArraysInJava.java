package arraysinjava;
import java.util.Scanner;
public class ArraysInJava 
{
    public static void main(String[] args) 
    {
        // Arrays: Collection of similar data items/elements.
        // Ex: X = [8,3,5,4,9,12]
        
        // In java, every array is an Object.
        
        /* Declaration of an Array:
        
        Type 1: int A[] = new int[5];  
                 
        Type 2: int A[] = {1,2,3,4,5}; (size is automatically allocated)
        
        Type 3: int C[];
                C = new int[10];
        
        Type 4: int []D = new int[15];
        
        Type 5: int[] E = new int[10];
        
        */
        
              
        // array_name.length is the property used to know total number of elements in an Array.
        
      int A[] = new int[5]; 
      int B[] = {1,2,3,4,5}; 
      // In array B At index 2, i want to place value 15.
      B[2] = 15;
      
      // To display Array A[]: we use for loop mostly:
        System.out.print("Array A: ");
      for(int i=0;i<A.length;i++)
      {
          System.out.print(A[i]+" ");
      }
        System.out.println();
      
      // To display Array B[]: 
        System.out.print("Array B: ");
      for(int i=0;i<B.length;i++)
      {
          System.out.print(B[i]+" ");
      }
        
      // display elements of an Array A using while loop:
/*        System.out.println();
        
        System.out.println("Using While loop: Array A ");
      int j=0;
      while(j<A.length)
      {
          System.out.print(A[j]+" ");
          j++;
      }
*/    

      // display elements of an Array B using do while loop:
/*        System.out.println();
        
        System.out.println("Using do while: Array B");
        int k=0;
        do
        {
            System.out.print(B[k]+" ");
            k++;
        }while(k<B.length);
*/        
     


    // To print elements of an Array, we can use For-each loop as well.
    // Printing elements of Array A with some values:
        A[2] = 99;
        A[4] = 69;
        
        /* Syntax for for each loop:
            
            for(int x:A)
            {
                System.out.println("For each loop syntax!");
            }
        
            1. x is pointing to an element inside an Array.
            2. A is the name of the Array.
        */
        System.out.println();
        System.out.println("Using for-each loop: Array A");
        for(int x:A)
        {
            System.out.print(x+" ");
        }   
        
        System.out.println("\n");
        
        
        
        
        // Taking input values from the user for array creation:
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter Size of an Array: ");
        int n = s.nextInt();
        
        int arr[] = new int[n];
        
        System.out.println("Enter "+n+" elements into the Array: ");
        // to enter values into the array, we use counter controlled For Loop.
        
        for(int a=0;a<arr.length;a++)
        {
            arr[a] = s.nextInt();
        }
        
        // Displaying values entered by user inside Array:
        System.out.println("Array is: ");
        
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
        
        
        
        
    }    
}
