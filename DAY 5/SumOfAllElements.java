package arraysinjava;

import java.util.Scanner;

public class SumOfAllElements 
{
    public static void main(String args[])
    {
        // Program to find Sum of all elements inside an Array:
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of an Array: ");
        int n = s.nextInt();
        
        int A[];
            A = new int[n];
            
        
        System.out.println("\nEnter "+n+" elements in the Array: ");
        for(int i=0;i<A.length;i++)
        {
            A[i] = s.nextInt();
        }
        
        int sum=0;
        
        System.out.print("\nSum of All elements is: ");
        for(int x:A)
        {
            sum += x;
        }
        System.out.println(sum);
        
        
        
        
    }
}
