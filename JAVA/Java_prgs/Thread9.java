import java.io.*;


class Five implements Runnable
{
	Thread t;
	Five(String s)
	{
		t = new Thread(this,s);
	}
	
	public void run()
	{
		try
		{
			for(int i=1;i<16;i++)
			{
				System.out.println(t.getName() + ": " +i+" * "+5+" = "+(i*5));
				Thread.sleep(200);
			}
		}
		catch(InterruptedException e)
		{}
	}

	public void start()
	{
		System.out.println(t.getName()+" is Started...");
		t.start();
	}

}

class Thread9
{
	

	public static void main(String[] arg)
	{
		Thread t;
		System.out.println("Main Started...");
		t = Thread.currentThread();

		Five t1 = new Five("One");
		Five t2 = new Five("Two");

		t1.start();
		t2.start();

		try
		{
			Thread.sleep(1000);
			t1.t.suspend();
			System.out.println("Suspending Thread One...");
			Thread.sleep(1000);
			t1.t.resume();
			System.out.println("Resuming Thread One...");

			Thread.sleep(1000);
			t2.t.suspend();
			System.out.println("Suspending Thread Two...");
			Thread.sleep(1000);
			t2.t.resume();
			System.out.println("Resuming Thread Two...");
		}
		catch(InterruptedException e)
		{}



		try

		{
			t1.t.join();
			t2.t.join();

		}
		catch(InterruptedException e)
		{}
			
		System.out.println("T-1 Thread: " + t1.t.isAlive());
		System.out.println("T-2 Thread: " + t2.t.isAlive());
		System.out.println("Main Thread: " + t.isAlive());

		System.out.println("Main Exited....");
	}
}