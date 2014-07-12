import java.io.*;

class MyException extends Exception
{
	private int x;

	MyException(int d)
	{
		x=d;
	}

	public String toString()
	{
		return("Except.MyException : "+x);
	}
}

class Except
{
	static void fun(int a) throws MyException
	{
		System.out.println("Am in Fun...");
		
		if(a>10)
		{
			MyException r = new MyException(a);
			throw r;
		
			/*throw new MyException(a)*/
		}		
		
		System.out.println("Normal Exit...");
	}
	public static void main(String[] arg)
	{
		try
		{
			fun(1);
			fun(11);
		}
		catch(Exception e)
		{
			System.out.println("Exception Caught in Main: "+e);
		}
	}
}
	
