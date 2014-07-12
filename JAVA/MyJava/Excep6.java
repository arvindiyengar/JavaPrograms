import java.io.*;

public class Excep6
{
	static void method()
	{
		int x =	20,i=0;
		int[] y = {4,2,0,8,0,6};
		int len = y.length;		
	
		for(i=0;i<10;i++)
		{
			try
			{
				System.out.println("x/y: "+(x/y[i]));
			}
			catch(ArithmeticException e)
			{
				System.out.print("\nDivide by Zero Error: y="+y[i]);
				System.out.println(" And Continue with Next...\n");
			}
		
		}
		System.out.println("\nEnd of Method...");
	}
	public static void main(String[] args) 
	{
		try
		{
			method();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("\nNo More Elements in Array...");
		}
		catch(Exception e)
		{
			System.out.println("\nRuntime Error...");
		}
		System.out.println("\n\nEnd Of Exception...");	
	}
}