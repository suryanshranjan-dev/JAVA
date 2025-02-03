package arraysinjava;

import java.util.*;

public class SearchAnElement 
{
    public static void main(String args[])
    {
        int A[] = {3,9,7,8,12,6,15,5,4,10};
        
        System.out.println("Elements of an Array are: ");
        for(int x:A)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter element to search: ");
        int key = s.nextInt();
        
        // Using System.exit(0):
/*        for(int i=0;i<A.length;i++)
        {
            if(key == A[i])
            {
                System.out.println("Element \'"+key+"\' is found at index \'"+i+"\'");      
                System.exit(0);
            }
        }
        System.out.println("Sorry! "+key+" is not present inside the Array");
*/      

        // Using break Keyword:
        boolean found = false;
        for(int i=0;i<A.length;i++)
        {
            if(key == A[i])
            {
                System.out.println("Element \'"+key+"\' is found at index \'"+i+"\'");      
                found = true;
                break;
            }
        }
        
        if(!found)
        System.out.println("Sorry! "+key+" is not present inside the Array");
    }
}
