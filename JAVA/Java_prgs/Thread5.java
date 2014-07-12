import java.io.*;
class DummyThread implements Runnable
{
	public void run()
	{
		System.out.println("Am Dummy Thread...");
	}
}
class MyThread implements Runnable
{
	Thread t;

	MyThread()
	{t=null;}
	MyThread(String name)
	{
		t = new Thread(this,name);
		t.start();
	}
	
	public void run()
	{

		System.out.println("Child Thread: "+Thread.currentThread()+" is Started...");
		try
		{
			for(int i=1;i<6;i++)
			{
				System.out.println("Child Thread: "+Thread.currentThread().getName()+": "+i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception Caught: "+e);
		}
		System.out.println("Exit of Child Thread: "+Thread.currentThread().getName());

	}
		
}
class Thread5
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

		Thread lt = new Thread(new DummyThread(),"Four");
		lt.start(); 

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