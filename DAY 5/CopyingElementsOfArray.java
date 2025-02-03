package arraysinjava;

import java.util.*;
public class CopyingElementsOfArray 
{
    public static void main(String args[])
    {
        // Program to copy elements of Array1 to other Array2 of same size:
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of an Array: ");
        byte size = s.nextByte();
        
        int []A = new int[size];
        
        System.out.println("Enter elements into the Array: ");
        for(int i=0;i<A.length;i++)
        {
            A[i] = s.nextInt();
        }
        
        System.out.print("Elements of an Array A is: ");
        for(int x:A)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        
        // Logic to copy one Array to another Array:
        
        int B[] = new int[size];
        
        int i;
        for(i=0;i<A.length;i++)
        {
            B[i] = A[i];
        }
        
        System.out.println("\nElements of Array A has Successfully Copied in Array B!");
        
        // Display Array B:
        System.out.print("Elements of an Array B is: ");
        for(int x:B)
        {
            System.out.print(x+" ");
        }
        
        System.out.println();
        
    }
}
