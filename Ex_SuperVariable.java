class A
{
	int x;
	public A()
	{
		x=10;
	}
	public void show()
	{
		System.out.println("X = " +x);
	}
}
class B extends A
{
	int x;
	public B()
	{
		x=30;
	}
	public void disp()
	{
		System.out.println("SUM = " + (super.x + x));
	}
}
public class Ex_SuperVariable
{
	public static void main(String s[])
	{
		B ob1 = new B();
		ob1.disp();
	}
}


