//check first letter of string is vowel or consonant

import java.util.*;

public class Character
{
   public static void main(String args[])
   {
        char ch;
        System.out.println("\n Enter your name:");
        Scanner sc = new Scanner(System.in);
        
        ch=sc.next().charAt(0);

        if(ch=='A' || ch=='a' || ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o' || ch=='U' || ch=='u')
        
        System.out.println("\n vowel"+ch);

        else 
          
         System.out.println("\n  consonant"+ch);
    }
    
}
