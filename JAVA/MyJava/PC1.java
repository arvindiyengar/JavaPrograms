public class PC1
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
   	synchronized public int get() 
	{
		return contents;
	}
        synchronized public void put(int value) 
	{
      		contents = value;
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
	    try
	    {
		 Thread.sleep(0);
	    }
	    catch(InterruptedException ie)
	    {}
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
				Thread.sleep(0);
			}
			catch(InterruptedException ie)
			{}
		}
	}
}