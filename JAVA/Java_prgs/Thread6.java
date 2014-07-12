import java.io.*;

class MyThread implements Runnable
{
	Thread t;
	int cnt = 0;
	boolean test = true;
	MyThread(String name, int pri)
	{
		t = new Thread(this,name);
		t.setPriority(pri);
	}
	
	public void run()
	{
		while(test)
		{
			cnt++;
			try
			{
				Thread.sleep(2);
			}
			catch(InterruptedException ie)
			{}	
		}
	}

	public void start()
	{
		System.out.println(t.getName()+" is Started...");
		t.start();
	}

	public void stop()
	{
		test = false;
	}
}

class Thread6
{
	

	public static void main(String[] arg)
	{
		Thread t;
		System.out.println("Main Started...");
		t = Thread.currentThread();

		MyThread t1 = new MyThread("One",Thread.MIN_PRIORITY);
		MyThread t2 = new MyThread("Two",Thread.MAX_PRIORITY);
		//MyThread t3 = new MyThread("Three",Thread.MAX_PRIORITY);

		t1.start();
		t2.start();
		//t3.start();
	
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{}

		t1.stop();
		t2.stop();		
		//t3.stop();

		try
		{
			t1.t.join();
			t2.t.join();
			//t3.t.join();
		}
		catch(InterruptedException e)
		{}
			
		System.out.println("T-1 Thread: " + t1.t.isAlive() + " - "+t1.cnt);
		System.out.println("T-2 Thread: " + t2.t.isAlive() + " - "+t2.cnt);
		//System.out.println("T-3 Thread: " + t3.t.isAlive() + " - "+t3.cnt);
		System.out.println("Main Thread: " + t.isAlive());

		System.out.println("Main Exited....");
	}
}