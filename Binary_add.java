import java.util.*;
class Binary_add
{
    public static void main(String args[])
    {
        Long b1,b2;
        int sum[]=new int[10];
        int i=0,carry=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("\n Enter first binary number:");
        b1 = sc.nextLong();
        System.out.println("\n Enter second binary number:");
        b2 = sc.nextLong();
        
        //perform binary addition while there are digits in the binary numbers
        while(b1 != 0 || b2 != 0)
        {
           //calculate the sum of binary digits and update remainder/carry
            sum[i++]=(int)((b1 % 10 + b2 % 10 + carry) % 2);
           carry=(int)((b1 % 10 + b2 % 10 + carry) / 2);
           b1=b1/10;
           b2=b2/10;
        }

     //if there is remaining carry, add it to the sum
     if(carry != 0)
     {
        sum[i++]=carry;
     }

     //decrement the index to prepare for printing
     --i;

    System.out.println("sum of the two binary numbers:");
    while(i>=0)
    {
        System.out.print(sum[i--]);
    }
    }
}