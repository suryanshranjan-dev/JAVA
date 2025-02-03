package arraysinjava;


public class Arrays2D 
{
    public static void main(String args[])
    {
        // 2 Dimensional Arrays Demonstration:
        
/*      Declaration of 2D Array: 
        Syntax: data-type Array-name[rows][columns];
        Example: int A[][];
        
*/
        
/*        // Create an 2D Array:
        // Type-1: 
        int A[][] = new int[5][5];
        
        // Type-2: initializing the 2D Array:
        int B[][] = {{1,2,3},{2,4,6},{1,3,5}}; // 3 rows and 3 columns.
        
        // Type-3: 
        int C[][];
            C = new int[3][4];
        
        // Type-4:     
        int[][] D = new int[2][2];
        
        // Type-5:
        int [][]E = new int[3][2];
        
        // Type-6:
        int []F[] = new int[4][5];
        
        // Type-7:
        int[] G,H[];
        // Here, G is a 1D Array, whereas H is a 2D Array.
        
*/        
        
       // To access the elements of a 2D Array:
       
        int B[][] = {{1,2,3},{2,4,6},{1,3,5}};
        
/*         Using Counter-Control For Loop:
        for(int i=0;i<B.length;i++)
        {
            for(int j=0;j<B[0].length;j++)
            {
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }
*/

        // Using For-each Loop to display all the elements in Array B:
/*        for(int x[]:B)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println();
        }
*/       
      
        // Declaring 2D Arrays using Jagged Array:
        int A[][];
            A = new int[3][];
            
        A[0] = new int[5];
        A[1] = new int[3];
        A[2] = new int[8];
        
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[i].length;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }





    }
}
