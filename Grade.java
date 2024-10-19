    //students marks 3 ,total,percentage,grade 75>=A, 60>=firstclass,50>=secondclass,40>=3rdclass else fails

import java.util.*;
public class Grade 
{
    public static void main(String args[])
    {
        String name;
        int m1,m2,m3,total;
        float per;

        System.out.println("\n enter your name:");

        Scanner sc=new Scanner(System.in);
        name = sc.next();

        System.out.println("\n enter your 1st sub marks:");
        m1 = sc.nextInt();

        System.out.println("\n enter your 2nd sub marks:");
        m2 = sc.nextInt();

        System.out.println("\n enter your 3rd sub marks:");
        m3 = sc.nextInt();

        total=m1+m2+m3;
        per=total/3;

        System.out.println("\n Total marks:"+total +"\n Percentage="+per);

        if(per>=75)
        {
            System.out.println("\n Distinction");
        }
        else if(per>=60)
        {
            System.out.println("\n First class");
        }
        else if(per>=50)
        {
            System.out.println("\n Second class");
        }
        else if(per>=40)
        {
            System.out.println("\n Thired class");
        }
        else
        {
            System.out.println("\n You are fail.Please try again");
        }

        
        





    }
}

