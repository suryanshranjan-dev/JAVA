package arraysinjava;

import java.util.*;

public class RightRotateArray 
{
    public static void main(String args[])
    {
        // Program to Print Right Rotation of an Array:
        
        int A[] = {5,8,9,12,15,18};
        
        System.out.print("Array before rotation is: ");
        for(int x:A)
        {
            System.out.print(x+" ");
        }
        
        // Logic for Right Rotate:
        int temp = A[A.length-1];
        int i;
        for(i=A.length-1;i>0;i--)
            A[i] = A[i-1];
        
        A[i] = temp;
        
        System.out.print("\n\nArray after Right Rotation is: ");
        
        for(int x:A)
        {
            System.out.print(x+" ");
        }
            
            
    }
}
