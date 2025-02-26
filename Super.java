// super() a method that exits there always within a constructor. its job is to call default constructor of parent/super class.
// if you want parameterized constructor to be called using super you have to mention it.
// every class in java extends an 'Object' class
// this() executes constructor of itself.
class A
{
    public A()
    {
        //super(); -> can't see but this exists
        System.out.println("in A");
    }
    public A(int x)
    {
        //super();
        System.out.println("in A parameterized");
    }
}

class B extends A 
{
    public B()
    {
        //super();
        System.out.println("in B");
    }

    public B(int x)
    {
        super(x);
        System.out.println("in B parameterized");
    }
}

public class Super
{
    public static void main (String a[])
    {
        B obj = new B(4);
    }
}