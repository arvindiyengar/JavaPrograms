import java.io.*;

class Resource
{
	synchronized void myRes(String msg)
	{
		System.out.print("["+msg);
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{}
		System.out.println("]");
	}
}
	
class MyThread implements Runnable
{
	String msg;
	Resource r;
	Thread t;
	MyThread(Resource res, String s)
	{
		r = res;
		msg = s;
		t = new Thread(this,s);
	}
	
	public void run()
	{
		r.myRes(msg);
	}

	public void start()
	{
		System.out.println(t.getName()+" is Started...");
		t.start();
	}

}

class Thread7
{
	

	public static void main(String[] arg)
	{
		Thread t;
		System.out.println("Main Started...");
		t = Thread.currentThread();

		Resource r = new Resource();
		Resource r1 = new Resource();

		MyThread t1 = new MyThread(r,"One");
		MyThread t2 = new MyThread(r1,"Two");
		MyThread t3 = new MyThread(r1,"Three");
		MyThread t4 = new MyThread(r1,"Four");

		t1.start();
		t2.start();
		t3.start();
		t4.start();

/*		for(int i=0;i<5;i++)
			System.out.println(i);
	*/
		try
		{
			t1.t.join();
			t2.t.join();
			t3.t.join();
			t4.t.join();
		}
		catch(InterruptedException e)
		{}
			
		System.out.println("T-1 Thread: " + t1.t.isAlive());
		System.out.println("T-2 Thread: " + t2.t.isAlive());
		System.out.println("T-3 Thread: " + t3.t.isAlive());
		System.out.println("T-4 Thread: " + t4.t.isAlive());
		System.out.println("Main Thread: " + t.isAlive());

		System.out.println("Main Exited....");
	}
}