class A
{
	int x;
	public A()
	{
		x = 10;
	}
	public void disp(int x)
	{
		System.out.println("X in DISP = "+x);
		this.x = x+10;
	}
	public void show()
	{
		System.out.println("X in SHOW = "+x);
	}
}
public class Ex_This
{
	public static void main (String arg[])
	{
		A ob1 = new A();
		ob1.show();
		ob1.disp(11);
		ob1.show();
	}
}


