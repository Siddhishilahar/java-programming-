import java.util.*;

public class distance 
{
    public static void main(String args[])
    {
        int km,f,cm,m;

        System.out.println("Enter distance in km:");
        Scanner sc= new Scanner(System.in);
        km=sc.nextInt();
        f=km*3275;
        cm=km*100000;
        m=km*1000;

        System.out.println("distance in feet is:"+f +"\t distance in centimeter is:"+cm +"\t distance in meter is:"+m);
    }
}






//m=km*1000 cm=km*100000 f=km*3275