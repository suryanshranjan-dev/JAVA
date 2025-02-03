package arraysinjava;

import java.util.*;

public class InsertAnElement 
{
    public static void main(String args[])
    {
        // Program to insert an element at a given Index in an Array: 
        
        Scanner s = new Scanner(System.in);
        
        int[] A = new int[10];
        A[0] = 5;
        A[1] = 9;
        A[2] = 6;
        A[3] = 10;
        A[4] = 12;
        A[5] = 7;
        
        System.out.println("Array of size 10 is: ");
        for(int x:A)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        
        System.out.println("\nInsert an element: ");
        int e = s.nextInt();
        System.out.println("\nEnter index value: ");
        int index = s.nextInt();
        
        
        
        // Logic for inserting an element: 
        int i;
        for(i=5;i>=index;i--)
        {
            A[i+1] = A[i];
        }
        A[i+1] = e;
        
        
        
        //Print Array after Insertion:
        System.out.println("\nElement "+e+" inserted Successfully!");
        System.out.println("\nArray after inserting an element "+e+" at index "+index+" is: ");
        for(int x:A)
        {
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
