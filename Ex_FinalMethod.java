class A
{
	public final void show()
	{
		System.out.println("If we declare method as final, it cannot be overriden");
	}
}
public class Ex_FinalMethod
{
	public static void main(String s[])
	{
		A ob1 = new A();
		ob1.show();
	}
}



