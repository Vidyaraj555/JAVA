interface IA
{
	public void cal(int p1, int p2);
	public void disp();
}
class A
{
	final int x;
	public A()
	{
		x = 55;
	}
	public void show()
	{
		System.out.println("Value of X = " +x);
	}
}
public class Ex_Final
{
	public static void main(String s[])
	{
		A ob1 = new A();
		ob1.show();
	}
}




