interface IA
{
	public void cal(int p1, int p2);
	public void disp();
}
class A implements IA
{
	int x,y;
	public void show()
	{
		System.out.println("X = " +x+" Y = "+y);
	}
	public void cal(int p1, int p2)
	{
		x=p1;
		y=p2;	
	}
	public void disp()
	{
		System.out.println("SUM = " + (x+y));
	}
}
public class Ex_Interface
{
	public static void main(String s[])
	{
		A ob1 = new A();
		ob1.cal(10,20);
		ob1.show();
		ob1.disp();
	}
}



