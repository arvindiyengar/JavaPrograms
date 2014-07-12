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

class Except2
{
	static void fun1(int a) throws MyException
	{
		System.out.println("Am in Fun1...");
		
		if(a>10)
		{
			MyException r = new MyException(a);
			throw r;
		
			/*throw new MyException(a)*/
		}		
		
		System.out.println("Normal Exit...");
	}
	static void fun2(int a) throws MyException
	{
		System.out.println("Am in Fun2...");
		fun1(a);
		System.out.println("printed in normal...");
	}
	public static void main(String[] arg)
	{
		try
		{
			fun2(1);
			fun2(11);
		}
		catch(Exception e)
		{
			System.out.println("Exception Caught in Main: "+e);
		}
		finally
		{
		}
		
	}
}
	
