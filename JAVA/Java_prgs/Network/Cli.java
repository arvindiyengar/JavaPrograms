import java.io.*;
import java.net.*;

class Cli 
{
	
	public static void main(String[] arg)
	{
		Socket c;
		DataInputStream in,stdIn;
		String sName;
		InetAddress sAddr;
		PrintWriter out;
		try
		{
			stdIn = new DataInputStream(System.in);

			System.out.print("Enter Name of Server: ");
			sName = stdIn.readLine();
			sAddr = InetAddress.getByName(sName);

			c = new Socket(sAddr,5050);

//			c = new Socket(InetAddress.getLocalHost(),5050);

			System.out.println("Connected to Server...");

			
			in = new DataInputStream(c.getInputStream());
			out = new PrintWriter(c.getOutputStream(),true);

			System.out.println(in.readLine());
			System.out.println(InetAddress.getLocalHost());
			String str = "";
			while(true)
			{
				System.out.print("Enter For Client:(Say bye to exit): ");
				str=stdIn.readLine();
				out.println(str);
				if(str.equals("bye"))
					break;
			}
			c.close();
		}		
		catch(Exception e)
		{}
	}
}