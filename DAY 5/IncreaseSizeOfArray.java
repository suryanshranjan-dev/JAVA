package arraysinjava;

public class IncreaseSizeOfArray 
{
    public static void main(String args[])
    {
        int[] A = {1,2,3,4,5};
        System.out.print("Size of Array A: "+A.length+"\n");
        System.out.println("Array A is: ");
        for(int x:A)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        
        int [] B = new int[2*A.length];
        
        // Logic for Increasing Size of Array B:
        
        // Copying elements of Array A in Array B:
        for(int i=0;i<A.length;i++)
        {
            B[i] = A[i];
        }
        
        A = B;  // A is the reference pointing to Array B, and previous Array A is Garbage Collected.
        B = null;
        
        // Print Array A using for-each Loop:
        System.out.println("Array A after Increasing size is: ");
        for(int x:A)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        
        System.out.println("Size of Array A is Successfully Increased! to "+A.length);
        
        
    }
}
