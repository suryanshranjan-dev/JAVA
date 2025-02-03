
package arraysinjava;
import java.util.*;

public class SecongLargestElement 
{
    public static void main(String args[])
    {
        int A[] = {3,9,7,8,12,6,15,5,4,10};
        
        int max1,max2;
        
        max1 = max2 = A[0];
        
        // To check 2nd Largest Element inside an Array: 
        
        for(int i=1;i<A.length;i++)
        {
            if(A[i] > max1)
            {
                max2 = max1;
                max1 = A[i];
            }
            else if(A[i] > max2)
                max2 = A[i];
        }
        System.out.print("Largest element inside Array is: "+max1+"\n");
        System.out.print("2nd Largest element inside Array is: "+max2+"\n");
        
        
        
    }
}
