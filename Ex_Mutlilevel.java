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
class C extends B
{
	public C()
	{
		System.out.println("Constructor of class C");
	}
}
public class Ex_Mutlilevel
{
	public static void main(String s[])
	{
		C ob1 = new C();
	}
}

