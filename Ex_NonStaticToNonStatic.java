class A
{
	public void show()
	{
		System.out.println("SHOW");
	}
	public void disp()
	{
		System.out.println("DISP");
	}
}
public class Ex_NonStaticToNonStatic
{
	public static void main(String s[])
	{
		A ob1 = new A();
		ob1.disp();
	}
}

