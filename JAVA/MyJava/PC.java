public class PC
{
   	public static void main(String[] args) 
   	{
      		SynchQ q = new SynchQ();
      		Producer p1 = new Producer(q);
		Consumer c1 = new Consumer(q);
      		p1.start(); 
      		c1.start();
   	}
}
class SynchQ 
{
   	private int contents;
   	private boolean available = false;

   	synchronized public int get() 
	{
      		if(!available) 
		{
         		try 
			{
				//System.out.println("get waiting...");
            			wait();
			}
			catch (InterruptedException e) 
	 		{}
		}
      	        available = false;
  		//System.out.println("Wake up put...");
		notify();
		return contents;
	}
        synchronized public void put(int value) 
	{
      		if(available) 
		{
         		try 
			{
            			wait();
          		}
         		catch (InterruptedException e) 
			{} 
      		}
      		contents = value;
      		available = true;
      		notify();
  	}
}

class Consumer extends Thread 
{
   private SynchQ sQ;

   public Consumer(SynchQ c) 
   {
      super("Consumer");
      sQ = c;
   }
   public void run() 
   {
      for (int i = 0; i < 10; i++) 
      {
            System.out.println("Consumer got: " + sQ.get());
      }
   }
}

class Producer extends Thread 
{
	private SynchQ sQ;

	public Producer(SynchQ c) 
	{
		super("Producer");
		sQ = c;
	}

	public void run() 
	{
		for (int i = 0; i < 10; i++) 
		{
			sQ.put(i);
			System.out.println("\tProducer put: " + i);
			try
	    		{
		 		Thread.sleep(500);
	    		}
	    		catch(InterruptedException ie)
	    		{}
		}
	}
}