package switchcase.injava;

import java.util.*;

public class SwitchMonth 
{
    public static void main(String args[])
    {
    // Program to display name of a month based on number.
    
        Scanner s = new Scanner(System.in);
        int mno;
        System.out.println("Enter Month number: ");
        mno=s.nextInt();
        
        switch(mno)
        {
            case 1: System.out.println("Its January");
            break;
            case 2: System.out.println("Its February");
            break;
            case 3: System.out.println("Its March");
            break;
            case 4: System.out.println("Its April");
            break;
            case 5: System.out.println("Its May");
            break;
            case 6: System.out.println("Its June");
            break;
            case 7: System.out.println("Its July");
            break;
            case 8: System.out.println("Its August");
            break;
            case 9: System.out.println("Its September");
            break;
            case 10: System.out.println("Its October");
            break;
            case 11: System.out.println("Its November");
            break;
            case 12: System.out.println("Its December");
            break;
            default: System.out.println("Invalid Month number given. Kindly, Check again!");
        }
    }
}
