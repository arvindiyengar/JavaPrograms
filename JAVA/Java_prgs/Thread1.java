import java.io.*;

class Thread1
{
	public static void main(String[] arg)
	{
		Thread t = Thread.currentThread();
		System.out.println("Current Thread: "+t);

		t.setName("My First Thread...");

		System.out.println("After name Change: "+t);
		
		try
		{
			for(int i=0;i<5;i++)		
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted...");
		}
	}
}