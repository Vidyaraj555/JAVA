public class Ex_Thread extends Thread
{
	public static void main(String s[])
	{
		Thread th = new Thread("My Thread"); 					
		System.out.println("value = "+th); 
		th.setName("Thread 1"); 
		th.setPriority(9); 
		System.out.println("Now Status = "+th);
	}
}      
