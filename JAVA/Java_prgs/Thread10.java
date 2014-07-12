import java.io.*;

class Account
{
	int aNo;
	double bal;
	Account(int a,double b)
	{
		aNo = a;
		bal = b;
	}
	void deposit(double amt)
	{
	}
	void viewBal()
	{
		System.out.println("\nBalance: "+bal);
	}
	synchronized void withdraw(double amt) 
	{
		double tmp;
		/* Read Amt */
		tmp = bal;
		
		try{ Thread.sleep(100); }
		catch(InterruptedException ie) {}

		/*Check*/
		if(amt>tmp)
		{
			System.out.println("\nInsufficient Balance...");
			return;
		}

		try{ Thread.sleep(100); }
		catch(InterruptedException ie) {}

		/*Debit*/
		tmp = tmp - amt;

		try{ Thread.sleep(100); }
		catch(InterruptedException ie) {}
		
		/*Update*/

		bal = tmp;
		
		System.out.println("\nTransaction Success...");
	}
}
	
class Customer implements Runnable
{
	double amt;
	int ttype;
	Account a;

	Thread t;

	Customer(Account acc,int type,double am)
	{
		a = acc;
		ttype = type;
		amt = am;
		t = new Thread(this);
		t.start();
	}
	
	public void run()
	{
		switch(ttype)
		{
			case 1: a.withdraw(amt);
				break;
			case 2: a.deposit(amt);
				break;
			case 3: a.viewBal();
				break;
		}
	}
	
}

class Thread10
{
	

	public static void main(String[] arg)
	{

		Account myAcc = new Account(101,1000);

		Customer c1 = new Customer(myAcc,1,500);
		Customer c2 = new Customer(myAcc,1,400);
		Customer c3 = new Customer(myAcc,1,350);

		
		try
		{ 
			c1.t.join();
			c2.t.join();
			c3.t.join();
		}
		catch(InterruptedException e)
		{}

		myAcc.viewBal();

		System.out.println("Main Exited....");
	}
}