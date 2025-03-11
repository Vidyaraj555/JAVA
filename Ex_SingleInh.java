class A 
{
	public A()
	{
		System.out.println("Constructor of class A");
	}
}
class B extends A
{
	public B()
	{
		System.out.println("Constructor of class B");
	}
}
public class Ex_SingleInh
{
	public static void main(String s[])
	{
		B ob1 = new B();
	}
}

