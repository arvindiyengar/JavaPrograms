import java.io.*;

class MyThread implements Runnable
{
	Thread t;

	MyThread(String name)
	{
		t = new Thread(this,name);
		System.out.println("Child Thread: "+t);
		t.start();
	}
	
	public void run()
	{
		try
		{
			for(int i=1;i<6;i++)
			{
				System.out.println("Child Thread: "+t.getName()+": "+i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception Caught: "+e);
		}
		System.out.println("Exit of Child Thread: "+t.getName());

	}
		
}
class Thread3
{
	public static void main(String[] arg)
	{
		Thread t = Thread.currentThread();
		t.setName("MainParentThread");
		System.out.println("Main Parent Thread: "+t);
		t.setPriority(10);

		new MyThread("One");
		new MyThread("Two");
		new MyThread("Three");

		try
		{
			for(int i=1;i<4;i++)		
			{
				System.out.println("Main Thread: "+t.getName()+": "+i);
				Thread.sleep(3000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted...");
		}
		System.out.println("Main Thread Exiting...");
	}
}