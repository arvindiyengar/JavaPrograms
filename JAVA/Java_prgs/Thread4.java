import java.io.*;

class MyThread extends Thread
{

	MyThread()
	{
		super("MyThreadUsingThread");
		System.out.println("Child Thread: "+this);
		start();
	}

	MyThread(String name)
	{
		super(name);
		System.out.println("Child Thread: "+this);
		start();
	}
	
	/*void Start()
	{
		t = new Thread(this,"MyThreadUsingRunnable");
		System.out.println("Child Thread: "+t);
		t.start();
	}*/

	public void run()
	{
		try
		{
			for(int i=1;i<6;i++)
			{
				System.out.println("Child Thread: "+this.getName()+": "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception Caught: "+e);
		}
		System.out.println("Exit of Child Thread...");

	}
		
}
class Thread4
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
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted...");
		}
		System.out.println("Main Thread Exiting...");
	}
}