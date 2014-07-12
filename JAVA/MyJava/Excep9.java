import java.io.*;

public class Excep9
{
	static void method() //throws ArithmeticException
	{
		int x=10,y=0;
		throw new ArithmeticException("aaA");
		//System.out.println("\n"+(x/y));
		//System.out.println("End of Program...");	
	}
	public static void main(String[] args) //throws Exception 
	{
	//	try
	//	{
			method();		
	//	}
	//	catch(Exception e)
	//	{
			System.out.println("Exception caught in main..");
	//	}
	}
}