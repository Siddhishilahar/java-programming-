class Base
{
    int num1;
    Base(int num)
    {
      num1=num;
      System.out.println("Base value:"+num1);
    }
}

class Derived extends Base
{
    int num2;
    Derived(int num,int n) 
    {  
        super(num);
        num2=n;
        System.out.println("Derived value:"+num2);
    }
}

class singleParameterizedConstractor
{
    public static void main(String[] args) {
        Derived d=new Derived(7,8);
        //Base b=new Base(8);
    }
}
