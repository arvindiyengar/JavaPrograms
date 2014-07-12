import java.io.*;

public class Excep8
{
	public static void main(String[] args) 
	{
		try
		{
			ArithmeticException a;
			a  = new ArithmeticException("ae");
			throw a;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception caught...");
		}

		System.out.println("\n\nEnd Of Exception...");	
	}
}