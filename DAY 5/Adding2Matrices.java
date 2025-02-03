package arraysinjava;

import java.util.Scanner;

public class Adding2Matrices 
{
    public static void main(String args[])
    {
        // Program to add 2 Matrices using 2D Arrays: 
        
        Scanner s = new Scanner(System.in);
        
        int A[][] = new int[3][3];
        int B[][] = new int[3][3];
        int C[][] = new int[3][3];
        
        System.out.println("Enter values in Matrix A of (3x3): ");
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A.length;j++)
            {
                A[i][j] = s.nextInt();
            }
        }
        System.out.println();
        
        System.out.println("Enter values in Matrx B of (3x3): ");
        for(int i=0;i<B.length;i++)
        {
            for(int j=0;j<B.length;j++)
            {
                B[i][j] = s.nextInt();
            }
        }
        System.out.println();
        
        // Adding matrices A and B and storing in Matrix C:
        System.out.println("Sum of two Matrices A and B is: ");
        for(int i=0;i<C.length;i++)
        {
            for(int j=0;j<C.length;j++)
            {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
        
        
        
        
        
        
        
    }
}
