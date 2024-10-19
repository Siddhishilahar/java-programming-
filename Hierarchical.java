import java.util.*;
class Base
{
   int n1;
   
   Scanner sc = new Scanner(System.in);
   void insert()
   {
    System.out.println("enter a base value:");
    n1=sc.nextInt();
   }
}

class Derived1 extends Base
{
   int n2;

   void insert()
   {
    super.insert();
    System.out.println("enetr a derived value:");
   }
  
   void  pluse()
   {
    int add;
    add=n1+n2;
    System.out.println("addition of base and derived:");
   }
}

class Derived2 extends Base
{
    int n2;

    void getvalue()
    {
        System.out.println("enter a derived2 value:");
        n2=sc.nextInt();
    }

    void minus()
    {
        int sub;
        sub=n1-n2;
        System.out.println("substraction of base and derived value:");
    }
}

class Hierarchical
{
    public static void main(String[] args) 
    {
       Derived1 d1=new Derived1();
       Derived2 d2=new Derived2();
       d1.insert();
       d1.pluse();
       d2.insert();
       d2.getvalue();
       d2.minus();
    }
}
