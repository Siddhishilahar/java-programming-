import java.util.*;
public class Multiplication_table
{
    public static void main(String[] args) {
        int num,i;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        num=sc.nextInt();

        for(i=1;i<+11;i++)
        {
            System.out.println(num*i);
            
        } 
        
    }
}
