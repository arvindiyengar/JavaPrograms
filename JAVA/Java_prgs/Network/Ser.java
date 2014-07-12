import java.io.*;
import java.net.*;
import java.util.*;

public class Ser 
{
	
	public static void main(String[] arg)
	{
		ServerSocket s;
		Socket c;
		DataInputStream in;
		PrintWriter out;
		try
		{
			s = new ServerSocket(5050);
			System.out.println("Server is waiting...");
			c = s.accept();
			
			in = new DataInputStream(c.getInputStream());
			out = new PrintWriter(c.getOutputStream(),true);

			out.println("Hi Client... Am Server Connected...");
			String str;
			while(true)
			{
				str = in.readLine();
				System.out.println("From Client: "+str);
				if(str.equals("bye"))
					break;
			}		
			c.close();
			s.close();
		}
		catch(Exception e)
		{}
	}
}