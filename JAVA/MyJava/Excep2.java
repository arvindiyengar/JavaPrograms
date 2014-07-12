import java.io.*;

public class Excep2
{
	public static void main(String[] args) 
	{
		int x =	20,i=0;
		int[] y = {4,2,0,8,0,6};
		
		try
		{
			for(i=0;i<y.length;i++)
			{
				System.out.println("x/y: "+(x/y[i]));
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by Zero Error: y="+y[i]);
		}

		System.out.println("\n\nEnd Of Exception...");	
	}
}