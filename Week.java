//input no. and tell week day switch case

import java.util.*;
public class Week
{
    public static void main(String args[])
    {
        int num;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("\n Enter a day number:");
        num = sc.nextInt();

        switch(num)
        {
        case 1: 
                System.out.println("\n Today is Monday!");
                break;

        case 2:
                System.out.println("\n Today is Tuesday!");
                 break;

         case 3:
                 System.out.println("\n Today is Wednesday!");
                 break;

         case 4:
                System.out.println("\n Today is Thursday!");
                break;

        case 5:
                System.out.println("\n Today is Friday!");
                break;

        case 6:
                System.out.println("\n Today is Saturday!");
                break;

        case 7:
                System.out.println("\n Today is Sunday means fun day!");
                break;

        default: 
                System.out.println("\n Invalid num!");
       }
    }
}
