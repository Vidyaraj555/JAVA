class A
{
		public A()
		{
			System.out.println("Class A");
		}
}
class B extends A
{
		public B()
		{
			super();
			System.out.println("Class B");
		}
}
public class Ex_SuperConstructor
{
		public static void main(String s[])
		{
			B ob1 = new B();
}
}

