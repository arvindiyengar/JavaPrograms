import java.io.*;

public class Excep7
{
	static void method()
	{
		int x =	20,i=0;
		int[] y = {4,2,0,8,0,6};
		int len = y.length;		
		try
		{
			for(i=0;i<10;i++)
			{
				try
				{
					System.out.println("\nx/y: "+(x/y[i]));
				}
				catch(ArithmeticException e)
				{
					System.out.print("\nDivide by Zero Error: y="+y[i]);
					System.out.println(" And Continue with Next...\n");
				}
				System.out.println("Inner Try...");
			}
			System.out.println("\nOut of For Loop...");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("\nArray Out Error..");
		}
		System.out.println("\nEnd of Method...."); 
	}
	public static void main(String[] args) 
	{
		try
		{
			method();
		}
		catch(Exception e)
		{
			System.out.println("\nRun Time Error...");
		}
		System.out.println("\n\nEnd Of Exception...");	
	}
}