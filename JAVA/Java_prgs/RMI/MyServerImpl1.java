import java.rmi.*;
import java.rmi.server.*;

public class MyServerImpl1 extends UnicastRemoteObject implements MyServerIntf1
{

	MyServerImpl1() throws RemoteException
	{}

	public double sub(double a, double b) throws RemoteException
	{
		return(a-b);
	}	
}
