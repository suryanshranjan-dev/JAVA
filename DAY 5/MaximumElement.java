package arraysinjava;

import java.util.Scanner;

public class MaximumElement 
{
    public static void main(String[] args)
    {
        // Program to find maximum element inside an Array:
        
        int A[] = {3,9,7,8,12,6,15,5,4,10};
        
        int max = A[0];
        
        for(int i=1;i<A.length;i++)
        {
            if(A[i] > max)
                max = A[i];
        }
        System.out.print("Maximum element inside the Array is: "+max+"\n");
     }
}
