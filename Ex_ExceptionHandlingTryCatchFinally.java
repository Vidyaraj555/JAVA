class A
{
	public void disp(int p1, int p2)
	{
		try
		{
			int p3;
			p3=p1/p2;
			System.out.println("Output: "+p3);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divided by zero");
		}
		finally
		{
			System.out.println("Finally of A");
		}
	}
}
public class Ex_ExceptionHandlingTryCatchFinally
{
	public static void main(String s[])
	{
		try
		{
			A ob1 = new A();
			ob1.disp(10, 2);
			ob1.disp(10, 0);
			ob1.disp(10, 5);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divided by zero in main");
		}
		finally
		{
			System.out.println("Finally of main");
		}
	}
}



