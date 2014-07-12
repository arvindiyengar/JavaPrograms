import java.io.*;

public class Excep5
{
	public static void main(String[] args) 
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
			/*catch(Exception e)
			{
				System.out.println("\nRun Time Error...");
			}*/
			catch(ArithmeticException e)
			{
				System.out.print("\nDivide by Zero Error: y="+y[i]);
				System.out.println(" And Continue with Next...\n");
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("\nNo more Element In Array...");
				break;
			}
			catch(Exception e)
			{
				System.out.println("\nRun Time Error...");
			}
			
		}

		System.out.println("\n\nEnd Of Exception...");	
	}
}