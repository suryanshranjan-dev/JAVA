package arraysinjava;

public class Multiplying2Matrices 
{
    public static void main(String[] args)
    {
        // Program to Multiply 2 Matrices of order 3x3:
        
        // Condition for multiplying 2 matrices is:
        // No. of columns of 1st Matrix = No. of Rows of 2nd Matrix
        
        int A[][] = {{3,5,9},{7,6,2},{4,3,5}};
        int B[][] = {{1,0,0},{0,1,0},{0,0,1}}; // Identity Matrix
        int C[][] = new int[3][3];
        
        // Display 1st Matrix:
        System.out.println("Matrix A:");
        for(int x[]:A)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        // Display 2nd Matrix:
        System.out.println("Matrix B: ");
        for(int x[]:B)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        // Logic to Multiply to Matrices and store it in 3rd Matrix:
        for(int i=0;i<C.length;i++)
        {
            for(int j=0;j<C.length;j++)
            {
                C[i][j] = 0;
                for(int k=0;k<C.length;k++)
                {
                    C[i][j] = C[i][j] + A[i][k] * B[k][j];
                }
            }
        }
        
        // Print Matrix C:
        System.out.println("Multiplication of 2 matrices is: ");
        for(int x[]:C)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println();
        }
        
    }
}
