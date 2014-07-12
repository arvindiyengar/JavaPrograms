import java.net.*;
import java.rmi.*;

public class MyServer1
{
	public static void main(String[] arg)
	{
		try 	
		{
			MyServerImpl1 asi1 = new MyServerImpl1();
			MyServerImpl asi = new MyServerImpl();
			Naming.rebind("MyS",asi);
			Naming.rebind("MyS1",asi1);
			System.out.println("Server Started...");
		}
		catch(Exception e)
		{
			System.out.println("Exception: "+e);
		}
	}
}
