import java.io.*;

public class Excep1
{
	public static void main(String[] args) 
	{
		int x =	20;
		int[] y = {4,2,0,8,0,6};
		
		for(int i=0;i<y.length;i++)
		{
			System.out.println("x/y: "+(x/y[i]));
		}

		System.out.println("\n\nEnd Of Exception...");	
	}
}