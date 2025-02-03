package arraysinjava;

public class ReverseCopyingArray 
{
    public static void main(String args[])
    {
       // Program to Copy contents of Array-A in Array-B in Reverse Order:
        
        int[] A = {8,6,10,9,2,15,7,13,14,11};
        int []B = new int[10];
        
        for(int i=0,j=B.length-1;i<A.length;i++,j--)
        {
            B[j] = A[i];
        }
        
        System.out.println("Array A is: ");
        for(int x:A)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        
        System.out.println("\nArray A is Successfully Copied in Reverse Order! in Array B");
        
        System.out.println("\nArray B in Reverse Order is: ");
        for(int x:B)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        
    }
}
