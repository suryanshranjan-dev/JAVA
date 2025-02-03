package arraysinjava;

import java.util.Scanner;

public class ModifyingElement 
{
    public static void main(String args[])
    {
        // Program to Modify an element into the Array:
        
        int A[] = {5,8,9,12,15,18};
        
        System.out.print("Array is: ");
        for(int x:A)
        {
            System.out.print(x+" ");
        }
        
        Scanner s = new Scanner(System.in);
        System.out.println("\n\nEnter an element: ");
        int e = s.nextInt();
        
        System.out.println("\nEnter index number to store "+e);
        int index = s.nextInt();
        
        A[index] = e;
        
        // Printing Array after modifying an Element: 
        System.out.print("\nArray after Modifying an element: ");
        for(int x:A)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println(e+" is Modified successfully! at index "+index);
    }
}
