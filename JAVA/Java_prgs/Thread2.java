import java.io.*;

class MyThread implements Runnable
{
	Thread t;

	MyThread()
	{
		t = new Thread(this,"MyThreadUsingRunnable");
		System.out.println("Child Thread: "+t);
		t.start();
	}

	MyThread(String name)
	{
		t = new Thread(this,name);
		System.out.println("Child Thread: "+t);
		t.start();
	}
	
	/*void Start()
	{
		t = new Thread(this,"MyThreadUsingRunnable");
		System.out.println("Child Thread: "+t);
		t.start();
	}*/

	public void run()
	{
		System.out.println("Child Thread started...");
		try
		{
			for(int i=1;i<6;i++)
			{
				System.out.println("Child Thread: "+t.getName()+": "+i);
				Thread.sleep(3000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception Caught: "+e);
		}
		System.out.println("Exit of Child Thread...");

	}
		
}
class Thread2
{
	public static void main(String[] arg)
	{
		Thread t = Thread.currentThread();
		t.setName("MainParentThread");
		System.out.println("Main Parent Thread: "+t);

		new MyThread();

		/*new MyThread("MyNewThread");*/

		/*new MyThread().Start();*/

		try
		{
			for(int i=1;i<6;i++)		
			{
				System.out.println("Main Thread: "+t.getName()+": "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted...");
		}
		System.out.println("Main Thread Exiting...");
	}
}