import mypackage.*;
import java.util.*;

public class TestStringOperations
{
    public static void main(String[] args) 
    {
        StringOperations o = new StringOperations();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input:");
        String text = sc.nextLine();
        o.toggle(text);
  
       // System.out.println("Inter a string:");
       // String text = sc.nextLine();
        o.wordcap(text);
    }
}
