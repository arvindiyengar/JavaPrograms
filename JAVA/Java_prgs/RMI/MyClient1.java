import java.net.*;
import java.rmi.*;

public class MyClient1
{
	public static void main(String[] arg)
	{
		try 	
		{
			String sName = "rmi://"+arg[0]+"/MyS";
			String sName1 = "rmi://"+arg[0]+"/MyS1";

			MyServerIntf asif = (MyServerIntf)Naming.lookup(sName);
			MyServerIntf1 asif1 = (MyServerIntf1)Naming.lookup(sName1);
			
			double d1=20,d2=40;

			System.out.println("Addition: "+asif.add(d1,d2));
			System.out.println("Sub: "+asif1.sub(d1,d2));

		}
		catch(Exception e)
		{
			System.out.println("Exception: "+e);
		}
	}
}
