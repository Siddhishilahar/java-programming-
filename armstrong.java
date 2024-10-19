import java.util.*;
public class armstrong 
{
  public static void main(String args[])
  {
    int n,n1,sum=0,d;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number:");
    n=sc.nextInt();
    n1=n;
    while(n>0)
    {
        d=n%10;
        sum=sum+(d*d*d);
        n=n/10;
    }
    if(n1==sum)
    {
        System.out.println("n is an armstrong");
    }
    else 
    {
        System.out.println("n is not an armstrong");
    }
  }    
}
