import java.io.*;

public class Excep10
{
	static void method() throws Exception
	{
		System.out.println("Inside Method...");
		//throw new ArithmeticException("AE");
		//throw new IllegalAccessException("IAE");
		//throw new ArrayIndexOutOfBoundsException("AIOBE");
		throw new ClassNotFoundException("CNFE");
	}
	public static void main(String[] args) 
	{
		try
		{
			method();
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e);
		}
	}
}