import java.util.*;
public class factorial 
{
  public static void main(String args[])
  {
    int n,fact=1;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter any number:");
    n=sc.nextInt();

    while(n>=1)
    {
       fact=fact*n;
       n--;
    }
    System.out.println("Factoialr:"+fact);
  }    
}
