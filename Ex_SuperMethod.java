class A
{
	int x;
	public A()
	{
		x=10;
	}
	public void disp()
	{
		System.out.println("X = " +x);
	}
}
class B extends A 
{
	int y;
	public B() 
	{
		y=20;
	}
	public void disp() 
	{
		super.disp();
		System.out.println("Y = " +y);
	}
}
class C extends B 
{
	int z;
	public C() 
	{
		z=30;
	}
	public void disp() 
	{
		super.disp();
		System.out.println("Z = " +z);
	}
}
public class Ex_SuperMethod 
{
	public static void main(String s[]) 
	{
		C ob1 = new C();
		ob1.disp();
	}
}

