import java.io.*;

public class Excep3
{
	public static void main(String[] args) 
	{
		int x =	20,i=0;
		int[] y = {4,2,0,8,0,6};
		
		for(i=0;i<y.length;i++)
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

		System.out.println("\n\nEnd Of Exception...");	
	}
}