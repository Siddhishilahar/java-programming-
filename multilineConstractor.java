//MULTILINE INHERITANCE USING CONSTRUCTAR

class primary
{
    int n1;
    primary(int n1)
    {
        this.n1=n1;
        System.out.println("primary value:"+n1);
    }
}

class secondary extends primary
{
    int n2;
    secondary(int n1,int n2)
    {
        super(n1);
        this.n2=n2;
        System.out.println("secondary value:"+n2);
    }
}

class multilineConstractor
{
    public static void main(String[] args) {

        secondary s=new secondary(29,8);
    }
}