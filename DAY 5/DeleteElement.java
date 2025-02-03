package arraysinjava;

import java.util.*;

public class DeleteElement 
{
    public static void main(String args[])
    {
        // Program to delete an element at given index in an Array: 
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the size of an Array: ");
        byte size = s.nextByte();
        
        int []A = new int[size];
        
        System.out.println("Enter elements into the Array: ");
        for(int i=0;i<A.length;i++)
        {
            A[i] = s.nextInt();
        }
        
        // Array display:
        System.out.println("Array is: ");
        for(int x:A)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        
        
        System.out.println("Enter index number (0-"+(A.length-1)+") to delete an element: ");
        int index = s.nextInt();
        
        int del = A[index];
        A[index] = 0;
        
        
        
        // Logic for Left rotate the elements after deletion, So, no vacant place should be there in an Array:
        
        int i;
        for(i=index;i<A.length-1;i++)
            A[i] = A[i+1];
        
        A[i] = 0;
        
        System.out.println();
        System.out.println(del+" is deleted Successfully!");
        System.out.println("\nArray after deleting element "+del+" is: ");
        for(int x:A)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        

        
    }
}
