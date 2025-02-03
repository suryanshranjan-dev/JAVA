package arraysinjava;
import java.util.*;

public class LeftRotateArray 
{
    public static void main(String args[])
    {
        // Program to display Left Rotation of an Array:
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of an Array: ");
        int n = s.nextInt();
        
        int A[] = new int[n];
        
        System.out.println("\nEnter "+n+" elements into the Array: ");
        for(int i=0;i<A.length;i++)
        {
            A[i] = s.nextInt();
        }
        
        System.out.println();
        
        System.out.println("Array before Left-Rotation is: ");
        for(int x:A)
        {
            System.out.print(x+" ");
        }
        
        // Logic for left rotation:
        
        int temp = A[0];
        
        for(int i=0;i<A.length-1;i++)
        {
            A[i] = A[i+1];
        }
        A[A.length-1] = temp;
        
        // Printing the above array after left rotation:
        System.out.println("\nArray after Left Rotation is: ");
        for(int x:A)
        {
            System.out.print(x+" ");
        }
        
        s.close();
        
    }
}
