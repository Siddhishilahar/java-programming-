import java.util.*;
class Binary_mul
{
    public static void main(String []args)
    {
        long b1,b2,multiply=0;
        int digit,factor=1;

        Scanner sc=new Scanner(System.in);
        System.out.println("\n Enter first binary number:");
        b1=sc.nextLong();
        System.out.println("\n enter second binary number:");
        b2=sc.nextLong();

        //process b2 to calculate the product
        while(b2 != 0)
        {
           digit=(int)(b2 % 10);
           if(digit==1)
           {
            b1=b1*factor;
            multiply=binaryproduct((int)b1,(int)multiply);
           }
           else
           {
            b1=b1*factor;
           }
           b2=b2/10;
           factor=10;
        }
        //display product of two binary number
        System.out.print("Product of two binary numbers: " + multiply + "\n");
    }
    static int binaryproduct(int binary1, int binary2) {
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        int binary_prod_result = 0;
      
        while (binary1 != 0 || binary2 != 0) {
         sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2;
         remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2;
         binary1 = binary1 / 10;
         binary2 = binary2 / 10;
        }
      
        if (remainder != 0) {
         sum[i++] = remainder;
        }
        
        --i;
        
        while (i >= 0) {
         binary_prod_result = binary_prod_result * 10 + sum[i--];
        }
      
        return binary_prod_result;
       }

}